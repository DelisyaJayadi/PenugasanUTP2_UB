package PraktikumPBO10;

public class Manajer extends Pekerja{
    private int LamaKerja;
    
    public Manajer(int JamKerja, int HariKerja, String NIP, String nama, String NIK, boolean JenisKelamin, boolean Menikah, int LamaKerja){
        super(JamKerja, HariKerja, NIP, nama, NIK, JenisKelamin, Menikah);
        this.LamaKerja = LamaKerja;
    }
    
    public int getLamaKerja(){
        return this.LamaKerja;
    }
    
    public int setLamaKerja(){
        return this.LamaKerja;
    }
    
    public double getBonusManajer(){
        return getBonus()+(getBonus()*0.3);
    }
    
    public double getPendapatanManajer(){
        return getBonusManajer()+getGaji()+getTunjangan()+15;
    }
    
    @Override
    public String toString(){
        return "Nama          : " + getNama() + "\nNIK           : " + getNIK() + "\nJenis Kelamin : " + getjenisKelamin() + "\nPendapatan    : " + getPendapatanManajer() +"$"+ "\nBonus         : " +getBonusManajer() +"$"+ "\nGaji          : " + getGaji()+"$" + "\nStatus        : " + getStatus() + "\nLama Kerja    : " + getLamaKerja()+ " hari";
    }
}
