package Experiments;

import java.util.*;
import java.io.*;

public class AllPermutation {
    static void perm(String QS, String ASF) {
        if (QS.length() == 0) {
            System.out.println(ASF);
            return;
        }

        for (int i = 0; i < QS.length(); i++) {
            char ch = QS.charAt(i);
            String left = QS.substring(0, i);
            String right = QS.substring(i + 1);
            String new_QS = left + right;
            perm(new_QS, ASF + ch);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        perm(str,"");

    }
}
