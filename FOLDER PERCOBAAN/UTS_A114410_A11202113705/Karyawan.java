public class Karyawan {
    private double tunjanganAnak;
    private double insentifBulanan;

    public Karyawan(double tunjanganAnak, double insentifBulanan) {
        this.tunjanganAnak = 300000;
        this.insentifBulanan = 1000000;
    }

    public double getTunjanganAnak() {
        return tunjanganAnak;
    }

    public double getInsentifBulanan() {
        return insentifBulanan;
    }

    public void setTunjanganAnak(double tunjanganAnak) {
        this.tunjanganAnak = tunjanganAnak;
    }

    public void setInsentifBulanan(double insentifBulanan) {
        this.insentifBulanan = insentifBulanan;
    }

    public double hitungTotalGaji(double gajiPokok) {
        return gajiPokok + tunjanganAnak;
    }
}
