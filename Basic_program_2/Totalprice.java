import java.util.Scanner;
 class TotalPrice {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("unitPrice: ");
        int unitPrice = input.nextInt();
        
        System.out.print("quantity: ");
        int quantity = input.nextInt();
        
        double totalPrice = unitPrice * quantity;
        
        System.out.println("The total purchase price is INR " + totalPrice);
                        System.out.println("the quantity " + quantity); 
			System.out.println("unit price is INR " + unitPrice);
    }
}
