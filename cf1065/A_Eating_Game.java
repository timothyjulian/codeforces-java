package cf1065;
import java.util.*;
import java.io.*;
import java.math.*;

public class A_Eating_Game {

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
        int max = 0;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            int a = in.nextInt();
            max = Math.max(max, a);
            arr[i] = a;
        }

        int ans = 0;
        for(int i = 0; i < n; i++) {
            if (arr[i] == max) {
                ans++;
            }
        }

        out.println(ans);

    }
}
