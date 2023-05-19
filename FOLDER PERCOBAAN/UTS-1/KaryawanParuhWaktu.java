class KaryawanParuhWaktu extends KaryawanTidakTetap {
    // constructor
    public KaryawanParuhWaktu() {
        super(); // memanggil constructor default class KaryawanTidakTetap
    }

    // override method hitungTotalGaji dari class KaryawanTidakTetap
    @Override
    public int hitungTotalGaji() {
        return super.getTunjanganAnak() + super.getInsentifBulanan(); // menghitung total upah karyawan paruh waktu
    }
}
