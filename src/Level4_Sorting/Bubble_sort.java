package Level4_Sorting;
//in this sort in each iteration single element is sorted
//either ascending or desending order
public class Bubble_sort {
    public  static  int[] Sort(int arr[]){
        int l=arr.length-1;
        while( l >=0){
            for(int i=1; i<=l; i++){
                if(arr[i]< arr[i-1]){
                    int temp=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                }
            }
            l--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={4,6,4,88,64,7,5,0};
        int temp[]=Sort(arr);
        for(int i:temp){
            System.out.print(i);
        }
    }
}
