// Class KaryawanTetap merupakan subclass dari class Karyawan
class KaryawanTetap extends Karyawan {
    // atribut gaji pokok
    private int gajiPokok;

    // constructor
    public KaryawanTetap(String nama, int jumlahAnak, int gajiPokok) {
        super(nama, jumlahAnak);
        this.gajiPokok = gajiPokok;
    }

    // method untuk menghitung total gaji
    public int hitungTotalGaji() {
        return gajiPokok + hitungTunjanganAnak();
    }

}