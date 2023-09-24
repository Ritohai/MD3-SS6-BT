package BT1;

public class Circle {
    private int radius;
    private String color;

    public Circle() {
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double chuvi() {
        double cv = 2 * radius * Math.PI;
        return cv;
    }

    public double dientich() {
        double dt = Math.pow(radius, 2) * Math.PI;
        return dt;
    }

    public String inputData() {
        return "Bán kính là: " + radius + ",\n" +
                "Màu sắc: " + color;
    }

    public String displayData() {
        return "Chu vi là: " + chuvi() + ",\n" +
                "Diện tích là: " + dientich();
    }
}

