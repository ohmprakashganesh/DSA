package Level1;


public class sumOfDigits {

    //using while loop
    int sumOfNums(int num){
        int temp=0;
        while(num != 0) {
            temp += num % 10;
            num /= 10;
        }
        return  temp;
    }


    //recursion
//    int sumOfNums(int num) {
//        if (num == 0) return 0;
//        return (num % 10) + sumOfNums(num / 10);
//    }

    public static void main(String arg[]){
        sumOfDigits obj= new sumOfDigits();
    double num=obj.sumOfNums(909);
        System.out.println(num);

    }
}
