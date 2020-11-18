package HackerEarth.OneDArray;

import java.io.*;
import java.util.Arrays;
public class Help_Jarvis {
    public static void main(String[] args) throws IOException {
        StringBuilder str = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n!=0) {
            int ar[] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(ar);
            int i = 0;
            for (i = 0; i < ar.length-1; i++) {
                if (ar[i] + 1 == ar[i + 1]) continue;
                else break;
            }
            if (i == ar.length - 1) str.append("YES").append("\n");
            else str.append("NO").append("\n");
            n--;
        }
        System.out.println(str);
    }
}
