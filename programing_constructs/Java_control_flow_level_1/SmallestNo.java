import java.util.Scanner;

  class FirstSmallest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("number1: ");
        int a = input.nextInt();
        
        System.out.print("number2: ");
        int b = input.nextInt();
        
        System.out.print("number3: ");
        int c = input.nextInt();
        
        if (a < b && a < c) {
            System.out.println("Is the first number the smallest? YES");
        } else {
            System.out.println("Is the first number the smallest? NO");
        }
        
   
    }
}
