import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class MaxPairwiseProduct {
    static int getMaxPairwiseProduct(int[] numbers) {
        BigInteger max_product = new BigInteger("0");
        BigInteger one = new BigInteger("1");
        BigInteger n = new BigInteger(numbers.length+"");
        BigInteger index = new BigInteger("0");
        BigInteger maxIndex = new BigInteger("0");
        BigInteger maxIndex2 = new BigInteger("0");
        BigInteger max_product = new BigInteger("0");
        BigInteger max_value = new BigInteger("-1");
        BigInteger max_value2 = new BigInteger("-1");

        for(index.equals(new BigInteger("0")); index.compareTo(n)<0; index.add(one))
        {
        	
        }
        }

        return max_product;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
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
    }

}