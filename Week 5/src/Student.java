public class Student {
    int roll_no;
    String name;
}
class Testing{
    public static void main (String args[]){
        Student s1 = new Student();
        s1.roll_no = 2;
        s1.name = "John";

        System.out.println(s1.roll_no + " " + s1.name);
    }
}




