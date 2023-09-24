package BT4;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fan fan1 = new Fan(3, true, 10, "yellow");
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Tắt ");
            System.out.println("2. Tốc độ 1 ");
            System.out.println("3. Tốc độ 2 ");
            System.out.println("4. Tốc độ 3 ");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (fan1.isStatus() == true) {
                        fan1.setStatus(false);
                        System.out.println("Màu sắc: " + fan1.getColor());
                        System.out.println("Bán kính: " + fan1.getRadius());
                        System.out.println("Quạt tắt.");
                    }
                    break;
                case 2:
                    if (fan1.isStatus() == true) {
                        if (fan1.getSpeed() != 1) {
                            fan1.setSpeed(1);
                            System.out.println("Tốc độ: " + fan1.getSLOW());
                            System.out.println("Bán kính: " + fan1.getRadius());
                            System.out.println("Màu sắc: " + fan1.getColor());
                            System.out.println("Quạt bật.");
                        }
                    } else {
                        fan1.setStatus(true);
                        fan1.setSpeed(1);
                        System.out.println("Tốc độ: " + fan1.getSLOW());
                        System.out.println("Bán kính: " + fan1.getRadius());
                        System.out.println("Màu sắc: " + fan1.getColor());
                        System.out.println("Quạt bật.");
                    }
                    break;
                case 3:
                    if (fan1.isStatus() != true) {
                        if (fan1.getSpeed() != 2) {
                            fan1.setSpeed(2);
                            System.out.println("Tốc độ: " + fan1.getMEDIUM());
                            System.out.println("Bán kính: " + fan1.getRadius());
                            System.out.println("Màu sắc: " + fan1.getColor());
                            System.out.println("Quạt bật.");
                        }
                    } else {
                        fan1.setStatus(true);
                        fan1.setSpeed(1);
                        System.out.println("Tốc độ: " + fan1.getMEDIUM());
                        System.out.println("Bán kính: " + fan1.getRadius());
                        System.out.println("Màu sắc: " + fan1.getColor());
                        System.out.println("Quạt bật.");
                    }
                    break;
                case 4:
                    if (fan1.isStatus() != true) {
                        System.out.println("Tốc độ: " + fan1.getFAST());
                        System.out.println("Bán kính: " + fan1.getRadius());
                        System.out.println("Màu sắc: " + fan1.getColor());
                        System.out.println("Quạt bật.");
                    } else {
                        fan1.setStatus(true);
                        fan1.setSpeed(1);
                        System.out.println("Tốc độ: " + fan1.getFAST());
                        System.out.println("Bán kính: " + fan1.getRadius());
                        System.out.println("Màu sắc: " + fan1.getColor());
                        System.out.println("Quạt bật.");
                    }
                    break;
                default:
                    System.out.println("Nhập lựa chọn từ 1 -> 4. ");
                    break;
            }
        }


    }
}
