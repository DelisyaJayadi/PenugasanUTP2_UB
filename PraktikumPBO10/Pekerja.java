package PraktikumPBO10;

public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int JamKerja;
    private int HariKerja;
    private String NIP;
    
    public Pekerja(int JamKerja, int HariKerja, String NIP, String nama, String NIK, boolean JenisKelamin, boolean Menikah){
        super(nama, NIK, JenisKelamin, Menikah);
        this.JamKerja = JamKerja;
        this.HariKerja = HariKerja;
        this.NIP = NIP;
    }
    
    public int getJamKerja(){
        return this.JamKerja;
    }
    
    public int getHariKerja(){
        return this.HariKerja;
    }
    
    public String getNIP(){
        return this.NIP;
    }
    
    public double getGaji(){
        return (getJamKerja()*getHariKerja()*15);
    }
    
    public double getBonus(){
//        int jumlahMinggu = getHariKerja()/7;
//        int hariLibur = jumlahMinggu*2;
//        int hariKerja = jumlahMinggu*5;  //hari kerja tanpa libur
//        double BonusLembur = 0;
//        double BonusLibur = 0;
//        int jamLembur = getJamKerja()-7; //untuk jam lembur
//
//        if(getHariKerja()%7 > 5){
//            hariLibur += ((getHariKerja()%7)-5);
//            hariKerja += 5;
//        }
//        
//        if(getHariKerja()% 7 > 0 && getHariKerja()% 7 <= 5) {
//            hariKerja += (getHariKerja()%7);
//        }
//
//        if(jamLembur > 0) {
//            BonusLembur += hariKerja * jamLembur * 7;
//        }
//        
//
//        BonusLibur += hariLibur * getJamKerja() * 20;
//
//        return (BonusLembur + BonusLibur)+ ((BonusLembur + BonusLibur)*0.3);
          double gajiLembur = ((getHariKerja()/7)*7 + (getHariKerja()%7))*(getJamKerja()-7)*15;
          double gajiLibur = ((getHariKerja()/7)*2*getJamKerja()*20);
          
          if(getJamKerja() <=7){
              return gajiLibur;
          } else {
              return (gajiLembur + gajiLibur);
          }
    }
    
    public double getPendapatan(){
        return (getBonus()+getGaji()+getTunjangan());
    }
    
    public String getStatus(){
        String statusPekerja = "";
        
        if(getNIP().charAt(6) == '1'){
            statusPekerja += "Pemasaran, ";
        } else if(getNIP().charAt(6) == '2'){
            statusPekerja += "Humas, ";
        } else if(getNIP().charAt(6) == '3'){
            statusPekerja += "Riset, ";
        } else if(getNIP().charAt(6) == '4'){
            statusPekerja += "Teknologi, ";
        } else if(getNIP().charAt(6) == '5'){
            statusPekerja += "Personalia, ";
        } else if(getNIP().charAt(6) == '6'){
            statusPekerja += "Akademik, ";
        } else if(getNIP().charAt(6) == '7'){
            statusPekerja += "Administrasi, ";
        } else if(getNIP().charAt(6) == '8'){
            statusPekerja += "Operasional, ";
        } else if(getNIP().charAt(6) == '9'){
            statusPekerja += "Pembangunan, ";
        }
        
        if(getNIP().charAt(0) == '1'){
            statusPekerja += "Mondstadt";
        } else if (getNIP().charAt(0) == '2'){
            statusPekerja += "Liyue";
        } else if (getNIP().charAt(0) == '3'){
            statusPekerja += "Inazuma";
        } else if (getNIP().charAt(0) == '4'){
            statusPekerja += "Sumeru";
        } else if (getNIP().charAt(0) == '5'){
            statusPekerja += "Fontaine";
        } else if (getNIP().charAt(0) == '6'){
            statusPekerja += "Natlan";
        } else if (getNIP().charAt(0) == '7'){
            statusPekerja += "Snezhnaya";
        }
        
        if(getNIP().charAt(2) == '1'){
            statusPekerja += " cabang ke-1";
        } else if(getNIP().charAt(2) == '2'){
            statusPekerja += " cabang ke-2";
        } else if(getNIP().charAt(2) == '3'){
            statusPekerja += " cabang ke-3";
        } else if(getNIP().charAt(2) == '4'){
            statusPekerja += " cabang ke-4";
        } else if(getNIP().charAt(2) == '5'){
            statusPekerja += " cabang ke-5";
        }
        return statusPekerja;
    }
    
    @Override
    public String toString(){
        return "Nama          : " + getNama() + "\nNIK           : " + getNIK() + "\nJenis Kelamin : " + getjenisKelamin() + "\nPendapatan    : " + getPendapatan() + "$" +"\nBonus         : " +getBonus() +"$" + "\nGaji          : " + getGaji()+"$" + "\nStatus        : " + getStatus() ;
    }
}
