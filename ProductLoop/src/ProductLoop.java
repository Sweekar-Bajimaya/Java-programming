
import java.util.*;
public class ProductLoop {
	public static void main(String[] args) {
		int num;
		int product = 1;
		String a = System.out.println("Enter a number: ");
		num = Integer.parseInt(a);
		num = Integer.parseInt(a); 
		while (num != 0) {
			a = System.console().readLine("Enter first number"); 
			num = Integer.parseInt(a); 
			product = product * num; 
		}
		System.out.println(product);
	}
}

	
