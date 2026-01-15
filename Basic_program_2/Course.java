 import java.util.Scanner;
 class Course {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Fee(INR):- ");
        int a = input.nextInt();
        
        System.out.print("discount percentage:- ");
        int b = input.nextInt();
        
        int discount = (a * b) / 100;
        int finalFee = a-b;
        
        System.out.println("discount:-" + discount); 
		System.out.println("final fee:- " + finalFee);
      
    }
}
