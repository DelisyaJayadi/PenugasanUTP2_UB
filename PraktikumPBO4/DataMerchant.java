package PraktikumPBO4;

import java.util.Scanner;

public class DataMerchant {
    static Scanner input = new Scanner(System.in);
    static Merchant[] merc = new Merchant[0];
    
    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant temp[] = new Merchant[DataMerchant.merc.length+1];
        for(int i = 0; i < DataMerchant.merc.length;i++){
            temp[i]= DataMerchant.merc[i];
        }
        temp[DataMerchant.merc.length] = merchant;
        return temp;
    }
    
    public static void tampilData(){
        for (Merchant mch1 : merc){
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant   : " + mch1.getNamaMerchant());
            System.out.println("Nama Produk     : " + mch1.getNamaProduk());
            System.out.println("Harga           : " + (int)mch1.getHargaMakanan());
        }
    }
    
    public Merchant cariMerchant(String nama, int i){
        for(i = 0; i < DataMerchant.merc.length; i++){
            if(nama.equalsIgnoreCase(DataMerchant.merc[i].getNamaMerchant())){
                return DataMerchant.merc[i];
            }
        }
        return DataMerchant.merc[i];
    }
    
    public void tampilMerchant(Merchant merchant){
        System.out.println("====Tampilan Data Merchant UBFood====");
        System.out.println("Nama Merchant   : " + merchant.getNamaMerchant());
        System.out.println("Nama Produk     : " + merchant.getNamaProduk());
        System.out.println("Harga           : " + (int)merchant.getHargaMakanan());
    }
    
    public void updateMerchant(Merchant merchant){
        System.out.println("====Tampilan Data Merchant UBFood====");
        System.out.println("Nama Merchant   : " + merchant.getNamaMerchant());
        System.out.println("Nama Produk     : " + merchant.getNamaProduk());
        System.out.println("Harga           : " + (int)merchant.getHargaMakanan());
    }
}
