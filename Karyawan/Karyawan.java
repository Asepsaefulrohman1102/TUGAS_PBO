// Class utama Karyawan
class Karyawan {
    // atribut nama dan jumlah anak
    protected String nama;
    protected int jumlahAnak;

    // constructor
    public Karyawan(String nama, int jumlahAnak) {
        this.nama = nama;
        this.jumlahAnak = jumlahAnak;
    }

    // method untuk menghitung tunjangan anak
    public int hitungTunjanganAnak() {
        return jumlahAnak * 500000;
    }

    
}
