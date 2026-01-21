import java.util.Scanner;
class Marks {
	public static void main(String args[]) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("marks of math");
		int a = input.nextInt();
		System.out.println("marks of physics");
		int b= input.nextInt();
		System.out.println("marks of chem");
		int c = input.nextInt();
		int average = (a+b+c)/3;
		System.out.println("average:-" +average);
	}
}
		