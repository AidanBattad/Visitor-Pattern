public class ShippingCost implements ShippingCostCalcu {
    private static final double FLAT_RATE = 20.0;  // Updated flat rate

    @Override
    public double calculateShippingCost(Shipping furniture) {
        double price;
        switch (furniture.getFurnitureType()) {
            case "Chair":
                price = 500;  // Updated price
                return price + FLAT_RATE;
            case "Sofa":
                price = 3500;  // Updated price
                return price + (furniture.getDistance() * FLAT_RATE);
            case "Bed":
                price = 8000;  // Updated price
                return price + (furniture.getDistance() * FLAT_RATE);
            case "Desk":
                price = 700;  // Updated price
                return price + FLAT_RATE;
            default:
                return 0;
        }
    }
}
