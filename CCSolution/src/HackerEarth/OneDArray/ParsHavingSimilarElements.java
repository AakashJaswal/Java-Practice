package HackerEarth.OneDArray;

import java.io.*;
import java.util.Arrays;


//hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/pairs-having-similar-element-eed098aa/
public class ParsHavingSimilarElements {
    public static void main(String args[]) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine().trim());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        long count = 0, ans = 0, same = 0;
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) == 1)
                count++;
            else if (arr[i] == arr[i - 1])
                same++;
            else {
                if (count != 0) {
                    count += same;
                    ans += (count * (count + 1)) / 2;
                }
                count = 0;
                same = 0;
            }
        }
        if (count != 0) {
            count += same;
            ans += (count * (count + 1)) / 2;
        }
        System.out.println(ans);

    }
}
