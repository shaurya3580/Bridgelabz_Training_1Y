import java.util.Scanner;

 class MultiplicationTable {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
     
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        System.out.println("\nMultiplication table of " + number + " (6 to 9):");
        
       
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
        
    }
       
}
