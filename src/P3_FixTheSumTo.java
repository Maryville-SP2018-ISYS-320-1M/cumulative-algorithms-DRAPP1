/*
ISYS 320 DONE DONE DONE!!!
	Name(s): Dave Rapp
	Date: 4-5-18
*/

/*
3. What problems did you identify in the sumTo method below?
- Added an int
- added return statement
- should count to 5

*/

public class P3_FixTheSumTo {

	public static void main(String[] args) {
		int totalSum = sumTo( 5 );
		System.out.println("The total sum is: " + totalSum );

	}
	
	public static int sumTo(int n) { 
	    for (int i = 1; i <= n; i++) {
	        int sum = 0; 
	        sum += i;
	    }
		return n;
	}

}
