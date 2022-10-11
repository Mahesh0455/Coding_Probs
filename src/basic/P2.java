package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Way-1: to read from console
 * Using Buffered Reader class
*/
public class P2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader=new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Enter a new line");
		
		String Name=reader.readLine();
		
		
		System.out.println("Name is: "+Name);
	}

}
