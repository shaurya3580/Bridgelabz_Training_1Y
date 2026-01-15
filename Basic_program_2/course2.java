import java.util.Scanner;

 class StudentFeeDiscount {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter fee: ");
        int fee = input.nextInt();
        
        System.out.print("Enter discountPercent: ");
        int discountPercent = input.nextInt();
        
        int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;
        
        System.out.println("The discount amount is INR " + discount);
		System.out.println("final discounted fee is INR " + finalFee);
       
    }
}
