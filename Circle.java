

public class Circle {

    private double radius;
    private String color;

    public void setRaduis(double r) {
        radius = r;

    }

    public void setColor(String s) {
        color = s;

    }

    public double getRadius() {
        return radius;

    }

    public String getColor() {
        return color;

    }

    public double getArea() {

        return Math.PI * Math.pow(radius, 2);
    }

    public double getCirucumference() {

        return Math.PI * 2 * radius;
    }
    public String ToString(){
        return "Circle[" +"radius ]"+radius+" ,color "+this.color+" ]" ;
    }

}
