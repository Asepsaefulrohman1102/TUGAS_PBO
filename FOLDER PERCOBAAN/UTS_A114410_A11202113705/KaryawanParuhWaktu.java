// Class KaryawanParuhWaktu
public class KaryawanParuhWaktu extends KaryawanTidakTetap {
    public KaryawanParuhWaktu(int tunjanganAnak, int insentifBulanan) {
        super(tunjanganAnak, insentifBulanan);
    }

    public KaryawanParuhWaktu() {
        super(0, 0);
    }

    @Override
    public double hitungTotalGaji(double gajiPokok) {
        return super.hitungTotalGaji(0); // tidak ada gaji pokok pada karyawan paruh waktu
    }

    public double hitungTotalUpah() {
        return getTunjanganAnak() + getInsentifBulanan();
    }
}