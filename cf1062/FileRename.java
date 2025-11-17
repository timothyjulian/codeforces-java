import java.util.*;
import java.io.*;
import java.math.*;

public class FileRename {

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
        String newS = in.nextLine();
        String oldS = in.nextLine();

        int diff = oldS.length() - newS.length();
        if (diff < 0) {
            out.println(0);
            return;
        }

        int ans = 0;
        for(int i = 0; i + diff <= oldS.length(); i++) {
            // out.println("i+diff: " + (i+diff));
            String prefix = oldS.substring(0, i);
            // out.println("prefix:" + prefix);
            String suffix = oldS.substring(i+diff);
            // out.println("suffix:" + suffix);
            String temp = prefix + suffix;
            if (newS.equals(temp)){
                ans++;
                ans %= 1000000007;
            }
        }
        out.println(ans);
    }
}
