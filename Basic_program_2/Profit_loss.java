import java.util.Scanner;
class Marks {
	public static void main(String args[]) 
	{ 
	Scanner input = new Scanner(System.in);
	System.out.println("cost:- ");
	int a = input.nextInt();
	System.out.println("sellingprice:- ");
	int b = input.nextInt();
	int profit = b-a;
	double profitpercentage = (b-a)/a*100;
	System.out.println("profit:-" +profit);
	System.out.println("profitpercentage:-" +profitpercentage);
	}
}