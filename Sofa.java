public class Sofa implements Shipping {
    private double distance;
    private static final double BASE_PRICE = 3500;

    public Sofa(double distance) {
        this.distance = distance;
    }

    @Override
    public String accept(ShipInfo info) {
        return info.showFurnitureInformation("Sofa", "Heavyweight");
    }

    @Override
    public double accept(ShippingCostCalcu calculator) {
        return calculator.calculateShippingCost(this);
    }

    @Override
    public String getFurnitureType() {
        return "Sofa";
    }

    @Override
    public double getDistance() {
        return distance;
    }

    @Override
    public double getBasePrice() {
        return BASE_PRICE;
    }
}
