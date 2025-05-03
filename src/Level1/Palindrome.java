package Level1;

public class Palindrome {

    public  static int check(int num){
        int x=0;
        while(num !=0){
            x=x * 10 + num%10;
            num/=10;


        }
        return  x;
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
