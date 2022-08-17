package Aug17;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting value");
		int start=sc.nextInt();
		System.out.println("enter the ending value");
		int end=sc.nextInt();
		int sum=0;
		while(start<=end) {
			sum=sum+start;
			start++;
			
		}
		System.out.println("Sum is :" +sum);
		

	}

}
