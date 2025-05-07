package Level1_1;

import java.util.Stack;
//number whose orignal number exist at end even after the squaring
public class Automorphic_Number {
    public static boolean check(int n){
        int squared= n*n;
       //count number of digits
        while(n!=0){
            if(n%10 != squared%10){
                return false;
            }
            n/=10;
            squared/=10;
        }
        return  true;
    }
    public  static  void main(String args[]){
        int num=25;
        System.out.println("num is automorphic Number====>?"+ check(num));


    }

}
