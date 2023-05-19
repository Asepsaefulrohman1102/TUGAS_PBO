class KaryawanKontrak extends KaryawanTidakTetap {
    private double upahHarian;
    private int jumlahHariMasuk;

    public KaryawanKontrak(String nama, int jumlahAnak, double upahHarian, int jumlahHariMasuk) {
        super(nama, jumlahAnak);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public double getUpahHarian() {
        return upahHarian;
    }

    public void setUpahHarian(double upahHarian) {
        this.upahHarian = upahHarian;
    }

    public int getJumlahHariMasuk() {
        return jumlahHariMasuk;
    }

    public void setJumlahHariMasuk(int jumlahHariMasuk) {
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

public double totalUpah() {
        return (getUpahHarian() * getJumlahHariMasuk()) + getTunjanganAnak() + getInsentifBulanan();
    }
}

