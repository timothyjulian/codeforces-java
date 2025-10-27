import java.util.*;
import java.io.*;
import java.math.*;

public class F_Dishonest_Sellers {

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
        int n = in.nextInt();
        int k = in.nextInt();
        int[] currPrice = new int[n];
        int[] afterPrice = new int[n];
        for(int i = 0; i < n; i++) {
            currPrice[i] = in.nextInt();
        }

        for(int i = 0; i < n; i++) {
            afterPrice[i] = in.nextInt();
        }

        // out.println(Arrays.toString(currPrice));
        // out.println(Arrays.toString(afterPrice));

        List<int[]> diffPrice = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int diff = afterPrice[i] - currPrice[i];
            int index = i;
            diffPrice.add(new int[]{diff, index});
        }

        int positiveCount = 0;
        for(int i = 0; i < n; i++) {
            if (diffPrice.get(i)[0] > 0) {
                positiveCount++;
            }
        }

        Collections.sort(diffPrice, (a, b) -> Integer.compare(b[0], a[0]));

        // for(int i = 0; i < diffPrice.size(); i++) {
        //     out.println(Arrays.toString(diffPrice.get(i)));
        // }

        int price = 0;


        k = Math.max(positiveCount, k);
        // out.printf("k: %d\n", k);
        for(int i = 0; i < k; i++) {

            // out.printf("diff index: %d, i:%d, k:%d\n", diffPrice.get(i)[1], i, k);
            price += currPrice[diffPrice.get(i)[1]];
        }

        for(int i = k; i < n; i++) {
            price += afterPrice[diffPrice.get(i)[1]];
        }

        out.println(price);
    }
}
