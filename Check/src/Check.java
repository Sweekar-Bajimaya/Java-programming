public class Check {
    public static void main(String[] args) {
    	int num;
    	int product = 1;
    	String a = System.console()readLine("Enter a number: ");
    	num = Integer.parseInt(a);
    	product *=num;
    	while nume(num!= 0) {
    		a = System.console()readLine("Enter any no or 0 to stop");
    		num = Integer.parseInt(a);
    		 if (num!= 0){
    			 product *= num;
    		 }
    		 else{
    			 break;
    		 }
    	}
    	System.out.printf("product = %d", product);    	
    }    
}