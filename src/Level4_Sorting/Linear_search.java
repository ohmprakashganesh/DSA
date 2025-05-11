package Level4_Sorting;

public class Linear_search {
    //first way
    public  static int search1(int[] arr, int target){
        int l=arr.length-1;
        while (l >=0){
            if(target==arr[l])
                return  l;
            l--;
        }
        return -1;
    }

//alternative way
        public  static boolean search2(int[] arr, int target){
        int l=arr.length-1;
        for(int item:arr){
            if(item==target)
                return true;
        }
        return  false;
    }
    public static void main(String[] args) {
        int arr1[]={4,22,5,33,7,36,99};
        int index1=search1(arr1,36);
        System.out.println("index is "+index1 + "and value is =>"+arr1[index1]);

        int arr2[]={4,22,5,33,7,36,99};
        System.out.println("is it present? =>"+search2(arr2,36) );
    }
}
