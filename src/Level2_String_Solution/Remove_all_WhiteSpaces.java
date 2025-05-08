package Level2_String_Solution;

import java.util.Arrays;

//replace white spaces with $
public class Remove_all_WhiteSpaces {
    public static  void check(String arg) {
        char[] om = arg.toCharArray();
        int len = om.length - 1;
        while (len >= 0) {
            char ch = om[len];
            if (ch == ' ') {
                om[len] = '+';

            }
            len--;
        }
        System.out.println(om);

    }
    public static void main(String[] args) {
        check("hwllo brother    are you fine");

    }
}
