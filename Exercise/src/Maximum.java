import java.util.Arrays;
public class Maximum {
    public static void main(String [] args){
        Integer [] num = {12, 45, 55, 89, 34};
        System.out.println("The values in array are: " + Arrays.asList(num));
        int max = num[0];
        for (int i = 1; i<num.length; i++){
            if (num[i] > max){
                max = num[i];
            }
        }
        System.out.println("The largest element is: "+ max);
    }
}


