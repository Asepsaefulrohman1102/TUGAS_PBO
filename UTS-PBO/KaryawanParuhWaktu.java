class KaryawanParuhWaktu extends KaryawanTidakTetap {
    public KaryawanParuhWaktu(String nama) {
        super(nama);
    }

    public double hitungTotalUpah() {
        return getTunjanganAnak() + getInsentifBulanan();
    }
}
