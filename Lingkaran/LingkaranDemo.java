public class LingkaranDemo {
    public static void main(String[] args) {
        // objek pertama tanpa inisialisasi jari_jari
        Lingkaran lingkaran1 = new Lingkaran();

        // objek kedua dengan inisialisasi jari_jari dari property
        Lingkaran lingkaran2 = new Lingkaran();
        lingkaran2.jari_jari = 5;

        // objek ketiga dengan inisialisasi jari_jari dari konstruktor
        Lingkaran lingkaran3 = new Lingkaran(7);

        System.out.println("Luas lingkaran 1     : " + lingkaran1.getLuas());
        System.out.println("Keliling lingkaran 1 : " + lingkaran1.getKeliling());
        System.out.println("Luas lingkaran 2     : " + lingkaran2.getLuas());
        System.out.println("Keliling lingkaran 2 : " + lingkaran2.getKeliling());
        System.out.println("Luas lingkaran 3     : " + lingkaran3.getLuas());
        System.out.println("Keliling lingkaran 3 : " + lingkaran3.getKeliling());
        System.out.println("Jumlah lingkaran     : " + Lingkaran.getJumlahLingkaran());
    }
}
