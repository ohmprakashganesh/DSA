package Level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Prime {
    int i=0;
    public static List<Integer> checkPrime(int[] arr){
//        Stack<Integer> stak= new Stack<>();
        List<Integer> list=new ArrayList<>();
        for(int n:arr){
           boolean x= checkNumber(n);
           if(x == true){
//               stak.push(n);
               list.add(n);

           }
        }
        return list;
    }
    public static boolean checkNumber(int n){
        if(n <=1 ) return   false;
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n%i==0){
               return  false;
            }
        }
        return  true;

    }
    public  static  void main(String arg[]){
        int[] arr={3,5,33,5,44,37};
      List<Integer> list=  Prime.checkPrime(arr);

      //with out inbuilt function
//      int max= list.get(0);
//      int min= list.get(0);
//       for(int item: list){
//           if(max < item){
//               max=item;
//           }
//           if(min > item){
//               min=item;
//           }
//       }
//        System.out.println("small prime  is "+min);
//        System.out.println("max prime  is "+ max );

        //with stream
        int high= list.stream().max(Integer::compareTo).get();
        int low= list.stream().min(Integer::compareTo).get();
        System.out.println("small prime  is "+high);
        System.out.println("max prime  is "+ low );




    }
}
