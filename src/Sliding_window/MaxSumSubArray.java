package Sliding_window;

public class MaxSumSubArray {
    public  static  int MaxSub(int[] arr, int size){
        int l= arr.length-1;
        int sum=0;
        int max=0;
        int i;
        for(i=0; i<size; i++){
            sum+=arr[i];
            max=Math.max(sum,max);
        }
         int x=0;
        for(int j=size; j<=l; j++){
            sum= sum-(arr[x])+arr[j];
            x++;
            max=Math.max(sum,max);
        }
       return max;


    }

    public static void main(String[] args) {
        int[] arr={2,2,3,4,5,6,7,8,9};

        int max=MaxSub(arr, 4);
        System.out.println(max);
    }
}
