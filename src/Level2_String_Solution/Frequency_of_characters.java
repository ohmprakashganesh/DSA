package Level2_String_Solution;

import java.util.HashMap;
import java.util.Map;

//find the repitation of the letter that occured
public class Frequency_of_characters {
    public  static  void check(String arg){
        char[] c= arg.toCharArray();
        int len= c.length-1;
        Map<Character,Integer> map= new HashMap<>();
        int[] arr=new int[26];

        while(len >=0){
            if(c[len] >='a' && c[len]<='z'){
                int indx= c[len]-'a';
                arr[indx]++;
                len--;
            }
        }
        for(int i=0; i<26; i++){
            if(arr[i] >0){
                System.out.println("frequency"+ (char)(i+'a')+ arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        check("kalkakakallm");
    }
}
