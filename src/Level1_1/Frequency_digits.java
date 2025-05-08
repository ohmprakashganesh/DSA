package Level1_1;

import java.util.Map;

public class Frequency_digits {
    public  static void digits(int num){
        int[] frequency= new int[10];
        while(num !=0){
            int digit= num%10;
            frequency[digit]++;
            num/=10;
        }
        for(int i=0; i<frequency.length; i++){
            System.out.println("frequency of "+i +"=>"+ frequency[i]);
        }
    }
    public static void main(String[] args) {
        digits(454578375);
    }
}
