import java.util.Scanner;

class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        
        }
        
        if (number >= 100) {
            System.out.println("Please enter a number less than 100.");
            
        }
        
        System.out.println("Multiples of below 100: " +number);
        
        
        for (int i = 100; i >= 1; i--) {
            
            if (i % number == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();  
        
       
    }
}
