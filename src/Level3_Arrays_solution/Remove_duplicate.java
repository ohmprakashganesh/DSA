package Level3_Arrays_solution;

//remove duplicate
public class Remove_duplicate {
    public  static  void cehck(int[] arr){
//        int[] temp=new int[arr.length];
//        int track=0;
//        temp[track]=arr[0];
//
//        for(int i=1; i<arr.length; i++){
//            if(temp[track]!=arr[i]){
//                track++;
//                temp[track]=arr[i];
//            }
//        }
//        for(int i:temp){
//            System.out.print(i+" ");
//        }

        //with out using extra array

        int x=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[x] != arr[i]) {
                x++;
                arr[x] = arr[i];
            }
        }
        // Print only unique elements (from 0 to x)
        for (int i = 0; i <=x; i++) {
            System.out.print(arr[i] + " ");
        }
   }


    public static void main(String[] args) {
        cehck(new int[]{1,4,22,22,43,453});
    }
}
