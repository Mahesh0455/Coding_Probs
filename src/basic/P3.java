package basic;

import java.util.Scanner;

//Java program to demonstrate working of Scanner in Java

public class P3 {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		String name=sc.nextLine();
		System.out.println("Entered a name is : "+name);
		
		int a=sc.nextInt();
		System.out.println("ENtered integer value is: "+a);
		
		float f=sc.nextFloat();
		System.out.println("ENtered float value is: "+f);
		
		
	}

}
