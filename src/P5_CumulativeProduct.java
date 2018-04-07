/*
	ISYS 320 DONE DONE DONE!!!
	Name(s): Dave Rapp
	Date: 4-5-18
*/
import java.util.Scanner;
public class P5_CumulativeProduct {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers will you be multiplying?");
        int n = sc.nextInt();

        double product = 1.0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Please enter a value");
            product *= sc.nextDouble();
        }
        System.out.println("The final product is " + product);
    }
}