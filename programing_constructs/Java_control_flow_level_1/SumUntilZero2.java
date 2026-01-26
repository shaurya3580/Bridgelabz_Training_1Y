import java.util.Scanner;

class SumUntilZeroBreak {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        double total = 0.0;
        double number;
        
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            number = input.nextDouble();
            
            if (number <= 0) {
                break;
            }
            
            total = total + number;
        }
        
        System.out.println("Total sum is: " + total);
        
       
    }
}
