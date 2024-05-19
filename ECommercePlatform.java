
public class ECommercePlatform {
    public static void main(String[] args) {
        Shipping chair = new Chair(8);  
        Shipping sofa = new Sofa(6);    
        Shipping bed = new Bed(12);     
        Shipping desk = new Desk(3);    

        ShipInfo info = new FurnitureInfo();
        ShippingCostCalcu calculator = new ShippingCost();

        System.out.println("FURNITURE SHOP\n");
        System.out.println("Order Details\n");

        displayOrderDetails(chair, info, calculator);
        displayOrderDetails(sofa, info, calculator);
        displayOrderDetails(bed, info, calculator);
        displayOrderDetails(desk, info, calculator);
    }
    private static void displayOrderDetails(Shipping furniture, ShipInfo info, ShippingCostCalcu calculator) {
        System.out.println(furniture.accept(info));
        System.out.println("Distance: " + furniture.getDistance() + "km");
        double shippingCost = furniture.accept(calculator);
        double totalPrice = shippingCost + furniture.getBasePrice();
        System.out.println("Base Price: ₱" + furniture.getBasePrice());
        System.out.println("Shipping Cost: ₱" + shippingCost);
        System.out.println("Total Cost: ₱" + totalPrice + "\n");
    }
}
