/*
	ISYS 320
	Name(s): DAVE RAPP
	Date: 4-5-18
*/
import java.util.Scanner;
public class P8_ThresholdCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers are in the series?");
        int n = sc.nextInt();
        
        
        System.out.println("Whats the threshold??");
        int threshold = sc.nextInt();

        double product = 1.0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter a number");
            int n11 = sc.nextInt();
        }
        if ( product >= 0 );
        System.out.println("The count of numbers above the threshold is " + (product >= threshold));
	}

}
