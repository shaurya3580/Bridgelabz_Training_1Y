package Assignment13;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public void autoUnboxing(){
        List<Integer> list=new ArrayList<Integer>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("List:- " +list);
        int sum  =0;
        for(Integer num: list){
            sum+=sum;
        }
        System.out.println("Additionmof List:- " +sum);

    }

    public static void main(String[] args) {
        Q3 a=new Q3();
        a.autoUnboxing();

    }
}
