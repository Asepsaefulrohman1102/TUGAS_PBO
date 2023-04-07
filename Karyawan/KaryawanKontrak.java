// Class Karyawan Kontrak, turunan dari Karyawan
class KaryawanKontrak extends Karyawan {
    // atribut upah harian dan jumlah hari masuk
    private int upahHarian;
    private int jumlahHari;

    // constructor
    public KaryawanKontrak(String nama, int jumlahAnak, int upahHarian, int jumlahHari) {
        super(nama, jumlahAnak);
        this.upahHarian = upahHarian;
        this.jumlahHari = jumlahHari;
    }

    // method untuk menghitung total upah
    public int hitungTotalUpah() {
        return upahHarian * jumlahHari + hitungTunjanganAnak();
    }

}
