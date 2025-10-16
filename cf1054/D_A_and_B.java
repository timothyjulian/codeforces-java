import java.util.*;
import java.io.*;
import java.math.*;

public class D_A_and_B {

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
        int n = in.nextInt();
        String s = in.next();
        char[] sArr = s.toCharArray();

        long ans = calculate(sArr);
        for(long i = 0; i < sArr.length; i++) {
            if (sArr[(int) i] == 'a') {
                sArr[(int)i] = 'b';
            } else {
                sArr[(int) i] = 'a';
            }
        }

        // out.println(sArr);

        out.println(Math.min(ans, calculate(sArr)));
    }

    static long calculate(char[] s) {
        long count = 0;
        long ans = 0;
        long db = 0;

        for(char x: s) {
            if (x == 'a') {
                count++;
            }
        }

        for(char x: s) {
            if (x == 'a') {
                db++;
            } else {
                ans += Math.min(db, count - db);
            }
            // out.printf("count: %d db: %d ans: %d\n", count, db, ans);
        }

        return ans;
    }
}
