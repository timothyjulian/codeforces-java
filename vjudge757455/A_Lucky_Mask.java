import java.util.*;
import java.io.*;
import java.math.*;

public class A_Lucky_Mask {

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
        int a = in.nextInt();
        // out.println(a);
        int b = in.nextInt();

        a++;
        while (a <= Integer.MAX_VALUE) {
            int dec = 0;
            int num = 0;
            int temp = a;
            while (temp != 0) {
                if (temp % 10 == 4 || temp % 10 == 7) { 
                    num += Math.pow(10, dec) * (temp % 10);
                    dec++;
                }
                temp = temp / 10;
            }
            // out.printf("%d %d\n", a, num);
            if (num == b) {
                out.println(a);
                break;
            }
            a++;
        }

    }
}
