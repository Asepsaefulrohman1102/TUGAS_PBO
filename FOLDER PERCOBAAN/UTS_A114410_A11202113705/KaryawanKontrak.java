// Class KaryawanKontrak
public class KaryawanKontrak extends KaryawanTidakTetap {
    private double upahHarian;
    private int jumlahHariMasuk;

    public KaryawanKontrak(int tunjanganAnak, int insentifBulanan, double upahHarian, int jumlahHariMasuk) {
        super(tunjanganAnak, insentifBulanan);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public KaryawanKontrak(double upahHarian, int jumlahHariMasuk) {
        super(0, 0);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public double getUpahHarian() {
        return upahHarian;
    }

    public int getJumlahHariMasuk() {
        return jumlahHariMasuk;
    }

    public void setUpahHarian(int upahHarian) {
        this.upahHarian = upahHarian;
    }

    public void setJumlahHariMasuk(int jumlahHariMasuk) {
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    @Override
    public double hitungTotalGaji(double gajiPokok) {
        return super.hitungTotalGaji(gajiPokok);
    }

    public double hitungTotalUpah() {
        return (upahHarian * jumlahHariMasuk) + getTunjanganAnak() + getInsentifBulanan();
    }
}
