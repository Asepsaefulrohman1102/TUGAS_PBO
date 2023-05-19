import java.io.IOException;
import java.util.Scanner;

public class KaryawanDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu;
        do {
            System.out.println("\n=====================================");
            System.out.println("        Daftar jenis karyawan :");
            System.out.println("=====================================");
            System.out.println("1. Karyawan Tetap");
            System.out.println("2. Karyawan Kontrak\n");
            System.out.print("Pilih jenis karyawan (1/2): ");
            int pilihan = input.nextInt();
            System.out.println("=====================================");
            input.nextLine(); // membersihkan buffer
                    switch (pilihan) {
                    case 1:
                        System.out.println("\nAnda memilih karyawan tetap");
                        System.out.print("Silahkan masukkan gaji : ");
                        int gaji = input.nextInt();
                        KaryawanTetap karyawanTetap = new KaryawanTetap(gaji); // instansiasi objek karyawanTetap
                        // System.out.println("Tunjangan anak " + singkatanNamaTetap + " : " + karyawanTetap.hitungTunjanganAnak());
                        System.out.println("Total gaji             : " + karyawanTetap.hitungTotalGaji() + "\n"); // memanggil method hitungTotalGaji()
                        System.out.println("=====================================");
                        break;

                    case 2:
                        System.out.println("\nAnda memilih karyawan kontrak");
                        System.out.print("Silahkan masukkan upah        : ");
                        int upah = input.nextInt();
                        System.out.print("Silahkan masukkan jumlah hari : ");
                        int jumlahHari = input.nextInt();
                        KaryawanKontrak karyawanKontrak = new KaryawanKontrak(upah, jumlahHari); // instansiasi objek karyawanKontrak
                        System.out.println("Total upah                    : " + karyawanKontrak.hitungTotalUpah() + "\n");
                        System.out.println("=====================================");
                        break;

                    default:
                        System.out.println("Pilihan tidak tersedia\n");
                        break;
                }

                System.out.print("Apakah anda ingin mengulang (y/t)? ");
                menu = input.next();
                input.nextLine(); // membersihkan buffer

                if (menu.equalsIgnoreCase("t")) {
                    try {
                        if (System.getProperty("os.name").contains("Windows")) {
                            //System.getProperty("os.name") digunakan untuk mendapatkan nama sistem operasi yang digunakan
                            //contains() digunakan untuk memeriksa apakah sebuah string berisi substring tertentu

                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            //ProcessBuilder digunakan untuk menjalankan perintah pada terminal
                            //inheritIO() digunakan untuk mengambil input dari terminal
                            //start() digunakan untuk menjalankan perintah
                            //waitFor() digunakan untuk menunggu proses selesai
                    
                        } else {
                            System.out.print("\033[H\033[2J"); // "\033[H\033[2J" digunakan untuk membersihkan layar pada terminal linux
                            System.out.flush(); //flush() digunakan untuk mengosongkan buffer output stream
                            //buffer digunakan untuk menyimpan data sementara
                        }
                    } catch (IOException | InterruptedException ex) {
                        //InterruptedException digunakan untuk menangani kesalahan yang terjadi pada thread
                        System.out.println("Failed to clear the screen: " + ex.getMessage()); //getMessage() digunakan untuk mendapatkan pesan kesalahan
                    }
                    System.out.println("Terima kasih telah menggunakan program ini");
                    break;
                }
        } while (menu.equalsIgnoreCase("y"));
        //equalsIgnoreCase() digunakan untuk membandingkan dua buah string tanpa memperhatikan besar kecilnya huruf
    }

}
