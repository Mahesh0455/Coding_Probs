package Patterns;
import java.util.*;

public class P2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					System.out.print(" * ");
				}
				System.out.print(" ");
				
				
			}
			System.out.println();
		}
	}

}
