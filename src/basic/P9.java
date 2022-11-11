package basic;

import java.util.Scanner;

//check odd or even numbers
public class P9 {
	
	
	public static void main(String[] args) {
		
		P9 p=new P9();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter a NUmber");
		int a=sc.nextInt();
		boolean b=false;
		b=p.checkOddEven(a);
		
		if(b) {
			System.out.println("The given number is Even Number");
		}else {
			System.out.println("The given number is Odd number");
		}
		
		
	}
	
	public boolean checkOddEven(int a) {
		
		if(a%2 == 0 || a==0 || a==1) {
			return true;
		}
		
		
		return false;
	}

}
