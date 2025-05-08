package Level2_String_Solution;

import java.util.HashSet;
import java.util.Set;

public class Remove_deuplicates {
    public static  void check(String arg){
        Set<Character> set= new HashSet<>();
          char[] arr=arg.toCharArray();
          boolean[] seen=new boolean[256];
          int len= arr.length-1;
          String sum="";
          char[] temp=new char[26];
          while (len>=0){
              char ch=arr[len];
              set.add(arr[len]);

              if(!seen[ch]){
                  sum+=ch;
                  seen[ch]=true;
              }
              len--;
          }
        System.out.println(sum);
          for(Character c:set)
        System.out.println(c);
    }

    public static void main(String[] args) {
        check("iaamggoinntforn");
    }
}
