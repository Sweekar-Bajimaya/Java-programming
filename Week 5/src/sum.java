public class sum {
    int a, b, sum;
}
class findsum{
    public static void main(String args[]){
        sum num = new sum();
        num.a = 15;
        num.b = 10;
        num.sum = num.a + num.b;
        System.out.println("the sum of " + num.a  + " + " + num.b + " is: "+  num.sum);
    }
}
