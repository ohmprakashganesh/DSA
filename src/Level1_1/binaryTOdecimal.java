package Level1_1;

import java.util.Scanner;

public class binaryTOdecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the binary number ");
        int bin= sc.nextInt();

        try{
            String decimal=Integer.toBinaryString(bin);
            int binary=0;

            System.out.println("binary number is ");
            while (bin!=0){
                int temp=bin%2;
                binary = binary*10 + temp;
                bin/=2;
            }

            System.out.println("decimal value"+ String.valueOf(binary));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
