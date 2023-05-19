// Class Karyawan Kontrak, turunan dari Karyawan
class KaryawanKontrak extends Karyawan {
    // atribut upah harian dan jumlah hari masuk
    private long upahHarian;
    private int jumlahHari;

    // constructor
    public KaryawanKontrak(String nama, int jumlahAnak, long upahHarian, int jumlahHari) {
        super(nama, jumlahAnak, upahHarian);
        this.upahHarian = upahHarian;
        this.jumlahHari = jumlahHari;
    }

    // method untuk menghitung total upah
    public long hitungTotalUpah() {
        return upahHarian * jumlahHari + hitungTunjanganAnak();
    }
}
