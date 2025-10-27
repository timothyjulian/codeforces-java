import java.util.*;
import java.io.*;
import java.math.*;

public class I_Discrepancies_in_the_Voters_List {

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
        int b = in.nextInt();
        int c = in.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a + b + c; i++) {
            int temp = in.nextInt();
            map.put(temp, map.getOrDefault(temp, 0)+1);
        }

        // out.println(map);
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()) {
            if (map.get(key) >= 2) {
                list.add(key);
            }
        }

        Collections.sort(list);
        out.println(list.size());
        for(int i = 0; i < list.size(); i++) {
            out.println(list.get(i));
        }
    }
}
