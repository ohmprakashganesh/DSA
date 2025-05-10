package Level2_String_Solution;

public class Anagrams_string {
    public static boolean check(String a, String b){
        if(a.length() != b.length())return  false;
        int[] count= new int[26];
        int l= a.length()-1;
        while (l >=0){
            count[a.charAt(l)-'a']++;
            count[b.charAt(l)-'a']--;
            l--;
        }
        for(int c:count){
            if(c !=0)
                return false;
        }
        return  true;
    }

    public static void main(String[] args) {
        System.out.println(check("hello", "ollhe"));
    }

}
