import java.util.Scanner;

 class VotingEligibility {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("age: ");
        int age = input.nextInt();
        
        if (age >= 18) {
            System.out.println("The person can vote:- " +age);
        } else {
            System.out.println("The person cannot vote.:- " +age);
        }
        
     
    }
}
