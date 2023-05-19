class KaryawanTidakTetap extends Karyawan {
    private int upahHarian;
    private int jumlahHari;

    // constructor
    public KaryawanTidakTetap(int upahHarian, int jumlahHari) {
        super(); // memanggil constructor class Karyawan
        this.upahHarian = upahHarian;
        this.jumlahHari = jumlahHari;
    }

    // getter dan setter
    public int getUpahHarian() {
        return upahHarian;
    }

    public void setUpahHarian(int upahHarian) {
        this.upahHarian = upahHarian;
    }

    public int getJumlahHari() {
        return jumlahHari;
    }

    public void setJumlahHari(int jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    // override method hitungTotalGaji dari class Karyawan
    @Override
    public int hitungTotalGaji() {
        return (upahHarian * jumlahHari) + getTunjanganAnak() + getInsentifBulanan();
    }
}
