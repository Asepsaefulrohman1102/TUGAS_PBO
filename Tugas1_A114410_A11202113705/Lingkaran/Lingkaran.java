public class Lingkaran {
    double jari_jari;
    static int jumlahLingkaran = 0;
    final double phi = 3.14; 

    Lingkaran() {
        jumlahLingkaran++;
    }

    Lingkaran(double jari_jari_baru) {
        // konstruktor kedua
        jari_jari = jari_jari_baru;
        jumlahLingkaran++;
    }

    double getLuas() {
        return phi * jari_jari * jari_jari;
    }

    double getKeliling() {
        return 2 * phi * jari_jari;
    }

    static int getJumlahLingkaran() {
        return jumlahLingkaran;
    }

}

/**
 * UML Class Diagram dari Lingkaran
 * +----------------------------------------+
 * |              Lingkaran                 |
 * +----------------------------------------+
 * | + jari_jari: double                    |
 * | + phi: final double                    |
 * | + jumlahLingkaran: static int          |
 * +----------------------------------------+
 * | + Lingkaran()                          |
 * | + Lingkaran(jari_jari_baru: double)    |
 * | + getLuas(): double                    |
 * | + getKeliling(): double                |
 * | + getJumlahLingkaran(): static int     |
 * +----------------------------------------+
 * 
 */
