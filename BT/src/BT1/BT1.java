package BT1;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        int radius = sc.nextInt();
        System.out.println("Nhập màu sắc: ");
        String color = sc.next();
        Circle circle = new Circle(radius, color);
        System.out.println(circle.inputData());
        System.out.println(circle.displayData());
    }
}
