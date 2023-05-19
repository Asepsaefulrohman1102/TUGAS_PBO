class KaryawanTetap extends Karyawan {
    private int gajiPokok;

    //ambil getTunjanganAnak dari class Karyawan
    public int getTunjanganAnak() {
        return super.getTunjanganAnak();
    }

    // constructor
    public KaryawanTetap(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // getter dan setter
    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // method untuk menghitung total gaji
    public int hitungTotalGaji() {
        return gajiPokok + getTunjanganAnak();
    }
}
