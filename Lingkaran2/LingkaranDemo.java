public class LingkaranDemo {
    public static void main(String[] args) {
        // Objek pertama tanpa inisialisasi jari_jari
        Lingkaran lingkaran1 = new Lingkaran();
        System.out.println("Jumlah Lingkaran: " + Lingkaran.getJumlahLingkaran());

        // Objek kedua dengan inisialisasi jari_jari dari property
        Lingkaran lingkaran2 = new Lingkaran();
        lingkaran2.setJariJari(7.0);
        System.out.println("Jari-jari Lingkaran 2: " + lingkaran2.getJariJari());
        System.out.println("Luas Lingkaran 2: " + lingkaran2.getLuas());
        System.out.println("Keliling Lingkaran 2: " + lingkaran2.getKeliling());
        System.out.println("Jumlah Lingkaran: " + Lingkaran.getJumlahLingkaran());

        // Objek ketiga dengan inisialisasi jari_jari dari konstruktor
        Lingkaran lingkaran3 = new Lingkaran(10.0);
        System.out.println("Jari-jari Lingkaran 3: " + lingkaran3.getJariJari());
        System.out.println("Luas Lingkaran 3: " + lingkaran3.getLuas());
        System.out.println("Keliling Lingkaran 3: " + lingkaran3.getKeliling());
        System.out.println("Jumlah Lingkaran: " + Lingkaran.getJumlahLingkaran());
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
