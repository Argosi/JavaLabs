package Practice3;

public class CircleTest {
    public static void main(String[] args) {
    Circle circ = new Circle();
    circ.setX(8);
    circ.setY(9);
    circ.setRad(12);
    System.out.println("X : " + circ.getX());
    System.out.println("Y : " + circ.getY());
    System.out.println("rad: " + circ.getRad());
    }
}
class Circle{
    private double x=0;
    private double y=0;
    private double rad=0;

    public double getRad() {
        return rad;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
