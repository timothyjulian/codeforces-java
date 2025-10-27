import java.util.*;
import java.io.*;
import java.math.*;

public class D_History {

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

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        FastReader in = new FastReader();

        int t = 1;
        // t = in.nextInt();

        while (t-- > 0) {
            solve(in);
        }

        out.flush();
    }

    static void solve(FastReader in) {
        // Solve here
        int n = in.nextInt();
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            list.add(new int[]{x, y});
        }

        list.sort((a, b) -> Integer.compare(a[0], b[0]));

        // for(int[] a : list) {
        //     out.println(Arrays.toString(a));
        // }

        int count = 0;
        int a = list.get(0)[0];
        int b = list.get(0)[1];
        for(int i = 1; i < n; i++) {
            int[] curr = list.get(i);
            if (curr[1] < b) {
                count++;
            } else {
                a = curr[0];
                b = curr[1];
            }
        }

        out.println(count);

    }
}
