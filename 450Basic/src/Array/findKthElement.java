package Array;

import java.util.*;
import java.io.*;

class findKthElement{
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int kth = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        sort(arr,0,arr.length-1);
        System.out.println(arr[kth-1]);

    }

    static void merge (int arr[], int L, int R,int middle){
        int SizeL = middle-L + 1, SizeR = R - middle;
        int arrL[] = new int[SizeL];
        int arrR[] = new int[SizeR];
        for(int i = 0 ;i<SizeL;i++) arrL[i] = arr[L+i];
        for(int i = 0 ;i<SizeR;i++) arrR[i] = arr[middle+i+1];

        int i=0,j=0,k=L;
        while(i<SizeL && j < SizeR){
            if(arrL[i] < arrR[j]) arr[k++] = arrL[i++];
            else arr[k++] = arrR[j++];
        }
        while (i < SizeL) arr[k++] = arrL[i++];
        while (j < SizeR) arr[k++] = arrR[j++];
    }


    static void sort (int arr[], int low, int high){
        if(low<high){
            int middle = (low + high) / 2;
            sort(arr, low ,middle);
            sort(arr,middle+1,high);
            merge(arr,low,high,middle);
        }
    }


}