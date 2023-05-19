// import java.io.IOException;
// import java.util.Scanner;

// // Class utama Karyawan
// class Karyawan {
//     // method untuk menghitung tunjangan anak
//     public int hitungTunjanganAnak() {
//         return 1 * 300000;
//     }

// }

// // Class Karyawan Kontrak, turunan dari Karyawan
// class KaryawanKontrak extends Karyawan { 
    
//     private int upahHarian; 
//     private int jumlahHari;

//     // constructor
//     public KaryawanKontrak(int upahHarian, int jumlahHari) {  
//         this.upahHarian = upahHarian; 
//         this.jumlahHari = jumlahHari; 
//     }

//     public int hitungTotalUpah() {
//         return upahHarian * jumlahHari + hitungTunjanganAnak();
//     }

// }

// // Class KaryawanTetap merupakan subclass dari class Karyawan
// class KaryawanTetap extends Karyawan { 
    
//     private int gajiPokok; 

//     public KaryawanTetap(int gajiPokok) {
//         this.gajiPokok = gajiPokok;
//     }

//     public int hitungTotalGaji() { 
//         return gajiPokok + hitungTunjanganAnak();
//     }

// }

// public class KaryawanDemo {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String menu;
//         do {
//             System.out.println("\n=====================================");
//             System.out.println("        Daftar jenis karyawan :");
//             System.out.println("=====================================");
//             System.out.println("1. Karyawan Tetap");
//             System.out.println("2. Karyawan Kontrak\n");
//             System.out.print("Pilih jenis karyawan (1/2): ");
//             int pilihan = input.nextInt();
//             System.out.println("=====================================");
//             input.nextLine(); // membersihkan buffer
//             switch (pilihan) {
//                 case 1:
//                     System.out.println("\nAnda memilih karyawan tetap");
//                     System.out.print("Silahkan masukkan gaji : ");
//                     int gaji = input.nextInt();
//                     KaryawanTetap karyawanTetap = new KaryawanTetap(gaji); 
//                     System.out.println("Total gaji             : " + karyawanTetap.hitungTotalGaji() + "\n"); 
//                     System.out.println("=====================================");
//                     break;

//                 case 2:
//                     System.out.println("\nAnda memilih karyawan kontrak");
//                     System.out.print("Silahkan masukkan upah        : ");
//                     int upah = input.nextInt();
//                     System.out.print("Silahkan masukkan jumlah hari : ");
//                     int jumlahHari = input.nextInt();
//                     KaryawanKontrak karyawanKontrak = new KaryawanKontrak(upah, jumlahHari);
//                     System.out.println("Total upah                    : " + karyawanKontrak.hitungTotalUpah() + "\n");
//                     System.out.println("=====================================");
//                     break;

//                 default:
//                     System.out.println("Pilihan tidak tersedia\n");
//                     break;
//             }

//             System.out.print("Apakah anda ingin mengulang (y/t)? ");
//             menu = input.next();
//             input.nextLine(); // membersihkan buffer

//             if (menu.equalsIgnoreCase("t")) {
//                 try {
//                     if (System.getProperty("os.name").contains("Windows")) {
//                         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//                     } else {
//                         System.out.print("\033[H\033[2J");
//                         System.out.flush(); 
//                     }
//                 } catch (IOException | InterruptedException ex) {
//                     System.out.println("Failed to clear the screen: " + ex.getMessage());
//                 }
//                 System.out.println("Terima kasih telah menggunakan program ini");
//                 break;
//             }
//         } while (menu.equalsIgnoreCase("y"));
//     }

// }

//REVISI 2
// import java.io.IOException;
// import java.text.NumberFormat;
// import java.util.Locale;
// import java.util.Scanner;

// // Class utama Karyawan
// class Karyawan {
//     // method untuk menghitung tunjangan anak
//     public double hitungTunjanganAnak() {
//         return 1 * 300000;
//     }

// }

// // Class Karyawan Kontrak, turunan dari Karyawan
// class KaryawanKontrak extends Karyawan {

//     private double upahHarian;
//     private int jumlahHari;

//     // constructor
//     public KaryawanKontrak(double upahHarian, int jumlahHari) {
//         this.upahHarian = upahHarian;
//         this.jumlahHari = jumlahHari;
//     }

//     public double hitungTotalUpah() {
//         return upahHarian * jumlahHari + hitungTunjanganAnak();
//     }

// }

// // Class KaryawanTetap merupakan subclass dari class Karyawan
// class KaryawanTetap extends Karyawan {

//     private double gajiPokok;

//     public KaryawanTetap(double gajiPokok) {
//         this.gajiPokok = gajiPokok;
//     }

//     public double hitungTotalGaji() {
//         return gajiPokok + hitungTunjanganAnak();
//     }

// }

// public class KaryawanDemo {
// public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String menu;
//         NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

//         do {
//             System.out.println("\n=====================================");
//             System.out.println("        Daftar jenis karyawan :");
//             System.out.println("=====================================");
//             System.out.println("1. Karyawan Tetap");
//             System.out.println("2. Karyawan Kontrak\n");
//             System.out.print("Pilih jenis karyawan (1/2): ");
//             int pilihan = input.nextInt();
//             System.out.println("=====================================");
//             input.nextLine(); // membersihkan buffer

//             switch (pilihan) {
//                 case 1:
//                     System.out.println("\nAnda memilih karyawan tetap");
//                     System.out.print("Silahkan masukkan gaji : ");
//                     double gaji = input.nextDouble();
//                     KaryawanTetap karyawanTetap = new KaryawanTetap(gaji);
//                     System.out.println("Total gaji             : " + formatRupiah.format(karyawanTetap.hitungTotalGaji()) + "\n");
//                     System.out.println("=====================================");
//                     break;

//                 case 2:
//                     System.out.println("\nAnda memilih karyawan kontrak");
//                     System.out.print("Silahkan masukkan upah        : ");
//                     double upah = input.nextDouble();
//                     System.out.print("Silahkan masukkan jumlah hari : ");
//                     int jumlahHari = input.nextInt();
//                     KaryawanKontrak karyawanKontrak = new KaryawanKontrak(upah, jumlahHari);
//                     System.out.println("Total upah                    : " + formatRupiah.format(karyawanKontrak.hitungTotalUpah()) + "\n");
//                     System.out.println("=====================================");
//                     break;

//                 default:
//                 System.out.println("\nPilihan tidak tersedia!");
//                 break;
//             }

//             // Memeriksa apakah pengguna ingin mengulangi program
//             System.out.print("Apakah Anda ingin melanjutkan? (y/t): ");
//             menu = input.next();
//         } while (menu.equalsIgnoreCase("y"));

//         if (menu.equalsIgnoreCase("t")) {
//                 try {
//                     if (System.getProperty("os.name").contains("Windows")) {
//                         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//                     } else {
//                         System.out.print("\033[H\033[2J");
//                         System.out.flush(); 
//                     }
//                 } catch (IOException | InterruptedException ex) {
//                     System.out.println("Failed to clear the screen: " + ex.getMessage());
//                 }
//                 System.out.println("Terima kasih telah menggunakan program ini");
//             }

//         input.close();
//     }
// }


// //FINAL REVISI
// import java.io.IOException;
// import java.text.NumberFormat;
// import java.util.Locale;
// import java.util.Scanner;

// // Class utama Karyawan
// class Karyawan {
//     // method untuk menghitung tunjangan anak
//     public long hitungTunjanganAnak() {
//         return 1 * 300000;
//     }

// }

// // Class Karyawan Kontrak, turunan dari Karyawan
// class KaryawanKontrak extends Karyawan {

//     private long upahHarian;
//     private int jumlahHari;

//     // constructor
//     public KaryawanKontrak(long upahHarian, int jumlahHari) {
//         this.upahHarian = upahHarian;
//         this.jumlahHari = jumlahHari;
//     }

//     public long hitungTotalUpah() {
//         return upahHarian * jumlahHari + hitungTunjanganAnak();
//     }

// }

// // Class KaryawanTetap merupakan subclass dari class Karyawan
// class KaryawanTetap extends Karyawan {

//     private long gajiPokok;

//     public KaryawanTetap(long gajiPokok) {
//         this.gajiPokok = gajiPokok;
//     }

//     public long hitungTotalGaji() {
//         return gajiPokok + hitungTunjanganAnak();
//     }

// }

// public class KaryawanDemo {
//     public static void main(String[] args) {
//             Scanner input = new Scanner(System.in);
//             String menu;
            
//             NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID", "IDR"));

//             do {
//                 System.out.println("\n==========================================");
//                 System.out.println("        Daftar jenis karyawan :");
//                 System.out.println("==========================================");
//                 System.out.println("1. Karyawan Tetap");
//                 System.out.println("2. Karyawan Kontrak\n");
//                 System.out.print("Pilih jenis karyawan (1/2): ");
//                 int pilihan = input.nextInt();
//                 System.out.println("==========================================");
//                 input.nextLine(); // membersihkan buffer

//                 switch (pilihan) {
//                     case 1:
//                         System.out.println("\nAnda memilih karyawan tetap");
//                         System.out.print("Silahkan masukkan gaji : Rp. ");
//                         long gaji = input.nextLong();
//                         KaryawanTetap karyawanTetap = new KaryawanTetap(gaji);
//                         System.out.println("Total gaji             : " + formatRupiah.format(karyawanTetap.hitungTotalGaji()) + "\n");
//                         System.out.println("==========================================");
//                         break;

//                     case 2:
//                         System.out.println("\nAnda memilih karyawan kontrak");
//                         System.out.print("Silahkan masukkan upah        : Rp. ");
//                         long upah = input.nextLong();
//                         System.out.print("Silahkan masukkan jumlah hari : ");
//                         int jumlahHari = input.nextInt();
//                         KaryawanKontrak karyawanKontrak = new KaryawanKontrak(upah, jumlahHari);
//                         System.out.println("Total upah                    : " + formatRupiah.format(karyawanKontrak.hitungTotalUpah()) + "\n");
//                         System.out.println("==========================================");
//                         break;

//                     default:
//                     System.out.println("\nPilihan tidak tersedia!");
//                     break;
//                 }

//                 // Memeriksa apakah pengguna ingin mengulangi program
//                 System.out.print("Apakah Anda ingin melanjutkan? (y/t): ");
//                 menu = input.next();
//             } while (menu.equalsIgnoreCase("y"));

//             if (menu.equalsIgnoreCase("t")) {
//                 try {
//                     if (System.getProperty("os.name").contains("Windows")) {
//                         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//                     } else {
//                         System.out.print("\033[H\033[2J");
//                         System.out.flush(); 
//                     }
//                 } catch (IOException | InterruptedException ex) {
//                     System.out.println("Failed to clear the screen: " + ex.getMessage());
//                 }
//                 System.out.println("Terima kasih telah menggunakan program ini");
//             }

//             input.close();
//         }
// }

// import java.text.NumberFormat;
// import java.util.Locale;
// import java.util.Scanner;

// // Class utama Karyawan
// class Karyawan {
//     // method untuk menghitung tunjangan anak
//     public long hitungTunjanganAnak() {
//         return 1 * 300000;
//     }

// }

// // Class Karyawan Kontrak, turunan dari Karyawan
// class KaryawanKontrak extends Karyawan {

//     private long upahHarian;
//     private int jumlahHari;

//     // constructor
//     public KaryawanKontrak(long upahHarian, int jumlahHari) {
//         this.upahHarian = upahHarian;
//         this.jumlahHari = jumlahHari;
//     }

//     public long hitungTotalUpah() {
//         return upahHarian * jumlahHari + hitungTunjanganAnak();
//     }

// }

// // Class KaryawanTetap merupakan subclass dari class Karyawan
// class KaryawanTetap extends Karyawan {

//     private long gajiPokok;

//     public KaryawanTetap(long gajiPokok) {
//         this.gajiPokok = gajiPokok;
//     }

//     public long hitungTotalGaji() {
//         return gajiPokok + hitungTunjanganAnak();
//     }

// }

// public class KaryawanDemo {
//     public static void main(String[] args) {
//             Scanner input = new Scanner(System.in);
//             String menu;
//             //simbol mata uang Rp.
//             NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID", "Rp. "));
            

//             do {
//                 System.out.println("\n==========================================");
//                 System.out.println("        Daftar jenis karyawan :");
//                 System.out.println("==========================================");
//                 System.out.println("1. Karyawan Tetap");
//                 System.out.println("2. Karyawan Kontrak\n");
//                 System.out.print("Pilih jenis karyawan (1/2): ");
//                 int pilihan = input.nextInt();
//                 System.out.println("==========================================");
//                 input.nextLine(); // membersihkan buffer

//                 switch (pilihan) {
//                     case 1:
//                         System.out.println("\nAnda memilih karyawan tetap");
//                         System.out.print("Silahkan masukkan gaji : Rp");
//                         long gaji = input.nextLong();
//                         KaryawanTetap karyawanTetap = new KaryawanTetap(gaji);
//                         System.out.println("Total gaji             : " + formatRupiah.format(karyawanTetap.hitungTotalGaji()) + "\n");
//                         System.out.println("==========================================");
//                         break;
//                     case 2:
//                         System.out.println("\nAnda memilih karyawan kontrak");
//                         System.out.print("Silahkan masukkan upah harian : Rp");
//                         long upahHarian = input.nextLong();
//                         System.out.print("Silahkan masukkan jumlah hari kerja : ");
//                         int jumlahHari = input.nextInt();
//                         KaryawanKontrak karyawanKontrak = new KaryawanKontrak(upahHarian, jumlahHari);
//                         System.out.println("Total upah             : " + formatRupiah.format(karyawanKontrak.hitungTotalUpah()) + "\n");
//                         System.out.println("==========================================");
//                         break;
//                     default:
//                         System.out.println("\nPilihan tidak tersedia!");
//                         break;
//                 }

//                 // Memeriksa apakah pengguna ingin mengulangi program
//                 System.out.print("Apakah Anda ingin melanjutkan? (y/t): ");
//                 menu = input.next();
//             } while (menu.equalsIgnoreCase("y"));

//         }
//     }

// import java.io.IOException;
// import java.text.DecimalFormat;
// import java.util.Locale;
// import java.util.Scanner;
// // NUmberFormat
// import java.text.NumberFormat;
// //currency
// import java.util.Currency;

// // Class utama Karyawan
// class Karyawan {
//     // method untuk menghitung tunjangan anak
//     public long hitungTunjanganAnak() {
//         return 1 * 300000;
//     }
// }

// // Class Karyawan Kontrak, turunan dari Karyawan
// class KaryawanKontrak extends Karyawan {

//     private long upahHarian;
//     private int jumlahHari;

//     // constructor
//     public KaryawanKontrak(long upahHarian, int jumlahHari) {
//         this.upahHarian = upahHarian;
//         this.jumlahHari = jumlahHari;
//     }

//     public long hitungTotalUpah() {
//         return upahHarian * jumlahHari + hitungTunjanganAnak();
//     }

// }

// // Class KaryawanTetap merupakan subclass dari class Karyawan
// class KaryawanTetap extends Karyawan {

//     private long gajiPokok;

//     public KaryawanTetap(long gajiPokok) {
//         this.gajiPokok = gajiPokok;
//     }

//     public long hitungTotalGaji() {
//         return gajiPokok + hitungTunjanganAnak();
//     }

// }

// public class KaryawanDemo {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String menu;
//         DecimalFormat formatRupiah = (DecimalFormat) NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
//         formatRupiah.setPositivePrefix("Rp. ");
//         formatRupiah.setNegativePrefix("-Rp. ");

//         do {
//             System.out.println("\n==========================================");
//             System.out.println("        Daftar jenis karyawan :");
//             System.out.println("==========================================");
//             System.out.println("1. Karyawan Tetap");
//             System.out.println("2. Karyawan Kontrak\n");
//             System.out.print("Pilih jenis karyawan (1/2): ");
//             int pilihan = input.nextInt();
//             System.out.println("==========================================");
//             input.nextLine(); // membersihkan buffer

//             switch (pilihan) {
//                 case 1:
//                     System.out.println("\nAnda memilih karyawan tetap");
//                     System.out.print("Silahkan masukkan gaji : Rp. ");
//                     long gaji = input.nextLong();
//                     KaryawanTetap karyawanTetap = new KaryawanTetap(gaji);
//                     System.out.println("Total gaji             : " + formatRupiah.format(karyawanTetap.hitungTotalGaji()) + "\n");
//                     System.out.println("==========================================");
//                     break;
//                 default:
//                     System.out.println("\nPilihan tidak tersedia!");
//                     break;
//             }

//             // Memeriksa apakah pengguna ingin mengulangi program
//             System.out.print("Apakah Anda ingin melanjutkan? (y/t): ");
//             menu = input.next();
//         } while (menu.equalsIgnoreCase("y"));
//     }
// }


// //FINAL REVISI
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

// Class utama Karyawan
class Karyawan {
    // method untuk menghitung tunjangan anak
    public long hitungTunjanganAnak() {
        return 1 * 300000;
    }
}

// Class Karyawan Kontrak, turunan dari Karyawan
class KaryawanKontrak extends Karyawan {

    public static final String nama = null;
    private long upahHarian;
    private int jumlahHari;

    // constructor
    public KaryawanKontrak(long upahHarian, int jumlahHari) {
        this.upahHarian = upahHarian;
        this.jumlahHari = jumlahHari;
    }

    public long hitungTotalUpah() {
        return upahHarian * jumlahHari + hitungTunjanganAnak();
    }

}

// Class KaryawanTetap merupakan subclass dari class Karyawan
class KaryawanTetap extends Karyawan {

    public static final String nama = null;
    private long gajiPokok;

    public KaryawanTetap(long gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public long hitungTotalGaji() {
        return gajiPokok + hitungTunjanganAnak();
    }

}

public class KaryawanDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu;
        DecimalFormat formatRupiah = (DecimalFormat) NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        formatRupiah.setPositivePrefix("Rp. ");
        formatRupiah.setNegativePrefix("-Rp. ");

        do {
            System.out.println("\n===============================================");
            System.out.println("        Daftar jenis karyawan :");
            System.out.println("===============================================");
            System.out.println("1. Karyawan Tetap");
            System.out.println("2. Karyawan Kontrak\n");
            System.out.print("Pilih jenis karyawan (1/2): ");
            int pilihan = input.nextInt();
            System.out.println("===============================================");
            input.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.println("\nAnda memilih karyawan tetap");
                    System.out.print("Silahkan masukkan gaji : Rp. ");
                    long gaji = input.nextLong();
                    KaryawanTetap karyawanTetap = new KaryawanTetap(gaji);
                    System.out.println("Total gaji             : " + formatRupiah.format(karyawanTetap.hitungTotalGaji()) + "\n");
                    System.out.println("===============================================");
                    break;

                case 2:
                    System.out.println("\nAnda memilih karyawan kontrak");
                    System.out.print("Silahkan masukkan upah        : Rp. ");
                    long upah = input.nextLong();
                    System.out.print("Silahkan masukkan jumlah hari : ");
                    int jumlahHari = input.nextInt();
                    KaryawanKontrak karyawanKontrak = new KaryawanKontrak(upah, jumlahHari);
                    System.out.println("Total upah                    : " + formatRupiah.format(karyawanKontrak.hitungTotalUpah()) + "\n");
                    System.out.println("===============================================");
                    break;

                default:
                System.out.println("\nPilihan tidak tersedia!");
                break;
            }

            // Memeriksa apakah pengguna ingin mengulangi program
            System.out.print("Apakah Anda ingin melanjutkan? (y/t): ");
            menu = input.next();
        } while (menu.equalsIgnoreCase("y"));

        System.out.println("Terima kasih telah menggunakan program ini");

        input.close();
    }
}