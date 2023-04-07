public class Lingkaran2 {
    double jari_jari;
    static int jumlahLingkaran = 0;
    final double phi = 3.14;

    Lingkaran2() {
        jumlahLingkaran++;
    }

    Lingkaran2(double jari_jari_baru) {
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

    public static void main(String[] args) {

        // objek kedua dengan inisialisasi jari_jari dari property
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jari_jari = 5;
        
        System.out.println("Jumlah lingkaran     : " + Lingkaran.getJumlahLingkaran());
        System.out.println("Luas lingkaran       : " + lingkaran.getLuas());
    }
}
