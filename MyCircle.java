public class MyCircle {
    private final MyPoint center;
    private final int radius;

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyPoint getCenter() { return center; }
    public int getRadius() { return radius; }

    // Area calculation
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "MyCircle[center=" + center.toString() + ",radius=" + radius + "]";
    }
}
