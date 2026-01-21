import java.util.Scanner;

 class FeetConverter {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("distanceInFeet: ");
        int feet = input.nextInt();
        
        double yards = feet / 3;
        double miles = yards / 1760;
        
        System.out.println("Your distance in feet is " + feet);
		System.out.println(" in yards is " + yards);
		System.out.println("in miles is " + miles);
       
}
}
