class Lingkaran {
    double jari_jari;
    double phi = 3.14;
    static int jumlahLingkaran = 0;

    Lingkaran() {
        jumlahLingkaran++;
    }

    Lingkaran(double jari_jari_baru) {
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

    public void setJariJari(double d) {
    }

    public String getJariJari() {
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran();
        Lingkaran lingkaran2 = new Lingkaran();
        Lingkaran lingkaran3 = new Lingkaran(7);

        System.out.println("Jumlah lingkaran: " + Lingkaran.getJumlahLingkaran());

        System.out.println("Luas lingkaran 1: " + lingkaran1.getLuas());
        System.out.println("Keliling lingkaran 1: " + lingkaran1.getKeliling());

        lingkaran2.jari_jari = 5;
        System.out.println("Luas lingkaran 2: " + lingkaran2.getLuas());
        System.out.println("Keliling lingkaran 2: " + lingkaran2.getKeliling());

        System.out.println("Luas lingkaran 3: " + lingkaran3.getLuas());
        System.out.println("Keliling lingkaran 3: " + lingkaran3.getKeliling());

        System.out.println("Jumlah lingkaran: " + Lingkaran.getJumlahLingkaran());
    
    }
}
