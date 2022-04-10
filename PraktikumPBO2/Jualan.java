package PraktikumPBO2;

import java.util.Scanner;

public class Jualan {
    final static private Scanner input = new Scanner(System.in);
    final public int bajuA = 100000;
    final public int bajuB = 125000;
    final public int bajuC = 175000;
    
    String jenis;
    int harga;
    int jumlah;
    
    static void display(){
        System.out.println("Selamat datang!");
        System.out.println("Silakan memilih jenis baju yang diinginkan: ");
        System.out.println("bajuA, bajuB, bajuC");
        System.out.print("Pilihan baju : ");
        String pilihan = input.next();
        System.out.print("Silakan memasukkan jumlah yang diinginkan: ");
        int jumlah = input.nextInt();
        if(pilihan.equals("bajuA")){
            Baju a1 = new Baju(100000);
            
            System.out.println("Jenis yang Anda beli    : bajuA");
            if (jumlah < 100){
                System.out.println("Harga per buah          : " + a1.harga);
            } else {
                a1 = new Baju(95000);
                System.out.println("Harga per buah          : " + a1.harga);
            }
            System.out.println("Jumlah yang Anda beli   : " + jumlah);
            System.out.println("Total harga             : " + (jumlah*a1.harga));
            
        } else if (pilihan.equals("bajuB")){
            Baju b1 = new Baju(125000);
            
            System.out.println("Jenis yang Anda beli    : bajuB");
            if(jumlah < 100){
                System.out.println("Harga per buah          : " + b1.harga);
            } else {
                b1 = new Baju(120000);
                System.out.println("Harga per buah          : " + b1.harga);
            }
            System.out.println("Jumlah yang Anda beli   : " + jumlah);
            System.out.println("Total harga             : " +(jumlah*b1.harga));
            
        } else if (pilihan.equals("bajuC")){
            Baju c1 = new Baju(175000);
            
            System.out.println("Jenis yang Anda beli    : bajuC");
            if(jumlah < 100){
               System.out.println("Harga per buah          : " + c1.harga);
            } else {
                c1 = new Baju(160000);
                System.out.println("Harga per buah          : " + c1.harga);
            }
            System.out.println("Jumlah yang Anda beli   : " + jumlah);
            System.out.println("Total harga             : " +(jumlah*c1.harga));
        }
    }
}
