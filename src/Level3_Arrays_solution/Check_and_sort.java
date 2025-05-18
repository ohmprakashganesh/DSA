package Level3_Arrays_solution;

public class Check_and_sort {
    public  static  int[] sort(int[] arr){
        int len= arr.length-1;
        int i=0;
        while (i<len){
            if(arr[i] > arr[i+1] ){
                int temp= arr[i];
                arr[i]= arr[i+1];
                arr[i+1]=temp;

            }
            i++;
        }
        return  arr;
    }

    public static void main(String[] args) {
        int arr[]={4,55,3,45};
       for(int i:sort(arr)){
           System.out.print(i+",");
       }
    }
}
