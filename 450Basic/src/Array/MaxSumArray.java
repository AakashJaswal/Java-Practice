package Array;

import java.io.*;
import java.util.*;

public class MaxSumArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0, best = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            best = Math.max(sum, best);
        }
        System.out.println(best);
    }
}
