package PraktikumPBO11;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai00 = new Pegawai("Monji", "350728490327424892339");
        Pegawai pegawai01 = new Pegawai("Bongji", "343142524646457658899");
        Pegawai pegawai02 = new Pegawai("Hyuji", "156314326756876943457");
        Pegawai pegawai03 = new Pegawai("Yojji", "234235346457557853456");
        System.out.println(pegawai00.toString());
        System.out.println(pegawai01.toString());
        System.out.println(pegawai02.toString());
        System.out.println(pegawai03.toString());
        System.out.println("==========================================");
        Pegawai pegawai1 = new PegawaiTetap("Bayu","350728490327424892342",2000000);
        Pegawai pegawai2 = new PegawaiTetap("Makji","350728490327424892340",1750000);
        Pegawai pegawai3 = new PegawaiTetap("Audery","350728490327424892343",3420000);
        Pegawai pegawai4 = new PegawaiTetap("Muji","350728490327424892349",1830000);
        System.out.println(pegawai1.toString());
        System.out.println(pegawai2.toString());
        System.out.println(pegawai3.toString());
        System.out.println(pegawai4.toString());
        System.out.println("==========================================");
        
        Pegawai pegawai11 = new PegawaiHarian("Edo","350728490327424892343",8500,40);
        Pegawai pegawai22 = new PegawaiHarian("Lulu","353453265764323424540",5000,55);
        Pegawai pegawai33 = new PegawaiHarian("Momo","243470285029507027582",10000,25);
        Pegawai pegawai44 = new PegawaiHarian("Lala","927973205327057423721",13500,45);
        System.out.println(pegawai11.toString());
        System.out.println(pegawai22.toString());
        System.out.println(pegawai33.toString());
        System.out.println(pegawai44.toString());
        System.out.println("==========================================");
        
        Pegawai pegawai10 = new Sales("Tika","350728490327424892344",50,50000);
        Pegawai pegawai20 = new Sales("Coco","829340928592834028429",55,76000);
        Pegawai pegawai30 = new Sales("DD","123710498194813948394",35,84000);
        Pegawai pegawai40 = new Sales("Nana","023948923852935829355",27,47000);
        System.out.println(pegawai10.toString());
        System.out.println(pegawai20.toString());
        System.out.println(pegawai30.toString());
        System.out.println(pegawai40.toString());
    }
}
