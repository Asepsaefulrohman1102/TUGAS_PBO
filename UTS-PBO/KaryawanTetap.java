public class KaryawanTetap extends Karyawan {
    private double gajiPokok;

    public KaryawanTetap(String nama, int jumlahAnak, double gajiPokok) {
        super(nama, jumlahAnak);
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double totalGaji() {
        return getGajiPokok() + getTunjanganAnak();
    }
}
