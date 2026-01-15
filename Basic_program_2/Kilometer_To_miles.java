import java.util.Scanner;
class Kilometer{
	public static void main(String args[]) 
	{ 
	Scanner input = new Scanner(System.in);
	System.out.println("kilometer:- ");
	int a = input.nextInt();
	System.out.println("miles:- ");
	int b = input.nextInt();
	double miles = a*1.6;
	System.out.println("miles:- " +miles); 
	}
}
	