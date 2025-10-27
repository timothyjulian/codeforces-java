import java.io.*;
import java.util.*;

public class J_Firefly {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        FastReader in = new FastReader();

        int n = in.nextInt();
        int h = in.nextInt();

        int[] bottom = new int[h + 2];
        int[] top = new int[h + 2];

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (i % 2 == 0) bottom[x]++;
            else top[x]++;                      
        }

        out.println(Arrays.toString(bottom));
        out.println(Arrays.toString(top));

        for (int i = h - 1; i >= 1; i--) {
            bottom[i] += bottom[i + 1];
            top[i] += top[i + 1];
        }
        out.println(Arrays.toString(bottom));
        out.println(Arrays.toString(top));

        int minHits = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 1; i <= h; i++) {
            int hits = bottom[i];
            hits += top[h - i + 1];

            if (hits < minHits) {
                minHits = hits;
                count = 1;
            } else if (hits == minHits) {
                count++;
            }
        }

        out.printf("%d %d\n", minHits, count);
        out.flush();
    }
}
