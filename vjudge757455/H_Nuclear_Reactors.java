import java.util.*;
import java.io.*;
import java.math.*;

public class H_Nuclear_Reactors {

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
        int k = in.nextInt();
        int a = in.nextInt();

        for(int i = 0; i < n; i++) {
            if (i < n - 1) { 
                out.printf("%d ", a % (k + 1));
            } else {
                out.printf("%d\n", a % (k + 1));
            }
            a /= k + 1;
        }

    }
}
