package basic;

/*Java Program to print Multiplication of two floating
 * point number
*/
public class P4 {
	
	public static void main(String[] args) {
		P4 p=new P4();
		
		float res=p.multiply(10.5f, 2.5f);
		
		System.out.println(res);
		
		

	}
	
	public float multiply(float a,float b) {
		
		float res=0.0f;
		res=a*b;
		
		
		return res; 
	}

}
