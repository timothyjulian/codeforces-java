import java.util.*;
import java.io.*;
import java.math.*;

public class D_Yet_Another_Array_Problem {

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
        t = in.nextInt();

        while (t-- > 0) {
            solve(in);
        }

        out.flush();
    }

    static void solve(FastReader in) {
        // if there is an ODD number just output 2
        long n = in.nextLong();
        long gcd = 0;
        for(long i = 0; i < n; i++) {
            long curr = in.nextLong();
            gcd = findGCD(gcd, curr);
        }

        int x = 2;
        while (findGCD(gcd, x) != 1) {
            x++;
        }

        out.println(x);
    }

    static long findGCD(long a, long b) {
        if (a == 0)
            return b;
        return findGCD(b % a, a);
    }
}
