import java.util.ArrayList;
import java.util.Scanner;

public class KaryawanDemo {
    public static void main(String[] args) {
        ArrayList<Karyawan> listKaryawan = new ArrayList<>();
        ArrayList<KaryawanTetap> listKaryawanTetap = new ArrayList<>();
        ArrayList<KaryawanKontrak> listKaryawanKontrak = new ArrayList<>();
        ArrayList<KaryawanParuhWaktu> listKaryawanParuhWaktu = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);

        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("=====================================================");
            System.out.println("---------------- Aplikasi Penggajian ----------------");
            System.out.println("-----------------   A11.2021.13705 ------------------");
            System.out.println("---------------- Silahkan Pilih Menu ----------------");
            System.out.println("=====================================================");
            System.out.println(" 1. Karyawan Tetap");
            System.out.println(" 2. Karyawan Kontrak");
            System.out.println(" 3. Karyawan Paruh Waktu");
            System.out.println("=====================================================");
            System.out.print(" Masukkan pilihan : ");
            int pilihan = scanner.nextInt();
            System.out.println("=====================================================");
            switch (pilihan) {
                case 1:
                    System.out.println("\n=====================================================");
                    System.out.println("---------------- Karyawan Tetap ---------------------");
                    System.out.print(" Masukkan nominal gaji: ");
                    double gajiPokok = scanner.nextDouble();
                    KaryawanTetap karyawanTetap = new KaryawanTetap(gajiPokok);
                    listKaryawan.add(karyawanTetap);
                    System.out.println(" Total gaji: " + karyawanTetap.hitungTotalGaji());
                    System.out.println("=====================================================");
                    break;
                case 2:
                    System.out.println("\n=====================================================");
                    System.out.println("---------------- Karyawan Kontrak -------------------");
                    System.out.print(" Masukkan nominal upah: ");
                    double upah = scanner.nextDouble();
                    System.out.print(" Masukkan jumlah hari masuk: ");
                    int jumlahHariMasuk = scanner.nextInt();
                    KaryawanKontrak karyawanKontrak = new KaryawanKontrak(upah, jumlahHariMasuk);
                    listKaryawan.add(karyawanKontrak);
                    System.out.println(" Total upah: " + karyawanKontrak.hitungTotalUpah());
                    System.out.println("=====================================================");
                    break;
                case 3:
                    System.out.println("\n=====================================================");
                    System.out.println("---------------- Karyawan Paruh Waktu ---------------");
                    KaryawanParuhWaktu karyawanParuhWaktu = new KaryawanParuhWaktu();
                    listKaryawan.add(karyawanParuhWaktu);
                    System.out.println("\n Total upah: " + karyawanParuhWaktu.hitungTotalUpah());
                    System.out.println("=====================================================");
                    break;
                default:
                    System.out.println("\n=====================================================");
                    System.out.println("--------------- Pilihan tidak tersedia --------------");
                    System.out.println("=====================================================");
                    break;
            }

            System.out.print("\n Apakah ingin memilih pilihan lain? (y/t) ");
            String jawaban = scanner.next();
            System.out.println();
            if (jawaban.equalsIgnoreCase("t")) {
                keepRunning = false;
            }
        }
        System.out.println("=====================================================");
        System.out.println("---------------- Rekap Data Karyawan ----------------");
        
        for (int i = 0; i < listKaryawan.size(); i++) {
            Karyawan karyawan = listKaryawan.get(i);
            String jenisKaryawan = "";
            double totalGajiAtauUpah = 0;
            if (karyawan instanceof KaryawanTetap) {

                jenisKaryawan = "Karyawan Tetap";
                totalGajiAtauUpah = ((KaryawanTetap) karyawan).hitungTotalGaji();
            } else if (karyawan instanceof KaryawanKontrak) {
                jenisKaryawan = "Karyawan Kontrak";
                totalGajiAtauUpah = ((KaryawanKontrak) karyawan).hitungTotalUpah();
            } else if (karyawan instanceof KaryawanParuhWaktu) {
                jenisKaryawan = "Karyawan Paruh Waktu";
                totalGajiAtauUpah = ((KaryawanParuhWaktu) karyawan).hitungTotalUpah();
            }

            System.out.println((i + 1) + ". " + jenisKaryawan + " dengan total gaji/upah " + totalGajiAtauUpah);
        }
        System.out.println("=====================================================");
    }
}
