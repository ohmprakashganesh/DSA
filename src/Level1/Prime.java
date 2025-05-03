package Level1;

import java.util.Stack;

public class Prime {
    int i=0;
    public static Stack<Integer> checkPrime(int[] arr){
        Stack<Integer> stak= new Stack<>();
        for(int n:arr){
           boolean x= checkNumber(n);
           if(x == true){
               stak.push(n);
           }
        }
        return stak;
    }
    public static boolean checkNumber(int n){
        boolean val=false;

        if(n <=1 ) return   false;
        if(n==0) return   true;
        if(n%2 == 0) return false;
        for(int i=3; i<= Math.sqrt(n); i++){
            if(n%i==0){
                val= false;
            }else{
                val=true;
            }


        }
        return  val;
    }
    public  static  void main(String arg[]){
        int[] arr={3,5,33,5,44,37};
      Stack<Integer> stack=  Prime.checkPrime(arr);
       while (!stack.isEmpty()){
           System.out.println("one"+ stack.pop());
       }


    }
}
