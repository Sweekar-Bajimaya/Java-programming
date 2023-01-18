import java.util.Scanner;
public class calculator {
    public static void main (String [] args ){
        char operator;
        Double num1, num2, sum, product, difference, quotient;
        Scanner n = new Scanner(System.in);
        System.out.print("For an operation choose a number: 1(+), 2(-), 3(*), 4 (/); ");
        operator = n.next().charAt(0);

        System.out.println("Enter a number: ");
        num1 = n.nextDouble();

        System.out.println("Enter a second number: ");
        num2 = n.nextDouble();

        switch (operator){
            case  '1':
                sum = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + sum);
                break;

            case '2':
                difference = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = "+ difference);
                break;

            case '3':
                product = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = "+ product);
                break;

            case '4':
            quotient = num1/num2;
            System.out.println(num1 + " / " + num2 + " = " + quotient);
            break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        n.close();
    }
}
