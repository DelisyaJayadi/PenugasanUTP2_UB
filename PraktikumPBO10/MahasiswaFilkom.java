package PraktikumPBO10;

public class MahasiswaFilkom extends Manusia{    
    private String NIM;
    private double IPK;
    public MahasiswaFilkom(String nama, String NIK, boolean JenisKelamin, boolean Menikah, String NIM, double IPK){
        super(nama, NIK, JenisKelamin, Menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }
    
    public double getIPK(){
        return this.IPK;
    }
    
    public String getNIM(){
        return this.NIM;
    }
    
    public String getStatus(){
        String Status = "";
        if(getNIM().charAt(6) == '7'){
            Status += "Teknologi Telepon Kerang";
        } else if(getNIM().charAt(6) == '6'){
            Status += "Pendidikan Chum Bucket";
        } else if(getNIM().charAt(6) == '4'){
            Status += "Sistem Perhamburgeran";
        } else if(getNIM().charAt(6) == '3'){
            Status += "Teknik Berburu Ubur-ubur";
        } else if(getNIM().charAt(6) == '2'){
            Status += "Teknik Meniup Gelembung";
        } else {
            Status += "Tidak ada";
        }
        
        if(getNIM().charAt(0) == '1' && getNIM().charAt(1) == '9'){
            Status += ", 2019";
        } else if (getNIM().charAt(0) == '2' && getNIM().charAt(1) == '0'){
            Status += ", 2020";
        }
        return Status;
    }
    
    
    public double getBeasiswa(){
        if(getIPK() > 3 && getIPK() < 3.5){
            return (50 + getTunjangan());
        } else if (getIPK() > 3.5 && getIPK() <4){
            return (75 + getTunjangan());
        } else {
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return  "Nama          : " + getNama() + "\nNIK           : " + getNIK()+ "\nJenis Kelamin : " + getjenisKelamin() + "\nPendapatan    : " + getBeasiswa() +"$"+ "\nIPK           : " + getIPK() + "\nNIM           : " + getNIM() +"\nStatus        : " + getStatus();
    }
}
