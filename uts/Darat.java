class Darat extends Kendaraan {
    private int roda;

    public Darat() {}

    public Darat(String nama, int tahunProduksi, int roda) {
        super(nama, tahunProduksi);
        this.roda = roda;
    }

    public int getRoda() {
        return this.roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public void cetak() {
        super.cetak();
        System.out.println("Jumlah roda: " + this.roda);
    }
}
