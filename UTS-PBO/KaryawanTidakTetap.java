class KaryawanTidakTetap extends Karyawan {
    public KaryawanTidakTetap(String nama, int jumlahAnak) {
        super(nama, jumlahAnak);
    }

    public double totalUpah(double tunjanganAnak, double insentifBulanan) {
        return tunjanganAnak + insentifBulanan;
    }
}
