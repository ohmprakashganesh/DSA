package Level2_String_Solution;

import java.util.HashMap;
import java.util.Map;
//find the longest words form the given string

public class Find_longest_words {
    public  static  void check(String  arg){
        char[] ch=arg.toCharArray();
        int longest=0;
        String max="";
        String current="";
        int len= ch.length-1;
        Map<String,Integer> map= new HashMap<>();
        int i=0;

        while (i<=len){
            if(ch[i]==' ' || ch[i]==',' ){
                if(!current.isEmpty()){
                    map.put(current,current.length());
                    if(longest < current.length()){
                        longest=current.length();
                        max=current;

                    }
//                    System.out.println(current);
                    current="";
                }
            }else{
                current+=ch[i];
            }
            i++;

        }
        System.out.println("max string with lenght is "+ max+" =>"+ longest);
        for(Map.Entry<String,Integer> temp: map.entrySet()){
            System.out.println(temp.getKey()+ "=> " +temp.getValue());
        }

    }

    public static void main(String[] args) {
        check("hello how are you , are you fit and fine ");
    }

}
