public class TestCampusMap {
    public static void main(String[] args) {
        CampusMap campus = new CampusMap();

        System.out.println("--- Registering Buildings & Fountains ---");
      
        MyRectangle scienceHall = new MyRectangle(450, 550, 550, 450); 

        MyRectangle library = new MyRectangle(100, 900, 300, 700); 
   
        MyCircle centralFountain = new MyCircle(500, 500, 15); 

        campus.addBuilding(scienceHall);
        campus.addBuilding(library);
        campus.addFountain(centralFountain);

        System.out.println("\n--- Testing Edge Case Walkway (Unregistered Building) ---");
        MyRectangle unregisteredBuilding = new MyRectangle(0, 50, 50, 0);
        campus.addWalkway(scienceHall, unregisteredBuilding); 

        System.out.println("\n--- Adding Valid Walkway ---");
        campus.addWalkway(scienceHall, library);

        System.out.println("\n--- Campus Metrics ---");
        System.out.printf("Total Walkway Length: %.2f meters\n", campus.calculateTotalWalkwayLength());
        System.out.printf("Total Fountain Area: %.2f sq meters\n", campus.calculateTotalFountainArea());

        System.out.println("\n--- Testing Walkway Existence Checks ---");
        System.out.println("Walkway between Science Hall & Library? " + campus.isWalkwayFromTo(scienceHall, library));
        System.out.println("Walkway between Library & Unregistered? " + campus.isWalkwayFromTo(library, unregisteredBuilding));
    }
}
