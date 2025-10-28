import java.util.*;
import java.io.*;
import java.math.*;

public class C_Brr_Brrr_Patapim {

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
        int ans[] = new int[2*n];
        int map[] = new int[2*n+1];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                int pIndex = i + j - 1;
                ans[pIndex] = in.nextInt();
                map[ans[pIndex]]++;
            }
        }

        for(int i = 1; i <= 2 * n; i++) {
            if (map[i] == 0) {
                ans[0] = i;
                break;
            }
        }

        for(int i = 0; i < ans.length; i++) {
            if (i == ans.length - 1) { 
                out.printf("%d\n", ans[i]);
            } else {
                out.printf("%d ", ans[i]);
            }
        }

        // out.printf("%s\n", Arrays.toString(ans));
        // out.printf("%s\n", Arrays.toString(map));
    }
}
