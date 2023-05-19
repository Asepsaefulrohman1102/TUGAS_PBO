// Class Karyawan Kontrak, turunan dari Karyawan
class KaryawanKontrak extends Karyawan { // Class KaryawanKontrak merupakan subclass dari class Karyawan
    // atribut upah harian dan jumlah hari masuk
    private int upahHarian; // private artinya hanya bisa diakses di class KaryawanKontrak
    private int jumlahHari;

    // constructor
    public KaryawanKontrak(int upahHarian, int jumlahHari) {  // di constructor ini, kita menginisialisasi nilai dari atribut upahHarian dan jumlahHari
        this.upahHarian = upahHarian; // this.upahHarian mengacu pada atribut upahHarian di class KaryawanKontrak
        this.jumlahHari = jumlahHari; // this.jumlahHari mengacu pada atribut jumlahHari di class KaryawanKontrak
    }

    // method untuk menghitung total upah
    public int hitungTotalUpah() { // method ini akan di override di subclassnya
        return upahHarian * jumlahHari + hitungTunjanganAnak(); // menghitung total upah dengan mengalikan upah harian dengan jumlah hari
    }

}
