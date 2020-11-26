package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RevereseAnArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ar = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int start = 0, end = ar.length-1;
        while(start<end){
            int temp = ar[end];
             ar[end--] = ar[start];
            ar[start++] = temp;

        }
        for(int a : ar){
            System.out.print(a + " ");
        }
    }
}
