package Level1;

public class ReverseNumber {
    public static   int ReverseNum(int num){
        int reversed=0;
        while(num !=0){
            int temp= num%10;
            reversed= reversed*10 + temp;
            num/=10;

        }
        return  reversed;
    }
    public  static  void main(String args[]){
        System.out.println(ReverseNum(123));
    }
}
