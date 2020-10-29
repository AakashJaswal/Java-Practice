package BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class IntegerOperation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Big Integer");
//        BigInteger v1 = new BigInteger(sc.next());
//        System.out.println("Enter no to divide with");
//        BigInteger div = BigInteger.valueOf(sc.nextLong());
//        System.out.println("Enter no to multiply with with");
//        BigInteger result = v1.divide(div).multiply(new BigInteger(sc.next()));
//        System.out.println(result);
        System.out.println(fact(sc.nextInt()));
    }
        static BigInteger fact(int n){
        BigInteger result = BigInteger.ONE;
        for(int i = 2; i<= n;i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result ;
        }

}
