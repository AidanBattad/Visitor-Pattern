public interface Shipping {
    String accept(ShipInfo info);
    double accept(ShippingCostCalcu calculator);
    String getFurnitureType();
    double getDistance();
    double getBasePrice();  // Added to return the base price of the furniture
}
