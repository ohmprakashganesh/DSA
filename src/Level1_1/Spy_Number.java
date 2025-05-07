package Level1_1;

//number where sum and product of digits are equal
public class Spy_Number {
    public static boolean spyCheck(int n){
        int sum=0;
        int prod=1;
        while(n!=0){
            int temp= n%10;
            sum+=temp;
            prod*=temp;
            n/=10;
        }
        return sum==prod;
    }
    public  static  void main(String args[]){
        System.out.println("is it a spy number => "+ spyCheck(123));
    }
}
