// Class KaryawanTetap merupakan subclass dari class Karyawan
class KaryawanTetap extends Karyawan { 
    // atribut gaji pokok
    private int gajiPokok; // digunakan untuk menyimpan gaji pokok

    // constructor
    public KaryawanTetap(int gajiPokok) { // di constructor ini, kita menginisialisasi nilai dari atribut gajiPokok yang diambil dari parameter
        this.gajiPokok = gajiPokok; // this.gajiPokok mengacu pada atribut gajiPokok di class KaryawanTetap
    }

    // method untuk menghitung total gaji
    public int hitungTotalGaji() { // method ini akan di override di subclassnya
        return gajiPokok + hitungTunjanganAnak(); // menghitung total gaji dengan mengalikan gaji pokok dengan jumlah hari
    }

}