package PraktikumPBO11;

public class Sales extends Pegawai {
    private int penjualan;
    private double komisi;
    
    public Sales(String nama, String noKTP, int penjualan, double komisi){
        super(nama,noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
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
        return getPenjualan()*getKomisi();
    }
    
    public int getPenjualan(){
        return this.penjualan;
    }
    
    public double getKomisi(){
        return this.komisi;
    }
    
    public void setPenjualan(int penjualan){
        this.penjualan = penjualan;
    }
    
    public void setKomisi(double komisi){
        this.komisi = komisi;
    }
    
    @Override
    public String toString(){
        return "Sales           : " + super.getNama() + "\nNo. KTP         : " + super.getNoKTP() + "\nTotal penjualan : " + ((double)getPenjualan())+ "\nBesaran komisi  : " + ((double)getKomisi()) + "\nPendapatan      : Rp " + ((int)gaji()) + "\n";
    }
}
