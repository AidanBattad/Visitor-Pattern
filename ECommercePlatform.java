package visitorPattern;

public class ECommercePlatform {

    public static void main(String[] args) {
        
        Shipping chair = new Furniture("Chair", "Lightweight", 400, 5);
        Shipping sofa = new Furniture("Sofa", "Heavyweight", 3000, 4);
        Shipping bed = new Furniture("Bed", "Heavyweight", 7000, 9);
        Shipping desk = new Furniture("Desk", "Lightweight", 600, 2);

        ShippingDetails details = new FurnitureInformation();
        ShippingCostCalculator calculator = new ShippingCost();

        System.out.println("FURNITURE SHOP\n");

        System.out.println("Order Details\n");

        System.out.println(details.showFurnitureInformation(chair.getFurnitureType(), chair.getFurnitureSize()));
        System.out.println("Distance: " + chair.getDistance() + "km");
        System.out.println("Shipping Cost: ₱" + calculator.calculateShippingCost(chair.getFurnitureType(), chair.getDistance()) + "\n");
        
        System.out.println(details.showFurnitureInformation(sofa.getFurnitureType(), sofa.getFurnitureSize()));
        System.out.println("Distance: " + sofa.getDistance() + "km");
        System.out.println("Shipping Cost: ₱" + calculator.calculateShippingCost(sofa.getFurnitureType(), sofa.getDistance()) + "\n");

        System.out.println(details.showFurnitureInformation(bed.getFurnitureType(), bed.getFurnitureSize()));
        System.out.println("Distance: " + bed.getDistance() + "km");
        System.out.println("Shipping Cost: ₱" + calculator.calculateShippingCost(bed.getFurnitureType(), bed.getDistance()) + "\n");
        
        System.out.println(details.showFurnitureInformation(desk.getFurnitureType(), desk.getFurnitureSize()));
        System.out.println("Distance: " + desk.getDistance() + "km");
        System.out.println("Shipping Cost: ₱" + calculator.calculateShippingCost(desk.getFurnitureType(), desk.getDistance()) + "\n");

    }}
