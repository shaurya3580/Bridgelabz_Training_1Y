import java.util.Scanner;

 class NaturalSumCompare {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("number: ");
        int n = input.nextInt();
        
        if (n > 0) {
            
            int formulaSum = n * (n + 1) / 2;
            
            
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }
            
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
            
            if (formulaSum == loopSum) {
                System.out.println("Both computations are CORRECT!");
            } else {
                System.out.println("Results don't match!");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
        
     
    }
}
