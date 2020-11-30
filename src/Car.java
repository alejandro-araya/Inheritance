public class Car extends Vehicle {

    protected String transmission;

    public Car(String brand, String color, int fabricationYear, int getWheelCount, String transmission) {
        super(brand, color, fabricationYear, getWheelCount);
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car { " +
                " transmission= ' " + transmission + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", fabricationYear=" + fabricationYear +
                ", getWheelCount=" + getWheelCount +
                '}';
    }
}
