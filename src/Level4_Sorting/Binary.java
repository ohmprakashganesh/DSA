package Level4_Sorting;

import org.w3c.dom.ls.LSOutput;

public class Binary {
    public static void main(String[] args) {

        int arr[]={2,22,44,55,63,88,99};

        int len= arr.length-1;

        int start=0;
        int end=len;
        int item=5;
        int indx=-1;
        while(start <= end){
            int mid= (start+end)/2;

            if(arr[mid]==item){
                indx=mid;
                break;
             } else if ( item < arr[mid]) {
                end=mid-1;
            }else{
                start=start+1;
            }

            }

        if(indx !=-1)
        System.out.println("value is "+arr[indx]);
        else
            System.out.println("not value found");

        }

}
