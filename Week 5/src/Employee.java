public class Employee {
    String name, address;
    int  age, salary;
    int phone_num;
}
class printsalary{
    public static void main (String []args){
        Employee office = new Employee();
        office.name = "Kapil";
        office.age = 25;
        office.phone_num = 986149450;
        office.address = "Kalanki";
        office.salary = 30000;

        System.out.println("Name: " + office.name);
        System.out.println("Age: " + office.age);
        System.out.println("Phone Number: " + office.phone_num);
        System.out.println("Address: " + office.address);
        System.out.println("Salary: " + "Rs " + office.salary);
    }
}
