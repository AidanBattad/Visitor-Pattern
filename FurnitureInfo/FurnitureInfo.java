
public class FurnitureInfo implements ShipInfo {
    @Override
    public String showFurnitureInformation(String furnitureType, String furnitureSize) {
        if (furnitureSize.equals("Lightweight")) {
            return "You ordered " + furnitureType + ", a lightweight furniture. This will only have a flat shipping rate.";
        } else if (furnitureSize.equals("Heavyweight")) {
            return "You ordered " + furnitureType + ", a heavyweight furniture. This will require an additional cost in shipping rate and will require additional care.";
        } else {
            return "The furniture size can't be identified.";
        }
    }
}
