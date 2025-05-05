package Level1;

import java.util.Stack;

//number which is same form left to right and vice versa
public class Palindrome {
    public static int check(int n){
        int reversed=0;
        while(n!=0){
            int x= n%10;
            reversed= reversed *10 + x;
            n=n/10;
        }
        return  reversed;
    }

    public static  void main(String args[]){
        int num=333;
       int temp= check(num);

        if(num==temp){
            System.out.println("this is palindrome number");
        }else {
            System.out.println("this is not palindrome Number");
        }
    }
}
//second way





