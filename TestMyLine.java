public class TestMyLine {
    public static void main(String[] args) {
        System.out.println("--- Testing MyLine Constructor 1 (Coordinates) ---");
        MyLine line1 = new MyLine(1, 2, 4, 6);
        System.out.println(line1.toString());
        System.out.printf("Length: %.2f\n", line1.getLength());
        System.out.printf("Gradient (radians): %.2f\n", line1.getGradient());

        System.out.println("\n--- Testing MyLine Constructor 2 (Points) ---");
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println(line2.toString());
        System.out.printf("Length (Should be 5.0): %.2f\n", line2.getLength());

        System.out.println("\n--- Testing Getters and Setters ---");
        line2.setBeginX(1);
        line2.setBeginY(1);
        line2.setEndX(5);
        line2.setEndY(5);
        System.out.println("Modified Line 2: " + line2.toString());
        System.out.printf("New Length: %.2f\n", line2.getLength());
    }
}
