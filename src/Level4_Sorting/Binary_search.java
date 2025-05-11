package Level4_Sorting;

public class Binary_search {
    public static  int binary(int[] arr,int target) {
//        int n= arr.length-1;
//        int start=0;
//        int end=n;
//        while(start<=end){
//           int  mid=start+ (end-start)/2;
//            System.out.println(mid);
//            if(arr[mid]==target){
//              return  mid;
//            } else if (arr[mid] > target) {
//                end=mid-1;
//            }else{
//                start = mid+1;
//            }
//        }
//        return  -1;
//    }




        //long but easy
        int start=0;
        int end=arr.length-1;
        while (start <=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return  mid;
            } else if(arr[mid] > target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={2,4,6,8,19,40};
        int ind= binary(arr,40);
        if(ind >=0)
        System.out.println("found in array"+arr[ind]);

    }
}
