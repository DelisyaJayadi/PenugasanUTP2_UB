package praktikumpbo8;

import java.util.ArrayList;

public class RentArchive {
    ArrayList<CarRent> rentData = new ArrayList<>();
    
    public void Rent(CarRider rider, Car car, int rentDur){
        CarRent mobil = new CarRent(rider,car,rentDur);
        boolean currentStatus = car.isStatus();
        car.setStatus(false);
        if(currentStatus){
            rentData.add(mobil);
        }
    }
    
    public void info(){
        System.out.println("-------------------------");
        System.out.println("INFORMASI   PELANGGAN");
        System.out.println("-------------------------");
        for (CarRent carRent: rentData){
            System.out.println("Nama Peminjam   : " + carRent.getRider().getName());
            System.out.println("Tipe Mobil      : " + carRent.getCar().getCarType());
            System.out.println("No. polisi      : " + carRent.getCar().getPolNum());
            System.out.println("Lama Rental     : " + carRent.getRentDur());
            System.out.println("-------------------------");
        }
    }
}
