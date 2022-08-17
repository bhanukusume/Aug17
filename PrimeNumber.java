package Aug17;

import java.util.Scanner;
//The number only divided by 1 ,and itself
//1,3,5,7,11...
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=1,count=0;
      System.out.println("Enter any number:");
      Scanner scan = new Scanner(System.in);
      n=scan.nextInt();
      
    	  for(int i=1;i<=n;i++) {
    		 
    		  if(n%i== 0) {
    			  count++;
    			  
    		  }
    	  }
      
      if(count==2){
    	  System.out.println("The number is prime number");
      }
      else{
    	  System.out.println("It is not a prime number:");
      }
	}
}

