package HackerRank;
//https://www.hackerrank.com/challenges/halloween-sale/problem

import java.util.Scanner;

public class HalloweenSale {
    static int getCount(int s,int d,int limit,int dollar){
        int count = 0;
        while(dollar >= s){
            count++;
            dollar -= s;
            s -= d;
            s = Math.max(s,limit);

        }
        return count;

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input[] = sc.nextLine().split(" ");
        int init = Integer.parseInt(input[0]);
        int sub = Integer.parseInt(input[1]);
        int limit = Integer.parseInt(input[2]);
        int dollar = Integer.parseInt(input[3]);
        int toy = getCount(init,sub,limit,dollar);
        System.out.println(toy);

    }
}
