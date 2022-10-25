package basic;


/*Swap 2 numbers using third variable*/

public class P6 {
	
	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		System.out.println("Before Swap: a="+a+" b="+b);
		
		int c=a;
		a=b;
		b=c;
		System.out.println("After Swap: a="+a+" b="+b);
	}

}
