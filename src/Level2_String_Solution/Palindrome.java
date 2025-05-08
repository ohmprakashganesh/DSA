package Level2_String_Solution;

//strin that is same form back and forth

public class Palindrome {
    public static  boolean check(String str){
        char[] arr=str.toCharArray();
        String st=new String();
        int n= arr.length-1;
        StringBuilder sb= new StringBuilder();
        while (n>=0){
            st+=arr[n];
            System.out.println(st);
//            sb.append(arr[n]);
            n--;
        }
        return  str==st;

    }

    public static void main(String[] args) {
        System.out.println(check("eve"));
    }
}
