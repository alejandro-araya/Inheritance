public class Vehicle {


    protected String brand;
    protected String color;
    protected int fabricationYear;
    protected int getWheelCount;

    protected void accelerate(){
    }
    protected void breaks(){
    }
    protected void turnLeft(){
    }
    protected void turnRight(){
    }

    public Vehicle(String brand, String color, int fabricationYear, int getWheelCount) {
        this.brand = brand;
        this.color = color;
        this.fabricationYear = fabricationYear;
        this.getWheelCount = getWheelCount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    public int getGetWheelCount() {
        return getWheelCount;
    }

    public void setGetWheelCount(int getWheelCount) {
        getWheelCount = getWheelCount;
    }
}
