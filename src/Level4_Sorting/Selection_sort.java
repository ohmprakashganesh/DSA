package Level4_Sorting;
//set min to initial of outer loop
//compare min value with all continous j value till end
//after inner loop swap the elements

public class Selection_sort {
    public  static  int[] sort(int[] arr){
        int len=arr.length-1;
        int i=0;
        while(i<=len){
            int min=i;
            for(int j=i; j<=len; j++){
                if( arr[min] > arr[j]){
                    min=j;
                }
            }
            if(arr[i] != arr[min]){
                int temp= arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
             i++;
        }
        return  arr;
    }
    public static void main(String[] args) {
        int arr[]={5,3,77,53,6,4,55,6};
        int temp[] =sort(arr);
        for(int i: temp){
            System.out.print(i+ " ,");
        }
    }

}
