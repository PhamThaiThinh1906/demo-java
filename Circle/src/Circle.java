public class Circle {
    double radius;
    String color;
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius) {
        this.radius = radius;

    }
    public double Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;

        return radius;
    }
    public double getRadius(double radius) {
        return radius;
    }
    public String getColor(String color) {
        return color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
