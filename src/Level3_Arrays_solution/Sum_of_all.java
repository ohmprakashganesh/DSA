package Level3_Arrays_solution;

public class Sum_of_all {
    public  static  int sum(int[] arr, int l){
        if(l==0) return 0;
        return arr[l-1]+sum(arr,l-1);

    }
    public static void main(String[] args) {
        int[] arr= new int[]{2,3,4};
        System.out.println( sum(arr, arr.length));
        bom(arr, arr.length);

    }
    public  static  void bom(int[] arr, int num){
        int sum=0;
        int l=num-1;
        while (l >=0){
            sum+=arr[l];
            l--;
        }
        System.out.println(sum);

    }
}
