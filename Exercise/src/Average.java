import java.util.Scanner;
public class Average {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int number = s.nextInt();
        int [] physics = new int[number];

        System.out.println("Enter the marks of students in physics: ");
        for (int i = 0; i<number; i++){
            int marks = s.nextInt();
            physics[i]= marks;
        }
        int length = physics.length;
        int sum = 0;
        for (int j = 0; j < physics.length; j++){
            sum += physics[j];
        }
        double average = sum / length;
        System.out.println("Average marks of students in physics is : "+ average);
    }
}


