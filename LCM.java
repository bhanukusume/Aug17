package Aug17;

import java.util.Scanner;
/*Least Common Multipler
50,60=300
product of two numbers=gcd*lcm 
a*b=gcd*lcm
lcm=50*60/10
lcm=300
*/
public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any  two number");
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int g=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0 && b%i==0) 
				g=i;
			}
			int lcm=a*b/g;
			System.out.println("LCM "+lcm);
		

	}

}
