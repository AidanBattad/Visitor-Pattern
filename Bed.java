public class Bed implements Shipping {
    private double distance;
    private static final double BASE_PRICE = 8000;

    public Bed(double distance) {
        this.distance = distance;
    }

    @Override
    public String accept(ShipInfo info) {
        return info.showFurnitureInformation("Bed", "Heavyweight");
    }

    @Override
    public double accept(ShippingCostCalcu calculator) {
        return calculator.calculateShippingCost(this);
    }

    @Override
    public String getFurnitureType() {
        return "Bed";
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
