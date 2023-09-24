package BT6;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private boolean gen;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int age, boolean gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
    }

    public Employee(int employeeId, String employeeName, int age, boolean gen, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }
    public Employee inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào id nhân viên : ");
        int id = sc.nextInt();
        System.out.println("Nhập tên nhân viên: ");
        String nameEmploy = sc.next();
        System.out.println("Nhập tuổi nhân viên: ");
        int age = sc.nextInt();
        System.out.println("Nhập giới tính: ");
        boolean gen = sc.nextBoolean();
        System.out.println("Hệ số lương: ");
        double rate = sc.nextDouble();
        Employee employee = new Employee(id, nameEmploy, age, gen, rate);
        return employee;
    }

    public String displayData() {
        return "Thông tin nhân viên: " + "" +
                "Mã nhân viện: " + employeeId + " | Tên nhân viên: " + employeeName + " |" +
                "Tuổi: " + age + " | Giới tính: " + gen + " |" +
                "Hệ số lương: " + rate + " |  Lương: " + salary;
    }

    public double calSalary() {
        return salary = rate * 1300;
    }



}
