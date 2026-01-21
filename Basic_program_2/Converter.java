import java.util.Scanner;

 class KmToMiles {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
       
        
        System.out.print("km: ");
        int a = input.nextInt();
        
        double miles = a / 1.6;
        
        System.out.println("The total miles is " + miles); 
		System.out.println(" mile for the given " + km );
        
     
    }
}
