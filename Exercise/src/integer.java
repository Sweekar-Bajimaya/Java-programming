public class integer{
    public static void main(String [] args){
        int [] num = {1, 2, 3, 4, 5};
        int i = 3;
        int j = 6;
        boolean found = false;

        for (int n : num ){
            if(n == i || n ==j){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println(i + " is present in Array");
        }
        else{
            System.out.println(j + " is not present in Array");
        }
    }
}

