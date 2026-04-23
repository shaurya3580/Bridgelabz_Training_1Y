package Generics;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(10);
        list.add("name");
  list.add("111.233");
  list.add("x");
        System.out.println(list);
        int index0=(int)list.get(0);
        System.out.println("Index0:- " +index0);
        String index1=(String)list.get(1);
        System.out.println("Index1:- " +index1);
         double index2=(double)list.get(2);
        System.out.println("index2:- " +index2);
    }

}
