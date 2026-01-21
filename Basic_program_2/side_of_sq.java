import java.util.Scanner;

 class SquareSide {
    public static void main(String args[]) {
                     Scanner input = new Scanner(System.in);
        
                System.out.print("perimeter: ");
        int perimeter = input.nextInt();
        
                        double side = perimeter / 4;
        
        System.out.println("The length of the side is " + side); 
          		System.out.println(" whose perimeter is " + perimeter);
        

    }
}
