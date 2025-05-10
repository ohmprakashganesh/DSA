package Level2_String_Solution;

import java.util.Arrays;

public class Remove_dup_secondway {
    public  static  void check(String str){
        StringBuilder sb= new StringBuilder();
        int l= str.length()-1;
        char[] arr= str.toLowerCase().toCharArray();
        boolean[] temp= new boolean[256];
        while (l >=0){
            int ind= (int)arr[l]-'a';
            if(temp[ind] ==false){
                sb.append(arr[l]);
                temp[ind]=true;
            }
            l--;
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        check("rarajum");
    }
}
