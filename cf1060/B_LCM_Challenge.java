import java.util.*;
import java.io.*;
import java.math.*;

public class B_LCM_Challenge {

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
        long a = in.nextLong();

        if (a == 1) {
            out.println(1);
            return;
        } else if (a == 2) {
            out.println(2);
            return;
        }


        if (a % 2 == 1) { 
            out.println(a * (a - 1) * (a - 2));
        } else {
            if (a % 3 != 0) { 
                out.println(a * (a - 1) * (a - 3));
            } else {
                out.println((a - 1) * (a - 2) * (a - 3));
            }
        }
    }
}
