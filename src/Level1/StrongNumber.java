package Level1;

//whose sum of factorial of digits are equal to the original number is Strong number
public class StrongNumber {
    public static  int fact(int n){
        if(n<=1){
            return 1;
        }
        return  n*fact(n-1);



    }
    public  static  int sumOfFacOfDigit(int num){
        int sum=0;

        while (num !=0){
            int temp= num%10;  //5%10 = 5
          sum+=fact(temp);     //sum= 0+fact(5) = 5*4*3*2*1
            num=num/10;        //num= 5/10 =0
        }
        return  sum;            //return the sum

    }
    public  static  void main(String args[]){
        boolean x= 5 == sumOfFacOfDigit(2);
        System.out.println(x);
    }
}
