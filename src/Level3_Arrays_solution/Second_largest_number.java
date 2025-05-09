package Level3_Arrays_solution;

public class Second_largest_number {
    public static  void check(int[] arr){
        int l= arr.length-1;
        //assuming all number or positive number
        int sec=0;
        int fir=0;
        while(l>=0){
            if(arr[l]> fir){
                    sec=fir;
                    fir=arr[l];
            }else if(sec<arr[l] && arr[l]<fir){
                sec=arr[l];
            }
            l--;
        }
        System.out.println(fir);
        System.out.println(sec);
    }
    public static void main(String args[]){
        check(new int[]{4,3,5,5,9,9});
    }
}
