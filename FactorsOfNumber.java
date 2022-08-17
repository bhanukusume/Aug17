package Aug17;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter any number");
		Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        for(int i=1; i<=n;i++) {
        	if(n%i==0) {
        		System.out.print(i+" ");
        	}
        }
	}

}
