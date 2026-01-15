import java.util.Scanner;

class HeightConverter {
   public static void main(String args[])
   {
        Scanner input = new Scanner(System.in);
        
        System.out.print("height: ");
        int heightCm = input.nextInt();
        
        double totalInches = heightCm / 2.54;
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;
        
        System.out.println("Your Height in cm is " + heightCm);
	System.out.println("feet is " + feet);
		System.out.println("inches is " + inches);
     
    }
}
