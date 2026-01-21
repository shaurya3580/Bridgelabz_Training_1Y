import java.util.Scanner;

 class EarthVolume {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print(" radius of Earth in km: ");
        int r = input.nextInt();
		
        
        double volume_Km3 = (4/3)*3.14*r*r*r;
    
        System.out.println("volume in cubic km:-" + volume); 
    }
}
