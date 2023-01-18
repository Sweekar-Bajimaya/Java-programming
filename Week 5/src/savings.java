public class savings {
    int principal, rate, time, simple_interest;
}
class interest{
    public static void main(String[]args){
        savings parameter = new savings();
        parameter.principal = 1500;
        parameter.rate = 7;
        parameter.time = 5;
        parameter.simple_interest = (parameter.principal* parameter.rate * parameter.time)/100;
        System.out.println("Simple interest is: " + "Rs " + parameter.simple_interest);

    }
}
