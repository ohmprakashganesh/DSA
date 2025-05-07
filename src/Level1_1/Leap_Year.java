package Level1_1;

// divisible by 4 leap year
//divisible by 4 but not by 100 leap year
//divisible by 4 100 and 4000 then leap year
public class Leap_Year {
    int year=2025;

    public static  boolean leapyear(int num){
        if(num%4==0 && num%100 !=0  || num%400==0) return true;
        return  false;
    }

    public static void main(String[] args) {
        System.out.println(leapyear(2000));
    }

}
