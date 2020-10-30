package StringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.util.Scanner;

public class TAEDITOR {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder output = new StringBuilder();
//        final int n = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++){
//            String query[] = reader.readLine().split(" ");
            String query[] = sc.nextLine().split(" ");
            if(query[0].equals("+")){
                int index = Integer.parseInt(query[1]);
                String subString = query[2];
                sb.insert(index,subString);
            }
            else{
                int start = Integer.parseInt(query[1])-1;
                int length= Integer.parseInt(query[2])-1;
                output.append(sb.substring(start,start+length+1)).append("\n");
            }
        }
        System.out.println(output);

    }
}
