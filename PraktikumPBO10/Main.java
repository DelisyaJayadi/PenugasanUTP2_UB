package PraktikumPBO10;

public class Main {
    
    public static void main(String[] args) {
        Manusia man1 = new Manusia("Aku", "3923842934", true, true);
        Manusia man2 = new Manusia("Kamu", "287319872", true, false);
        Manusia man3 = new Manusia("Dia", "635185318", false, true);
        Manusia man4 = new Manusia("Kita", "264194610142", false, false);
        System.out.println(man1.toString());
        System.out.println();
        System.out.println(man2.toString());
        System.out.println();
        System.out.println(man3.toString());
        System.out.println();
        System.out.println(man4.toString());
        
        System.out.println("=========================================");
        MahasiswaFilkom mhs1 = new MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "205150600111018", 3.70);
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Johan Christian", "33424252525", true, false, "205150300111018", 3.95);
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Anastasya Angelica", "2432304832502", false, true, "20515070111108", 3.81);
        MahasiswaFilkom mhs4 = new MahasiswaFilkom("Enrico Yauri", "40714713247247", true, true, "195150200711024", 3.6);
        System.out.println(mhs1.toString());
        System.out.println();
        System.out.println(mhs2.toString());
        System.out.println();
        System.out.println(mhs3.toString());
        System.out.println();
        System.out.println(mhs4.toString());
        
        System.out.println("=========================================");
        Pekerja pekerja1 = new Pekerja(7, 22, "195102439283", "Iqbal Biondy", "351717969", true, true);
        Pekerja pekerja2 = new Pekerja(2, 16, "593944839240", "Jerika Angelia", "851717969", false, true);
        Pekerja pekerja3 = new Pekerja(8, 29, "394802938402", "Adya Praditka", "151717969", true, false);
        Pekerja pekerja4 = new Pekerja(7, 7, "230402480253", "Henny Gunawan", "551717969", false, false);
        System.out.println(pekerja1.toString());
        System.out.println();
        System.out.println(pekerja2.toString());
        System.out.println();
        System.out.println(pekerja3.toString());
        System.out.println();
        System.out.println(pekerja4.toString());
        
        System.out.println("=========================================");
        Manajer manajer1 = new Manajer(9, 20,"204337283728", "Lyra Hertin", "351707384392", false, false, 1500);
        Manajer manajer2 = new Manajer(8, 25,"305237483728", "Bryan Christopher", "351707384392", true, false, 835);
        Manajer manajer3 = new Manajer(5, 18,"79234759472", "Jessica Evangeline", "351707384392", false, true, 293);
        Manajer manajer4 = new Manajer(7, 15,"42330962814", "Fredericky Jaury", "351707384392", true, true, 2134);
        System.out.println(manajer1.toString());
        System.out.println();
        System.out.println(manajer2.toString());
        System.out.println();
        System.out.println(manajer3.toString());
        System.out.println();
        System.out.println(manajer4.toString());
    }
}
