package Level1;

import java.util.ArrayList;
import java.util.List;

public class AllFactorsOfNumber {
    public static List<Integer> allFactorNumbers(int n){
        List<Integer> list= new ArrayList<>();
        int i=1;
        while (i<=n){
            int temp= n%i;
            if(temp==0){
                list.add(i);
            }
            i++;
        }
        return list;
    }
    public  static  void main(String args[]){
        System.out.println(allFactorNumbers(200));
    }
}
