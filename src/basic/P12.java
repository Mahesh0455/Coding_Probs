package basic;
import java.util.*;

public class P12 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		getPrimeList(n);
		
	}
	
	public static void getPrimeList(int n) {
		int num=n;
		
		
		
		for(int i=2;i<=n;i++) {
			boolean a=checkPrime(i);
			if(a) {
				System.out.print(i+" ");
			}
	
		}
		

		
	}

	private static boolean checkPrime(int n) {
		
		int check=n/2;
		
		for(int i=2;i<=check;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
		
		
	}

}
