package Sorting_algorithms;

import java.util.Arrays;  

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={67,54,2,99,104,2,5,6};
        bubble(arr);
        int[] arr1={1,2,3,4};
        bubble(arr1);
        System.out.println(Arrays.toString(arr)+"\n");
        System.out.println(Arrays.toString(arr1));
    }

    /*
    There is an extra variable swap so that for arrays that have been already sorted the swap= true will never trigger for the given i 
    and hence the if condition below will fail causing the loop to break early rather than getting N^2 comparisions 
     */
    static void bubble(int[] arr){
        int n=arr.length;
        int temp;
        boolean swap;
        for(int i=1; i<n;i++){
            swap=false;
            for(int j=1;j<n;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        } 
    }    
}
