package barang;

public class Lingkaran {
    public double jari_jari;
    static int jumlahLingkaran = 0;
    final double phi = 3.14;

    public Lingkaran(double jari_jari_baru) {
        // konstruktor kedua
        jari_jari = jari_jari_baru;
        jumlahLingkaran++;
    }

    public double getLuas() {
        return phi * jari_jari * jari_jari;
    }

    public double getKeliling() {
        return 2 * phi * jari_jari;
    }

    static int getJumlahLingkaran() {
        return jumlahLingkaran;
    }

    public static void info() {

        Lingkaran lingkaran = new Lingkaran(5);
        System.out.println("Jumlah lingkaran     : " + Lingkaran.getJumlahLingkaran());
        System.out.println("Luas lingkaran       : " + lingkaran.getLuas());
    }
}
