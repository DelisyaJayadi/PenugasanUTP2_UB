package PraktikumPBO10;

public class Manusia {
    public String nama;
    public String NIK;
    public boolean JenisKelamin; //true = laki-laki, false = perempuan
    public boolean Menikah;
    
    public Manusia(String nama, String NIK, boolean JenisKelamin, boolean Menikah){
        this.nama = nama;
        this.NIK = NIK;
        this.JenisKelamin = JenisKelamin;
        this.Menikah = Menikah;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getNIK(){
        return this.NIK;
    }
    
    public boolean getJenisKelamin(){
        return this.JenisKelamin;
    }
    public String getjenisKelamin(){
        if(JenisKelamin == false){
            return "Perempuan";
        }
        return "Laki-laki";
    }
    
    
    public boolean getMenikah(){
        return this.Menikah;
    }
    
    public double getTunjangan(){
        if(getJenisKelamin() == true && getMenikah() == true){
            return 25;
        } else if (getJenisKelamin() == false && getMenikah() == true){
            return 20;
        } 
        return 15;
    }
    
    @Override
    public String toString(){
        return "Nama          : " + getNama() + "\nNIK           : " + getNIK()+ "\nJenis Kelamin : " + getjenisKelamin() + "\nPendapatan    : " + getTunjangan()+"$";
    }
}
