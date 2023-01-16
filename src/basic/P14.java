package basic;

import java.util.Scanner;

// Armstrong number

public class P14 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int n=num;
		int result=0;
		
		while(num>0) {
			int digit=num%10;
			int digitSum=digit*digit*digit;
			result=result+digitSum;
			num=num/10;	
		}
		
		if(result==n) {
			System.out.println("ArmStrong Number");
		}else {
			System.out.println("Non ArmStrong");
		}
		
	}

}
