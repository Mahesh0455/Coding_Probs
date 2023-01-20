package basic;



import java.util.Scanner;

public class P15 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		boolean isNeon=checkNeon(num);
		
		if(isNeon) {
			System.out.println("Neon Number");
		}else {
			System.out.println("Non Neon Number");
		}
		
		
		
	}
	
	public static boolean checkNeon(int n) {
		int res=n*n;
		int sum=0;
		
		while(res>0) {
			int digit=res%10;
			sum=sum+digit;
			res=res/10;
		}
		
		if(sum==n) {
			return true;
		}
		return false;
	}

}
