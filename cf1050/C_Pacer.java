import java.util.*;
import java.io.*;
import java.math.*;

public class C_Pacer {

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
        int m = in.nextInt();
        int start = 0;
        int side = 0;
        int point = 0;
        for(int i= 0; i < n; i++) {
            int min = in.nextInt();
            int reqSide = in.nextInt();
            int diff = min - start;
            if (diff % 2 == 0) {
                if (side == reqSide) {
                    point += diff;
                } else {
                    point += diff -1;
                }
            } else {  
                if (side == reqSide) {
                    point += diff - 1;
                } else {
                    point += diff;
                }
            }
            start = min;
            side = reqSide;
        }

        if (m - start > 0) {
            point += m - start;
        }

        out.println(point);
    }
}
