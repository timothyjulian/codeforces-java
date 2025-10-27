import java.util.*;
import java.io.*;
import java.math.*;

public class A_Notelock {

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
        int k = in.nextInt();
        String bin = in.nextLine();

        char[] binArr = bin.toCharArray();
        boolean[] protArr = new boolean[n];

        int count = 0;
        for(int i = 0; i < n; i++){
            int lookup = Math.min(n-1, i+k-1);
            // if (protArr[i] == true) {
            //     continue;
            // }             

            // out.printf("%d %d %d\n", lookup, i, count);
            // out.println(Arrays.toString(binArr));
            // out.println(Arrays.toString(protArr));


            if (binArr[i] == '1') {
                if (protArr[i] == false) { 
                    count++;
                }
                Arrays.fill(protArr, i, lookup+1, true);
            }
            
        }

        out.println(count);
        // out.println(Arrays.toString(binArr));
        // out.println(Arrays.toString(protArr));
    }
}
