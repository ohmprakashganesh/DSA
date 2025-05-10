package Sliding_window;

public class FirstNegNumInEveryWindow {
    public  static int[] check(int[] arr, int n){
        int l=arr.length-1;
        int[] ret= new int[l];
        int count=0;
        for(int i=0; i<=l-n; i++){

            for(int j=i; j<n+i; j++){
                if(arr[j] <0){
                  ret[count]=arr[j];
                  count++;
                  break;
                }
            }
        }
        return ret;

    }

    public static void main(String[] args) {
        int[] arr= {1,-5,3,6,-4,5,-1,22,7,4};
        int[] out=check(arr,3);
        for(int i:out){
            if(i<0)
            System.out.println(i);
        }
    }
}
