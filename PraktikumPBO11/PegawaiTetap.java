package PraktikumPBO11;

public class PegawaiTetap extends Pegawai {
    private double upah;
    
    public PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        this.upah = upah;
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
        return getUpah();
    }
    
    public void setUpah(double upah){
        this.upah = upah;
    }
    
    public double getUpah(){
        return this.upah;
    }
    
    @Override
    public String toString(){
        return "Pegawai Tetap   : " + super.getNama() + "\nNo. KTP         : " + super.getNoKTP() + "\nUpah            : " + getUpah() + "\nPendapatan      : Rp " + ((int)gaji()) +"\n";
    }
}
