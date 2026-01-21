import java.util.Scanner;

 class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("number1: ");
        int num1 = input.nextInt();
        
        System.out.print("number2: ");
        int num2 = input.nextInt();
        
        double add = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;
        
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
                          + num1 + " and " + num2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
        
      
    }
}
