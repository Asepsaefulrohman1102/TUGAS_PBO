// Class KaryawanTetap
class KaryawanTetap extends Karyawan {
    private double gajiPokok;

    public KaryawanTetap(int tunjanganAnak, int insentifBulanan, double gajiPokok) {
        super(tunjanganAnak, insentifBulanan);
        this.gajiPokok = gajiPokok;
    }

    public KaryawanTetap(double gajiPokok) {
        super(0, 0);
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok + getTunjanganAnak();
    }

    @Override
    public double hitungTotalGaji(double gajiPokok) {
        return super.hitungTotalGaji(gajiPokok);
    }

    public double hitungTotalGaji() {
        return super.hitungTotalGaji(gajiPokok);
    }
}
