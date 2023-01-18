import java.util.Arrays;
public class Sorting{
    static int Sorted(int arr[], int n){
        if (n == 1 || n == 0){
            return 1;
        }
        if (arr[n-1]< arr[n-2]){
            return 0;
        }
        return Sorted(arr, n-1);
    }
    public static void main(String []args){
        int num[] = {30, 60, 50, 40, 20};
        int n = num.length;
        if (Sorted(num, n) !=0) {
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}
