public class TestMyRectangle {
    public static void main(String[] args) {
        System.out.println("--- Testing MyRectangle Constructor 1 (Coordinates) ---");
        MyRectangle rect1 = new MyRectangle(1, 5, 5, 1);
        System.out.println(rect1.toString());
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area (Should be 16): " + rect1.getArea());
        System.out.println("Perimeter (Should be 16): " + rect1.getPerimeter());

        System.out.println("\n--- Testing MyRectangle Constructor 2 (Points) ---");
        MyPoint p1 = new MyPoint(0, 10);
        MyPoint p2 = new MyPoint(10, 0);
        MyRectangle rect2 = new MyRectangle(p1, p2);
        System.out.println(rect2.toString());
        System.out.println("Area (Should be 100): " + rect2.getArea());
        System.out.println("Perimeter (Should be 40): " + rect2.getPerimeter());
    }
}
