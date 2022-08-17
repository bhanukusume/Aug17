package Aug17;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,c,rem,sum=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any number");
		n=scan.nextInt();
		c=n;
		while(n>0) {
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
			
		}
       if(c==sum) {
    	   System.out.println(" the given number is palindrome");
       }
       else {
    	   System.out.println(" Its not a palindrome number");
       }
	}

}
