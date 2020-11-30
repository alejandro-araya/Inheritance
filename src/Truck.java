public class Truck extends Vehicle{

    protected String truckType;

    public Truck(String brand, String color, int fabricationYear, int getWheelCount, String truckType) {
        super(brand, color, fabricationYear, getWheelCount);
        this.truckType = truckType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }


    @Override
    public String toString() {
        return "Truck { " +
                " truckType= ' " + truckType + '\'' +
                ", brand=' " + brand + '\'' +
                ", color=' " + color + '\'' +
                ", fabricationYear= " + fabricationYear +
                ", getWheelCount= " + getWheelCount +
                '}';
    }
}
