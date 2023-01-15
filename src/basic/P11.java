package basic;

import java.util.*;

//Check prime numbers

public class P11 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		if(checkPrime(n)) {
			System.out.println("Number:"+n+" is Prime Number");
		}else {
			System.out.println("Number:"+n+" is not a prime number");
		}
		
		
	}
	
	public static boolean checkPrime(int a) {
		
		int check=a/2;
		
		if(a==2 ) {
			return true;
			
		}
		
		for(int i=2;i<=check;i++) {
			if(a%i==0) {
				return false;
			}
		}
		
		
		return true;
	}

}
