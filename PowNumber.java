package Aug17;

import java.util.Scanner;

public class PowNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,p,result=1;
		System.out.println("Enter number");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		System.out.println("Enter power");
        p=scan.nextInt();
        for(int i=1;i<=p;i++) {
        	 result=n*result;
        }
        System.out.println("Power " +result);
	}

}
