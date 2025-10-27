import java.util.*;
import java.io.*;
import java.math.*;

public class G_Steps {

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
        long x = in.nextInt();
        long y = in.nextInt();

        long currX = in.nextInt();
        long currY = in.nextInt();

        long k = in.nextInt();
        long step = 0;
        for(int i = 0; i < k; i++) {
            long a = in.nextInt();
            long b = in.nextInt();

            long temp = Long.MAX_VALUE;
            if (a > 0) {
                long relative = (x - currX)/ a;
                temp = Math.min(temp, relative);
            } else if (a < 0) {
                long relative = (currX - 1)/a*-1;
                temp = Math.min(temp, relative);
            }

            if (b > 0) {
                long relative = (y - currY)/ b;
                temp = Math.min(temp, relative);
            } else if (b < 0) {
                long relative = (currY - 1)/b*-1;
                temp = Math.min(temp, relative);
            }
            step += temp;

            currX += temp * a;
            currY += temp * b;
        }

        out.println(step);
    }
}
