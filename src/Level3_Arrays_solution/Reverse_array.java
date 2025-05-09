package Level3_Arrays_solution;

import javax.swing.*;
import java.util.Arrays;

public class Reverse_array {
    public  static  void reverse(int[] arr){
        int l= arr.length-1;
        int x=0;
        int half=l/2;
        while(l>= half){
            int temp=arr[l];
            arr[l]=arr[x];
            arr[x]=temp;
            l--;
            x++;
        }
        for(int i: arr)
        System.out.print( i+" ");
    }

    public static void main(String[] args) {
        reverse(new int[]{1,2,3,4,5,6,7});
    }
}
