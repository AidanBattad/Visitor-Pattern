public class Desk implements Shipping {
    private double distance;
    private static final double BASE_PRICE = 700;

    public Desk(double distance) {
        this.distance = distance;
    }

    @Override
    public String accept(ShipInfo info) {
        return info.showFurnitureInformation("Desk", "Lightweight");
    }

    @Override
    public double accept(ShippingCostCalcu calculator) {
        return calculator.calculateShippingCost(this);
    }

    @Override
    public String getFurnitureType() {
        return "Desk";
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
