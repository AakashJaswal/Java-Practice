package Experiments;

import java.io.*;
import java.util.*;

public class AllSubsetOfASet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ar = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.pow(2, ar.length); i++) {
            String set = "";
            int index = i;
            for (int internal_loop = ar.length-1; internal_loop >=0 ; internal_loop--) {
                int r = index % 2;
                index /= 2;
                if (r == 0) continue;
                else set = ar[internal_loop] + set;
            }
            sb.append("{").append(set).append("} ");
        }
        System.out.println(sb.toString().strip().replaceAll(" ",", "));
    }
}
