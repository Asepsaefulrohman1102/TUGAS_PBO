class KaryawanKontrak extends KaryawanTidakTetap {
    // constructor
    public KaryawanKontrak(int upahHarian, int jumlahHari) {
        super(upahHarian, jumlahHari); // memanggil constructor class KaryawanTidakTetap
    }

    // override method hitungTotalGaji dari class KaryawanTidakTetap
    @Override
    public int hitungTotalGaji() {
        return super.hitungTotalGaji(); // memanggil method hitungTotalGaji dari class KaryawanTidakTetap
    }
}
