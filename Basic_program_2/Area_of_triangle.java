import java.util.Scanner;

 class TriangleArea {
    public static void main(String args[]) {
   Scanner input = new Scanner(System.in);
        
    System.out.print("base: ");
    int a = input.nextInt();
        
     System.out.print("height: ");
    int b = input.nextInt();
        
        double areaInches = 0.5 * a * b;
        double areaCm = areaInches * 6.4516;
        
        System.out.println("The area of triangle in sq inches is " + areaInches + " while in sq cm is " + areaCm);
        
 
    }
}
