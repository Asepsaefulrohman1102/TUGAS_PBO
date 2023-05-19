// Class KaryawanTidakTetap
public class KaryawanTidakTetap extends Karyawan {
    public KaryawanTidakTetap(int tunjanganAnak, int insentifBulanan) {
        super(tunjanganAnak, insentifBulanan);
    }

    @Override
    public double hitungTotalGaji(double gajiPokok) {
        return super.hitungTotalGaji(gajiPokok);
    }
}