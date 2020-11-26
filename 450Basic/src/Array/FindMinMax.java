package Array;

import java.io.*;
import java.util.Arrays;


public class FindMinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int ar : arr) {
            if (ar > max) max = ar;
            if (ar < min) min = ar;
        }
        System.out.println(max+"  "+min);
    }
}
