import java.util.Scanner;
 class Harry {
    public static void main(String args[]) {
        int birthYear = 2000; 
        int currentYear = 2026;
		int age;
        System.out.print("enter currentYear: ");
        Scanner input = new Scanner(System.in);
        currentYear = input.nextInt();
        
        age = currentYear - birthYear;
        
        System.out.println("Harry age:-" + age);
    }
}
