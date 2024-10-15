public class circle {
    private double radius;
    public circle(){
        this.radius = 1.0;
    }
    public circle(double radius){
         this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea (){
        return radius * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "circle{radius=" + radius + ']';
    }
}
