import java.util.Scanner;
public class Average {
    int a, b, c, avg;
}
class output{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int numa = sc.nextInt();
        System.out.print("Enter second Number: ");
        int numb = sc.nextInt();
        System.out.print("Enter third number: ");
        int numc = sc.nextInt();

        Average number = new Average();
        number.a = numa;
        number.b = numb;
        number.c = numc;
        number.avg = (number.a + number.b + number.c)/3;
        System.out.println("The Average of the given inputs " + numa +", " + numb + ", " + numc + ", " + "is: " + number.avg);
    }
}