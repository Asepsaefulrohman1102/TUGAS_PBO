class Karyawan {
    private String nama;
    private int jumlahAnak;
    private double tunjanganAnak;
    private double insentifBulanan;

    public Karyawan(String nama, int jumlahAnak) {
        this.nama = nama;
        this.jumlahAnak = jumlahAnak;
        this.tunjanganAnak = 50000 * jumlahAnak;
        this.insentifBulanan = 1000000;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getTunjanganAnak() {
        return tunjanganAnak;
    }

    public double getInsentifBulanan() {
        return insentifBulanan;
    }
}
