package Level1;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public  static List<Integer> check(int n){
        int current=1;
        int previous=0;
        int next=0;
        List<Integer> list= new ArrayList<>();
        list.add(previous);
        list.add(current);
        while(next <=n){
            next= current+previous;
            if(next > n)
                break;
            previous=current;
            current=next;
            list.add(next);
        }
        return  list;
    }
   public  static  void main(String args[]){
       System.out.println(check(8));
   }
}
