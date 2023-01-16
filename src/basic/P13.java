package basic;
import java.util.*;

/*Java Program to Find if a Given Year is a Leap Year
*/
public class P13 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=sc.nextInt();
		
	  checkLeapYear(year);
		
	}

	private static void checkLeapYear(int year) {
		
		if (year%100==0 && year%4==0) {
			System.out.println("Given Year:"+year+" is a Leap year");
		}else if(year%4==0) {
			System.out.println("Given Year:"+year+" is a Leap year");
		}else {
			System.out.println("Given Year:"+year+" is not a leap year");
		}
		
		
	}

}
