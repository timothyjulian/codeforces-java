import java.util.*;
import java.io.*;
import java.math.*;

public class D_Tung_Tung_Sahur {

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
        String p = in.nextLine();
        String s = in.nextLine();

        char[] pArr = p.toCharArray();
        char[] sArr = s.toCharArray();

        int i = 0;
        int j = 0;
        while (i < pArr.length && j < sArr.length) {
            char ori = pArr[i];
            char sound = sArr[j];
            if (ori != sound) {
                out.println("NO");
                return;
            }
            if (j + 1 < sArr.length && sArr[j+1] == ori) {
                j++;
            }
            i++;
            j++;
        }

        if (i != pArr.length || j != sArr.length) { 
            out.println("NO");
        } else {
            out.println("YES");
        }
    }
}
