package PraktikumPBO11;

public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;
    
    public PegawaiHarian(String nama, String noKTP, double upahPerjam, int totalJam){
        super(nama, noKTP);
        this.totalJam = totalJam;
        this.upahPerJam = upahPerjam;
    }
    
    @Override
    public String getNama(){
        return super.getNama();
    }
    
    @Override
    public String getNoKTP(){
        return super.getNoKTP();
    }
    
    @Override
    public double gaji(){
        if(getTotalJam() <= 40){
            return getUpahPerJam()*getTotalJam();
        } else {
            return ((getUpahPerJam()*getTotalJam())+((getTotalJam()-40)*getUpahPerJam()*1.5));
        }
    }
    
    public double getUpahPerJam(){
        return this.upahPerJam;
    }
    
    public int getTotalJam(){
        return this.totalJam;
    }
    
    public void setUpahPerJam(double upahPerJam){
        this.upahPerJam = upahPerJam;
    }
    
    public void setTotalJam(int totalJam){
        this.totalJam = totalJam;
    }
    
    @Override
    public String toString(){
        return "Pegawai Harian  : " + super.getNama() + "\nNo. KTP         : " + super.getNoKTP() + "\nUpah/jam        : Rp " + getUpahPerJam() + "\nTotal jam kerja : " + ((double)getTotalJam()) + "\nPendapatan      : Rp " + ((int)gaji()) + "\n";
    }
}
