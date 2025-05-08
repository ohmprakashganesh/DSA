package Level2_String_Solution;

import java.util.HashMap;
import java.util.Map;

public class PrintAllDuplicateAndCounts {
    public static void check(String s) {

            int[] freq = new int[256];
            for (char c : s.toCharArray()) {
                freq[c]++;
            }
            for (int i = 90; i <123; i++) {
                if (freq[i] > 1) {
                    System.out.println((char)i + ":" + freq[i]);
                }
            }
        }




    public static void main(String[] args) {
        check("keiseohoaaplok");
    }


}