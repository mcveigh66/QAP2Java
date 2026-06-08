public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor 1
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Constructor 2
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters and Setters
    public MyPoint getTopLeft() { return topLeft; }
    public void setTopLeft(MyPoint topLeft) { this.topLeft = topLeft; }

    public MyPoint getBottomRight() { return bottomRight; }
    public void setBottomRight(MyPoint bottomRight) { this.bottomRight = bottomRight; }

    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Calculates area
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Calculates perimeter
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft.toString() + ",bottomRight=" + bottomRight.toString() + 
               ", width=" + getWidth() + ", height=" + getHeight() + "]";
    }
}