import java.util.Scanner;

 class OddEvenNumbers {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        
        if (number <= 0) {
            System.out.println("Please enter a valid natural number (positive integer).");
            return;
        }
        
        System.out.println("Numbers from 1 to " + number + ":");
        System.out.println("Odd numbers: ");
        
        
        for (int i = 1; i <= number; i += 2) {
            System.out.print(i + " ");
        }
        
        System.out.println();
        System.out.println("Even numbers: ");
        
       
        for (int i = 2; i <= number; i += 2) {
            System.out.print(i + " ");
        }
        
        
    }
}
