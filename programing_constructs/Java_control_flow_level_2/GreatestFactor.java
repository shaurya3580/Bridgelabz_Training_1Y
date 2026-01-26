import java.util.Scanner;

 class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        int greatestFactor = 1;
        
        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
            
        }
        
        
        for (int i = number - 1; i >= 1; i--) {
            
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        
       
        System.out.println("Greatest factor of " + number + " (besides itself): " + greatestFactor);
    
    }
}
