import java.util.Scanner;

 class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();
        
        
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();
        
      
        if (salary < 0) {
            System.out.println("Salary cannot be negative.");
            
        }
        
        if (yearsOfService < 0) {
            System.out.println("Years of service cannot be negative.");
           
        }
        
        double bonus = 0.0;
        
        
        if (yearsOfService > 5) {
            bonus = salary * 0.05;  // 5% of salary
            System.out.println("Congratulations! You qualify for a bonus.");
        } else {
            System.out.println("No bonus - Years of service <= 5 years.");
        }
        
        
        System.out.printf("Salary: ₹%.2f%n", salary);
        System.out.printf("Years of Service: %d years%n", yearsOfService);
        System.out.printf("Bonus Amount: ₹%.2f%n", bonus);
        
  
    }
}
