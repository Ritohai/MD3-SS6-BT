package BT2;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số thứ nhất: ");
        double a = sc.nextDouble();
        System.out.println("Nhập hệ số thứ hai: ");
        double b = sc.nextDouble();
        System.out.println("Nhập hệ số thứ ba: ");
        double c = sc.nextDouble();
        QuadraticEquation q = new QuadraticEquation(a, b, c);
        System.out.println(q.getDiscriminant());
        if (q.getDiscriminant() > 0) {
            System.out.println("Pt có 2 nghiệm: ");
            System.out.println("Nghiệm thứ nhất là: " + q.getRoot1());
            System.out.println("Nghiệm thứ hai là: " + q.getRoot2());
        } else if (q.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else {
            System.out.println("Pt có nghiệm kép: " + q.getRoot2());
        }
    }
}
