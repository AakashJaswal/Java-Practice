package HackerEarth.OneDArray;
//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/micro-and-array-update/

import java.io.*;
import java.util.Arrays;

public class ArrayUpdate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(br.readLine().trim());
        while (test_cases > 0) {
            int max = 0;
            int[] ar = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int main_arr[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int el : main_arr) {
                if (el < ar[1]) {
                    max = max > ar[1] - el ? max : ar[1] - el;
                }
            }
            System.out.println(max);


            --test_cases;
        }

    }
}
