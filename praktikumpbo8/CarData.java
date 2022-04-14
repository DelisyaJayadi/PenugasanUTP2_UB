package praktikumpbo8;

import java.util.ArrayList;

public class CarData {
    ArrayList<Car> carList = new ArrayList<>();
    
    public void addCar(String carType, String polNum, String merk){
        boolean status = true;
        carList.add(new Car(carType, polNum, merk, status));
    }
    
    public void listOfCar(){
        System.out.println("-------------------------");
        System.out.println("DAFTAR MOBIL");
        System.out.println("-------------------------");
        for(Car mobil : carList){
            System.out.println("Tipe Mobil  : " + mobil.getCarType());
            System.out.println("No. Polisi  : " + mobil.getPolNum());
            System.out.println("Merk Mobil  : " + mobil.getMerk());
            System.out.println("-------------------------");
        }
    }
}
