package Sorting_algorithms;
import java.util.*;
public class mergesort{
    public static void main(String[] args) {
        int[] arr={5,6,4,3,7,9,2,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int[] arr,int start,int mid,int end){
        int n1=mid-start+1;
        int n2=end-mid;

        int arr1[]=new int[n1];
        int arr2[]=new int[n2];

        for(int i=0;i<n1;i++){
            arr1[i]=arr[start+i];
        }
        for(int i=0;i<n2;i++){
            arr2[i]=arr[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=start;

        while(i<n1 && j<n2){
            if(arr1[i]>=arr2[j]){
                arr[k]=arr1[i];
                i++;
            }
            else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=arr1[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[],int start,int end){
        if(start<end){
            int m=(start+end)/2;
            mergeSort(arr,start,m);
            mergeSort(arr,m+1,end);
            merge(arr,start,m,end);

        }
    }
}
