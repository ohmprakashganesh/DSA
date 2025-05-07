package Level1_1;

import java.util.Stack;

// when square number is divided  , sum of divided is equal to original number
//45 sqr= 2025    20+25 = 45
public class Kaprekar_Number {

    public  static  int check(int num){
        int squared=num*num;
        int val=0;
        Stack<Integer> right= new Stack<>();
        while (num!=0){
            int temp= squared%10;
             val=val*10+temp;
            right.push(val);
            num/=10;
            squared/=10;
        }
        int reversed=0;
        while (!right.isEmpty()){
            reversed  = reversed*10+right.pop();
        }
        return squared+reversed;


    }
    public  static  void main(String args[]){
        int number=45;
        int  recived=check(number);
        boolean x= recived==number;
        System.out.println("is the number kapreka number "+ x);
    }
}
