import java.util.Scanner;
import karyawan.*;
import java.text.DecimalFormat;
import java.util.Locale;
import java.text.NumberFormat;
import java.io.IOException;

public class Demo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String menu = "y";

        DecimalFormat rupiah = (DecimalFormat) NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        rupiah.setPositivePrefix("Rp. ");
        rupiah.setNegativePrefix("Rp. ");

        boolean clearScreen = true;
        // pengecekan apakah variabel menu sama dengan y
        while (menu.equalsIgnoreCase("y")) {
            if (clearScreen) {
                try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } else {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                    }
                } catch (IOException | InterruptedException ex) {
                    System.out.println("Failed to clear the screen: " + ex.getMessage());
                }
            } // jika benar maka blok dalam perulangan akan dijalankan
            Scanner sc = new Scanner(System.in); // objek scanner
            karyawan kar = new karyawan();

            System.out.println("## Daftar Jenis Karyawan");
            System.out.println("=============================");
            System.out.println("1. Karyawan Tetap");
            System.out.println("2. Karyawan Kontrak");

            System.out.print("Pilihan Anda : ");
            int pilih = sc.nextInt();

            if (pilih == 1) {
                System.out.println("Anda Memilih Karyawan Tetap");
                System.out.print("Silahkan Masukkan Gaji     : ");
                long gaji = sc.nextLong();

                karyawanTetap karyawanTetap = new karyawanTetap(gaji);
                System.out.println("Total Gaji                 : " + rupiah.format(karyawanTetap.HitungGaji()));
            } else if (pilih == 2) {
                System.out.println("");
                System.out.println("Anda Memilih Karyawan Kontrak");
                System.out.print("Masukkan Jumlah Upah       : ");
                long upahHarian = sc.nextLong();

                System.out.print("Masukkan Jumlah Hari Masuk : ");
                int jumlahHari = sc.nextInt();

                karyawanKontrak karyawanKontrak = new karyawanKontrak(upahHarian, jumlahHari);
                System.out.println("Total Upah                 : " + rupiah.format(karyawanKontrak.HitungUpah()));
            } else {
                System.out.println("Pilihan anda salah");
            }
            System.out.print("Ingin memilih menu lain? (y/t) : ");
            menu = sc.next();

            if (menu.equalsIgnoreCase("t")) {
                try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } else {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                    }
                } catch (IOException | InterruptedException ex) {
                    System.out.println("Failed to clear the screen: " + ex.getMessage());
                }

                System.out.println("Terima kasih telah menggunakan aplikasi ini");
                System.exit(0);
            }
        }
    }
}
