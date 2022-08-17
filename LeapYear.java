package Aug17;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter any year:");
	      Scanner scan = new Scanner(System.in);
	      n=scan.nextInt();
	      if(n%100==0 && n%400==0 || n%100!=0 && n%4==0 ) {
	    	  System.out.println("Its leap year");
	      }
	      else {
	    	  System.out.println("Its not a leap year");
	      }
	}

}
