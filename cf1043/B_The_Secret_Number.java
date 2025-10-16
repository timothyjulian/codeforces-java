import java.util.*;
import java.io.*;
import java.math.*;

public class B_The_Secret_Number {

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
        long n = in.nextLong();
        long temp = 10;
        List<Long> ans = new ArrayList<>();
        while (temp + 1 <= n) {
            if (n % (temp + 1) == 0) {
                ans.add(n / (temp + 1));
            }
            temp *= 10;
        }
        out.println(ans.size());
        for(int i = ans.size()-1; i >= 0; i--) {
            if (i != 0) {
                out.print(ans.get(i) + " ");
            } else {
                out.println(ans.get(i));
            }
        }
    }
}
