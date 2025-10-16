import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_Incremental_Subarray {

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
        int fav = in.nextInt();
        int[] favArr = new int[fav];
        boolean strictIncrease = true;
        int max = 0;
        for(int i = 0; i < fav;i++) {
            favArr[i] = in.nextInt();
            if (i > 0 && strictIncrease == true) {
                strictIncrease = favArr[i] - 1 == favArr[i-1];
            }
            max = Math.max(max, favArr[i]);
        }

        // out.println(strictIncrease);
        if (!strictIncrease) {
            out.println(1);
            return;
        } else {
            out.println(n - max + 1);
        }
        // out.println(Arrays.toString(favArr));
    }
}
