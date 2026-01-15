import java.util.Scanner;

class Handshakes  
{
    public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        
     System.out.print("numberOfStudents: ");
           int x = input.nextInt();
           
        int handshakes = (x * (x - 1)) / 2;
        
     System.out.println("Maximum number of handshakes possible is " + handshakes);
        
       
            }
       }
