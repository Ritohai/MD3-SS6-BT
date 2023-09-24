package BT6;

public class BT6 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"ken", 21,true,10);
        Employee employee2 = new Employee(2,"ken1", 22,true,11);
        Employee employee3 = new Employee(3,"ken2", 23,false,12);
        Employee employee4 = new Employee(4,"ken3", 24,true,13);
        Employee employee5 = new Employee(5,"ken4", 25,false,14);
        System.out.println(employee1.calSalary());
        System.out.println(employee2.calSalary());
        System.out.println(employee3.calSalary());
        System.out.println(employee4.calSalary());
        System.out.println(employee5.calSalary());
        System.out.println(employee1.displayData());
        System.out.println(employee2.displayData());
        System.out.println(employee3.displayData());
        System.out.println(employee4.displayData());
        System.out.println(employee5.displayData());
    }
}
