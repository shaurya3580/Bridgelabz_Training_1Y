import java.util.Scanner;
 class FriendsComparison {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter details for Amar, Akbar, and Anthony:");
        
        
        System.out.print("Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Amar's height (cm): ");
        double amarHeight = scanner.nextDouble();
        
        System.out.print("Akbar's age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Akbar's height (cm): ");
        double akbarHeight = scanner.nextDouble();
    
        System.out.print("Anthony's age: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Anthony's height (cm): ");
        double anthonyHeight = scanner.nextDouble();
        
       
        String youngest;
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            youngest = "Amar";
        } else if (akbarAge < anthonyAge) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }
        
       
        String tallest;
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            tallest = "Amar";
        } else if (akbarHeight > anthonyHeight) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }
     
        System.out.println("\n=== RESULTS ===");
        System.out.println("Youngest friend: " + youngest + " (age: " + 
            (youngest.equals("Amar") ? amarAge : 
             youngest.equals("Akbar") ? akbarAge : anthonyAge) + ")");
        System.out.println("Tallest friend: " + tallest + " (height: " + 
            (tallest.equals("Amar") ? amarHeight : 
             tallest.equals("Akbar") ? akbarHeight : anthonyHeight) + " cm)");
        
    
    }
}
