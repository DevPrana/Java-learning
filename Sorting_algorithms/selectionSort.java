package Sorting_algorithms;
import java.util.*;
public class selectionSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size;
        size=in.nextInt();
        int num;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            num=in.nextInt();
            arr[i]=num;
        }
        selection(arr,size);
        System.out.println(Arrays.toString(arr));
        in.close();
    }
    static void selection(int[] arr,int size){
        int temp;
        for(int i=0;i<size;i++){
            int last=size-i-1;
            int max=maxIndex(arr,size,last);
            temp=arr[last];
            arr[last]=arr[max];
            arr[max]=temp;
        }
    }

    static int maxIndex(int[] arr,int size,int end){
        int max=0;
        for(int i=1;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
}
