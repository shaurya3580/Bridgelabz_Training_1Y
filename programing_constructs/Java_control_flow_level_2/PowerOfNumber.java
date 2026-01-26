import java.util.Scanner;

 class PowerOfNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter base number: ");
        int number = input.nextInt();
        
        System.out.print("Enter power: ");
        int power = input.nextInt();
        
        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers only.");
            
        }
        
       
        int result = 1;
        
       
        for (int i = 1; i <= power; i++) {
            result = result * number;  
        }
        
       
        System.out.println(number + " raised to power " + power + " = " + result);
        
        
    }
}
