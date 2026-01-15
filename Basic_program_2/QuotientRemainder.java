import java.util.Scanner;

 class QuotientRemainder {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("number1: ");
        int a = input.nextInt();
        
        System.out.print("number2: ");
        int b = input.nextInt();
        
        int quotient = a / b;
        int remainder = a % b;
        
        System.out.println("The Quotient is " + quotient);
		System.out.println( "Reminder is " + remainder); 
                          
        
       
    }
}
