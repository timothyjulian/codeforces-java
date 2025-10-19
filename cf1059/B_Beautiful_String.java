
import java.util.*;
import java.io.*;
import java.math.*;

public class B_Beautiful_String {

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

    static boolean isPalindrome(String s) {
        char[] sArr = s.toCharArray();
        int l = 0;
        int r = sArr.length - 1;
        while (l < r) {
            if (sArr[l] != sArr[r]) {
                return false;
            }
            l++;
            r++;
        }


        return true;
    }

    static void solve(FastReader in) {
        int n = in.nextInt();
        String s = in.nextLine();

        char remove;

        if (s.charAt(s.length()-1) == '0') {
            
        }
        
        List<Integer> zeroIdx = new ArrayList<>();
        for(int i= 0; i< s.length(); i++) {
            if(s.charAt(i) == '0') {
                zeroIdx.add(i);
            }
        }

        out.println(zeroIdx);
    }

}