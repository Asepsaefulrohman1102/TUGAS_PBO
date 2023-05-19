class Mobil extends Darat {
    private int muatan;

    public Mobil() {}

    public Mobil(String nama, int tahunProduksi, int roda, int muatan) {
        super(nama, tahunProduksi, roda);
        this.muatan = muatan;
    }

    public int getMuatan() {
        return this.muatan;
    }

    public void setMuatan(int muatan) {
        this.muatan = muatan;
    }

    public void reset(String nama, int tahunProduksi, int roda, int muatan) {
        super.setNama(nama);
        super.setTahunProduksi(tahunProduksi);
        super.setRoda(roda);
        this.muatan = muatan;
    }

    public String kategori(int muatan) {
        if (muatan < 1000) {
            return "Sedan";
        } else if (muatan < 2000) {
            return "Pickup";
        } else {
            return "Truk";
        }
    }

    public void cetak() {
        super.cetak();
        System.out.println("Jumlah muatan: " + this.muatan + " kg");
        System.out.println("Kategori: " + this.kategori(this.muatan));
    }
}

