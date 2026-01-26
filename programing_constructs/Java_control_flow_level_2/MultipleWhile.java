import java.util.Scanner;

 class MultiplesWhile {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
      
        System.out.print("Enter a positive integer less than 100: ");
        int number =input.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
           
        }
        
        if (number >= 100) {
            System.out.println("Please enter a number less than 100.");
         
        }
        
        System.out.print("Multiples of  below 100: " +number);
        
        
        int counter = 99;
        
        
        while (counter > 1) {
          
            if (counter % number == 0) {
                System.out.print(counter + " ");
            }
            counter--;
        }
        
        
        if (1 % number == 0) {
            System.out.print(1);
        }
        
        System.out.println(); 
    }
}
