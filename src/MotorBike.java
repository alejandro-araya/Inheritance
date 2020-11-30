public class MotorBike extends Vehicle{

    protected String bikeType;

    public MotorBike(String brand, String color, int fabricationYear, int getWheelCount, String bikeType) {
        super(brand, color, fabricationYear, getWheelCount);
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    @Override
    public String toString() {
        return "MotorBike { "  +
                " bikeType= ' " + bikeType + '\'' +
                ", brand=' " + brand + '\'' +
                ", color=' " + color + '\'' +
                ", fabricationYear= " + fabricationYear +
                ", getWheelCount= " + getWheelCount +
                '}';
    }
}
