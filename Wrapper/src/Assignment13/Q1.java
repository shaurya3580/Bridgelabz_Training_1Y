package Assignment13;

import java.util.Scanner;

public class Q1 {
    public void primitiveToWrapper(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num1=sc.nextInt();
        Integer num2=num1;
        System.out.println("primitive:- " +num1);
        System.out.println("Wrapper:- " +num2);

    }

    public static void main(String[] args) {
        Q1 a=new Q1();
        a.primitiveToWrapper();
    }
}
