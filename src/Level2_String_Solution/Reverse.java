package Level2_String_Solution;

import java.util.Arrays;

public class Reverse {
    public  static  void check(String ar){
        char[] ch= ar.toCharArray();
        int l= ch.length-1;
       StringBuilder sb= new StringBuilder();

        while (l>=0){
            sb.append(ch[l]);
            l--;
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        check("ramjankaki");
    }
}
