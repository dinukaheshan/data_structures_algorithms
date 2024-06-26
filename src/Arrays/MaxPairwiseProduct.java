package Arrays;

import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
        int n = numbers.length;
        int maxIndex1 = -1;
        for (int i = 0; i < n; i++) {
            if (maxIndex1 == -1 || numbers[i] > numbers[maxIndex1]) {
                maxIndex1 = i;
            }
        }
        int maxIndex2 = -1;
        for (int i = 0; i < n; i++) {
            if (i != maxIndex1 && (maxIndex2 == -1 || numbers[i] > numbers[maxIndex2])) {
                maxIndex2 = i;
            }
        }
        return (long) numbers[maxIndex1] * numbers[maxIndex2];
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Answer: " + getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
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
