import java.util.ArrayList;
import java.util.Scanner;

public class KaryawanDemo {
    private static ArrayList<String> rekapData = new ArrayList<>(); // untuk menyimpan data rekap

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // menampilkan menu pilihan
            System.out.println("Silahkan pilih jenis karyawan: ");
            System.out.println("1. Karyawan Tetap");
            System.out.println("2. Karyawan Kontrak");
            System.out.println("3. Karyawan Paruh Waktu");

            int pilihan = sc.nextInt();
            sc.nextLine(); // membersihkan newline di buffer input

            switch (pilihan) {
                case 1:
                    // meminta input gaji
                    System.out.println("Masukkan gaji pokok: ");
                    int gaji = sc.nextInt();

                    // membuat objek karyawan tetap dan menghitung total gaji
                    KaryawanTetap karyawanTetap = new KaryawanTetap(gaji);
                    int totalGaji = karyawanTetap.hitungTotalGaji();

                    // menampilkan total gaji dan menyimpan data rekap
                    System.out.println("Total gaji: " + totalGaji);
                    rekapData.add("Karyawan Tetap dengan total gaji " + totalGaji);
                    break;
                case 2:
                    // meminta input upah dan jumlah hari masuk
                    System.out.println("Masukkan upah harian: ");
                    int upah = sc.nextInt();
                    System.out.println("Masukkan jumlah hari masuk: ");
                    int jumlahHari = sc.nextInt();

                    // membuat objek karyawan kontrak dan menghitung total upah
                    KaryawanKontrak karyawanKontrak = new KaryawanKontrak(upah, jumlahHari);
                    int totalUpah = karyawanKontrak.hitungTotalUpah();

                    // menampilkan total upah dan menyimpan data rekap
                    System.out.println("Total upah: " + totalUpah);
                    rekapData.add("Karyawan Kontrak dengan total upah " + totalUpah);
                    break;
                case 3:
                    // membuat objek karyawan paruh waktu dan menghitung total upah
                    KaryawanParuhWaktu karyawanParuhWaktu = new KaryawanParuhWaktu();
                    int totalUpahParuhWaktu = karyawanParuhWaktu.hitungTotalGaji();

                    // menampilkan total upah dan menyimpan data rekap
                    System.out.println("Total upah: " + totalUpahParuhWaktu);
                    rekapData.add("Karyawan Paruh Waktu dengan total upah " + totalUpahParuhWaktu);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

            // meminta konfirmasi untuk melanjutkan atau berhenti
            System.out.println("Apakah ingin memilih pilihan lain? (y/t)");
            String jawaban = sc.nextLine();

            if (jawaban.equalsIgnoreCase("t")) {
                // menampilkan rekap data
                System.out.println("....Rekap Data....");
                for (String data : rekapData) {
                    System.out.println(data);
                }

                // keluar dari program
                System.exit(0);
            }
        }
    }
}
