import java.util.Scanner;

public class MobilDemo {
    public static int min2(int a, int b) {
        return (a < b) ? a : b;
    }

    public static void isNamaSama(Mobil m1, Mobil m2) {
        if (m1.getNama().equals(m2.getNama())) {
            System.out.println("Nama mobil 1 dan mobil 2 sama");
        } else {
            System.out.println("Nama mobil 1 dan mobil 2 berbeda");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Mobil 1:");
        System.out.print("Nama: ");
        String nama1 = input.nextLine();
        System.out.print("Tahun produksi: ");
        int tahunProduksi1 = input.nextInt();
        System.out.print("Jumlah roda: ");
        int roda1 = input.nextInt();
        System.out.print("Jumlah muatan (kg): ");
        int muatan1 = input.nextInt();
        input.nextLine();

        Mobil mobil1 = new Mobil(nama1, tahunProduksi1, roda1, muatan1);

        System.out.println("\nMobil 2:");
        System.out.print("Nama: ");
        String nama2 = input.nextLine();
        System.out.print("Tahun produksi: ");
        int tahunProduksi2 = input.nextInt();
        System.out.print("Jumlah roda: ");
        int roda2 = input.nextInt();
        System.out.print("Jumlah muatan (kg): ");
        int muatan2 = input.nextInt();
        input.nextLine();

        Mobil mobil2 = new Mobil(nama2, tahunProduksi2, roda2, muatan2);

        System.out.println("\nData mobil 1:");
        mobil1.cetak();

        System.out.println("\nData mobil 2:");
        mobil2.cetak();

        System.out.println("\nMinimum dari " + mobil1.getMuatan() + " dan " + mobil2.getMuatan() + " adalah "
                + min2(mobil1.getMuatan(), mobil2.getMuatan()));

        isNamaSama(mobil1, mobil2);
    }
}
