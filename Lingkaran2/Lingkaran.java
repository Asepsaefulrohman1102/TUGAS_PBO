class Lingkaran {
    private double jari_jari;
    private final double phi = 3.14;
    private static int jumlahLingkaran = 0;

    // konstruktor pertama
    public Lingkaran() {
        // tidak melakukan apa-apa
    }

    // konstruktor kedua
    public Lingkaran(double jari_jari_baru) {
        this.jari_jari = jari_jari_baru;
        jumlahLingkaran++;
    }

    public double getLuas() {
        return phi * jari_jari * jari_jari;
    }

    public double getKeliling() {
        return 2 * phi * jari_jari;
    }

    public static int getJumlahLingkaran() {
        return jumlahLingkaran;
    }

    // method untuk mengubah nilai jari_jari
    public void setJariJari(double jari_jari_baru) {
        this.jari_jari = jari_jari_baru;
    }

    // method untuk mendapatkan nilai jari_jari
    public double getJariJari() {
        return jari_jari;
    }
}

/**
 * UML Class Diagram dari Lingkaran
 * +----------------------------------------+
 * |              Lingkaran                 |
 * +----------------------------------------+
 * | - jari_jari: double                    |
 * | - phi: final double                    |
 * | - jumlahLingkaran: static int          |
 * +----------------------------------------+
 * | + Lingkaran()                          |
 * | + Lingkaran(jari_jari_baru: double)    |
 * | + getLuas(): double                    |
 * | + getKeliling(): double                |
 * | + getJumlahLingkaran(): static int     |
 * +----------------------------------------+
 * 
 */
