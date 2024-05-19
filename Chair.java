public class Chair implements Shipping {
    private double distance;
    private static final double BASE_PRICE = 500;

    public Chair(double distance) {
        this.distance = distance;
    }

    @Override
    public String accept(ShipInfo info) {
        return info.showFurnitureInformation("Chair", "Lightweight");
    }

    @Override
    public double accept(ShippingCostCalcu calculator) {
        return calculator.calculateShippingCost(this);
    }

    @Override
    public String getFurnitureType() {
        return "Chair";
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
