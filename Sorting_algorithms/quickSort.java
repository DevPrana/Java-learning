package Sorting_algorithms;
import java.util.*;

public class quickSort{
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void quicksort(int[] arr,int low,int high){
        int s=low;
        int e=high;
        if(low>=high){
            return;
        }
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
            quicksort(arr,low,e);
            quicksort(arr,s,high);
        }
    }
    
}
