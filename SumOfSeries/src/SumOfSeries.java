import java.util.*;
public class SumOfSeries {
	private static final String Scanner = null;

	static int fun(int n)  
    {  
        int i, sum = 0;  
        for (i = 2; i <= n; i+=2) {  
            sum += i;  
        }  
        return sum;   
    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number: ");  
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  
        System.out.println("Sum of all even numbers from 1 to " + n + " is: " + fun(n));  
        
	}

}
