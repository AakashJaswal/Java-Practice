package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class recursiveDigitSum {

//    static int superDigit(String number) {
//        if (number.length() > 1) {
//            long Sum = 0;
//            for (int i = 0; i < number.length(); i++) {
//                Sum += Character.getNumericValue(number.charAt(i));
//            }
//            System.out.println(Sum);
//            return superDigit(Long.toString(Sum));
//        } else System.out.println(Character.getNumericValue(number.charAt(0)));
//        return 1;
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input[] = sc.nextLine().split(" ");
        int result = (new BigInteger(input[1]).multiply(new BigInteger(input[0])).mod(new BigInteger("9"))).intValue();
        System.out.println(result == 0 ? 9 : result);
    }
}

