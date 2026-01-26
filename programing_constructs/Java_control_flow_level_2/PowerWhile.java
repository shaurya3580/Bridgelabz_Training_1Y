import java.util.Scanner;

 class PowerWhile {
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
  
        int counter = 0;
        
        while (counter < power) {  
            result = result * number;
            counter++;
        }
        
       
        System.out.println(number + " raised to power " + power + " = " + result);
        
       
    }
}
