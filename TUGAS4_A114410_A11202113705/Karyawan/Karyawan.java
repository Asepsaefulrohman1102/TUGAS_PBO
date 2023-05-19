// Class utama Karyawan

class Karyawan {
    // atribut nama, jumlah anak, dan gaji pokok atau upah harian
    protected String nama;
    protected int jumlahAnak;
    protected long gajiPokokAtauUpahHarian;
    // constructor
    public Karyawan(String nama, int jumlahAnak, long gajiPokokAtauUpahHarian) {
        this.nama = nama;
        this.jumlahAnak = jumlahAnak;
        this.gajiPokokAtauUpahHarian = gajiPokokAtauUpahHarian;
    }

    // method untuk menghitung tunjangan anak
    public long hitungTunjanganAnak() {
        int jumlahAnakYangDihitung = Math.min(jumlahAnak, 3); // hanya hitung maksimal 3 anak
        double persenTunjangan = 0.05;
        return (long) (persenTunjangan * gajiPokokAtauUpahHarian * jumlahAnakYangDihitung);
    }
}
