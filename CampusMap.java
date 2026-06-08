import java.util.ArrayList;
import java.util.List;

public class CampusMap {
    private final List<MyLine> walkways;
    private final List<MyRectangle> buildings;
    private final List<MyCircle> fountains;

    public CampusMap() {
        this.walkways = new ArrayList<>();
        this.buildings = new ArrayList<>();
        this.fountains = new ArrayList<>();
    }

    // Adds a building to the campus map
    public void addBuilding(MyRectangle building) {
        buildings.add(building);
        System.out.println("Building added successfully.");
    }

    // Connects the centers of two specified buildings with a walkway
    public void addWalkway(MyRectangle from, MyRectangle to) {
        if (!buildings.contains(from) || !buildings.contains(to)) {
            System.out.println("Error: One or both buildings are not registered on this campus map!");
            return;
        }

        // Calculate center 
        int fromCenterX = from.getTopLeft().getX() + (from.getWidth() / 2);
        int fromCenterY = from.getBottomRight().getY() + (from.getHeight() / 2);

        int toCenterX = to.getTopLeft().getX() + (to.getWidth() / 2);
        int toCenterY = to.getBottomRight().getY() + (to.getHeight() / 2);

        MyLine walkway = new MyLine(fromCenterX, fromCenterY, toCenterX, toCenterY);
        walkways.add(walkway);
        System.out.println("Walkway added connecting building centers.");
    }

    // Adds a fountain to the campus map
    public void addFountain(MyCircle fountain) {
        fountains.add(fountain);
        System.out.println("Fountain added successfully.");
    }

    public double calculateTotalWalkwayLength() {
        double totalLength = 0;
        for (MyLine walkway : walkways) {
            totalLength += walkway.getLength();
        }
        return totalLength;
    }

    public double calculateTotalFountainArea() {
        double totalArea = 0;
        for (MyCircle fountain : fountains) {
            totalArea += fountain.getArea();
        }
        return totalArea;
    }

    public boolean isWalkwayFromTo(MyRectangle fromBuilding, MyRectangle toBuilding) {
        int fromCenterX = fromBuilding.getTopLeft().getX() + (fromBuilding.getWidth() / 2);
        int fromCenterY = fromBuilding.getBottomRight().getY() + (fromBuilding.getHeight() / 2);
        int toCenterX = toBuilding.getTopLeft().getX() + (toBuilding.getWidth() / 2);
        int toCenterY = toBuilding.getBottomRight().getY() + (toBuilding.getHeight() / 2);

        for (MyLine walkway : walkways) {
            boolean straightMatch = (walkway.getBeginX() == fromCenterX && walkway.getBeginY() == fromCenterY &&
                                     walkway.getEndX() == toCenterX && walkway.getEndY() == toCenterY);
            boolean reverseMatch = (walkway.getBeginX() == toCenterX && walkway.getBeginY() == toCenterY &&
                                    walkway.getEndX() == fromCenterX && walkway.getEndY() == fromCenterY);
            
            if (straightMatch || reverseMatch) {
                return true;
            }
        }
        return false;
    }
}
