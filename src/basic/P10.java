package basic;
import java.util.*;


//Program to check greater number from 3 numbers
public class P10 {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		P10 p=new P10();
		
		System.out.println("ENter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter a 2nd NUmber");
		int num2=sc.nextInt();
		System.out.println("ENter the 3rd Number");
		int num3=sc.nextInt();
		
		System.out.println("The greater number is: "+p.findGreaterNumber(num1, num2, num3));
		
	
	}
	
	public int findGreaterNumber(int num1,int num2,int num3) {
		
		
		if(num1>num2) {
			if(num1>num3) {
				return num1;
			}else {
				return num3;
			}
		}else if(num2>num1) {
					if(num2>num3) {
						return num2;
					}else {
						return num2;
					}
			
		}
		return num2;
		
		
	}

}
