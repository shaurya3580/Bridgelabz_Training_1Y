import java.util.Scanner;

class IntOperation {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("a: ");
        int a = input.nextInt();
        
        System.out.print("b: ");
        int b = input.nextInt();
        
        System.out.print("c: ");
        int c = input.nextInt();
        
        int op1 = a + b * c;      
        int op2 = a * b + c;      
        int op3 = c + a / b;      
        int op4 = a % b + c;      
        
        System.out.println("a + b * c = " + op1);
        System.out.println("a * b + c = " + op2);
        System.out.println("c + a / b = " + op3);
        System.out.println("a % b + c = " + op4);
        
 
    }
}
