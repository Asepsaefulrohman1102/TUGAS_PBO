public class Karyawan {
    private final int tunjanganAnak = 800000;
    private int insentifBulanan = 1000000;

    // constructor
    public Karyawan(int tunjanganAnak, int insentifBulanan) {
        this.insentifBulanan = insentifBulanan;
    }

    // get tunjangan anak
    public int getTunjanganAnak() {
        return tunjanganAnak;
    }

    // getter dan setter
    public int getInsentifBulanan() {
        return insentifBulanan;
    }

    public void setInsentifBulanan(int insentifBulanan) {
        this.insentifBulanan = insentifBulanan;
    }

    // method untuk menghitung total gaji
    public int hitungTotalGaji(int gajiPokok) {
        return gajiPokok + tunjanganAnak + insentifBulanan;
    }
}
