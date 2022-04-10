package PraktikumPBO4;

public class Merchant {
    private String namaMerchant;
    private String namaProduk;
    private double hargaMakanan;
    
    public Merchant(String namaMerchant, String namaProduk, double hargaMakanan){
        this.namaMerchant= namaMerchant;
        this.namaProduk = namaProduk;
        this.hargaMakanan = hargaMakanan;
    }
    
    public void setNamaMerchant(String namaMerchant){
        this.namaMerchant =  namaMerchant;
    }
    
    public String getNamaMerchant(){
        return this.namaMerchant;
    }
    
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    
    public String getNamaProduk(){
        return this.namaProduk;
    }
    
    public void setHargaMakanan(double hargaMakanan){
        this.hargaMakanan = hargaMakanan;
    }
    
    public double getHargaMakanan(){
        return this.hargaMakanan;
    }
}
