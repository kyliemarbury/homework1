public class ParkingTester{
    public static void main(String []args){ // static void main wont return anything 
        ParkingLot carholder = new ParkingLot();
        System.out.println(carholder);
        Car car1 = new Car("A", "Infiniti", true);
        int parking = carholder.carspot(car1); //difference between the two cars in parking spots 
        System.out.println(carholder);
        Car car2 = new Car("B", "Cadiliac", false);
        carholder.carspot(car2);
        System.out.println(carholder);
        carholder.removecar(parking);
        System.out.println(carholder);
    }
}