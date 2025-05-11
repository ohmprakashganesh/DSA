package Level4_Sorting;

// outer arry define the num ofloops to execute
//outer loop index is starting of s
//outer goes 1 2 3 4 5  incrisingly
//inner loop do comparison  one pair in 1 and 2 pair in 2 etc
// in foirst ocmpare index 1 with 0
//second    2 -1 and 1-0
//third    3-2 and 2-1 and 1-0
public class Insertion_sort {
    public  static  int[] sort(int[] arr){
        int len= arr.length-1;
        int i=1;
        while (i<=len){
            for(int j=i; j>0; j--){
                if(arr[j-1] > arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
            i++;
        }
        return  arr;
    }

    public static void main(String[] args) {
        int []arr={5,33,6,45,23};
        int temp[]=sort(arr);
        for(int i: temp){
            System.out.print(i+" ");
        }
    }
}
