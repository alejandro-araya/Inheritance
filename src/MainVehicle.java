public class MainVehicle {

    public static void main (String[] args) {
        Manual car1 = new Manual("Toyota ", "Black ", 2018, 4,"Manual");
        Automatic car2 = new Automatic("Nissan ", "Red ", 2020, 4,"Automatic");

        Wagon truck1 = new Wagon("Renault ", "White ", 2010, 6);
        FireTruck truck2 = new FireTruck("Volvo ", "Blue ", 2015, 8);

        TouringBike bike1 = new TouringBike("BMW ", "Grey ", 2017, 2);
        SportBike bike2 = new SportBike("Yamaha ", "Yellow ", 2005, 2);

        System.out.println(car1 + " " + car2);
        System.out.println(truck1 + " " + truck2);
        System.out.println(bike1 + " " + bike2);
    }

}
