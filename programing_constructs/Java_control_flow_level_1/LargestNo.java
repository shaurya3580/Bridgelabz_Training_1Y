import java.util.Scanner;
 class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("number1: ");
        int x = input.nextInt();
        
        System.out.print("number2: ");
        int y = input.nextInt();
        
        System.out.print("number3: ");
        int z = input.nextInt();
        
        System.out.println("Is the first number the largest? " + (x > y && x > z ? "YES" : "NO"));
        System.out.println("Is the second number the largest? " + (y > x && y > z ? "YES" : "NO"));
        System.out.println("Is the third number the largest? " + (z > x && z > y ? "YES" : "NO"));
        
      
    }
}
