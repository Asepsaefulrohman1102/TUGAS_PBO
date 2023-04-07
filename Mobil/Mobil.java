import java.util.Scanner;

public class Mobil {
    String warna;
    int tahunProduksi;
    int gigi = 0;

    void hidupkanMobil() {
        System.out.println("Mobil Sudah Menyala");
    }

    void matikanMobil() {
        System.out.println("Mobil Sudah Mati");
    }

    void tambahGigi() {
        gigi += 1;
        System.out.println("Gigi sekarang = " + gigi);
    }

    void kurangGigi() {
        gigi -= 1;
        System.out.println("gigi sekarang = " + gigi);
    }

    void ubahGigi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pindah gigi berapa? (1-5)");
        gigi = input.nextInt();
        System.out.println("Sekarang gigi " + gigi);
    }

    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        Mobil mobilmu = new Mobil();
        mobilku.warna = "Merah";
        mobilku.tahunProduksi = 2018;
        System.out.println("Mobilku warna = " + mobilku.warna);
        System.out.println("Mobilku tahun = " + mobilku.tahunProduksi);
        mobilku.tambahGigi();
        mobilku.tambahGigi();
        mobilmu.kurangGigi();
        mobilmu.warna = "Merah";
        mobilmu.tahunProduksi = 2018;
        System.out.println("Mobilku warna = " + mobilmu.warna);
        System.out.println("Mobilku tahun = " + mobilmu.tahunProduksi);
        mobilku.hidupkanMobil();
        mobilku.matikanMobil();
        mobilku.ubahGigi();
    }
}
