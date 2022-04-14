package praktikumpbo8;

public class MainCar {
    public static void main(String[] args) {
        CarRider henny = new CarRider("Henny G", 19, "08571234");
        CarRider jerika = new CarRider("Jerika A", 18, "08123367");
        CarRider anas = new CarRider("Anastasya", 20, "0187345256");
        CarRider devi = new CarRider("Devnet", 21, "081091302");
        
        CarData data = new CarData();
        data.addCar("SUV", "D 0101 AA", "Toyota");
        data.addCar("Sedan", "D 0202 BB", "Ferrari");
        data.addCar("Elektrik", "D 0303 CC", "Tesla");
        data.addCar("Mini Bus", "D 0404 DD", "Daihatsu");
        
        data.listOfCar();
        
        RentArchive archive = new RentArchive();
        archive.Rent(henny, data.carList.get(2), 14);
        archive.Rent(devi, data.carList.get(3), 5);
        archive.Rent(anas, data.carList.get(2), 9);
        archive.Rent(jerika, data.carList.get(1), 6);
        
        System.out.println("");
        archive.info();
    }
}
