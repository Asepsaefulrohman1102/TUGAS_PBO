// import java.io.IOException;
// import java.text.DecimalFormat;
// import java.util.Locale;
// import java.util.Scanner;
// import java.text.NumberFormat;

// public class KaryawanDemo {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String menu;
//         DecimalFormat formatRupiah = (DecimalFormat) NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
//         formatRupiah.setPositivePrefix("Rp. ");
//         formatRupiah.setNegativePrefix("-Rp. ");
//         boolean clearScreen = true;
//         do {
//             if (clearScreen) {
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
//             }
            
//             System.out.println("\n===============================================");
//             System.out.println("        Daftar jenis karyawan :");
//             System.out.println("===============================================");
//             System.out.println("1. Karyawan Tetap");
//             System.out.println("2. Karyawan Kontrak\n");
//             System.out.print("Pilih jenis karyawan (1/2): ");
//             int pilihan = input.nextInt();
//             System.out.println("===============================================");
//             input.nextLine(); // membersihkan buffer
//                     switch (pilihan) {
//                     case 1:
//                         System.out.println("\nAnda memilih karyawan tetap");
//                         System.out.print("Silahkan masukkan nama                : ");
//                         String namaTetap = input.nextLine();
//                         System.out.print("Silahkan masukkan jumlah anak         : ");
//                         int jumlahAnakTetap = input.nextInt();
//                         System.out.print("Silahkan masukkan gaji                : ");
//                         long gaji = input.nextLong();
//                         KaryawanTetap karyawanTetap = new KaryawanTetap(namaTetap, jumlahAnakTetap, gaji);
//                         String singkatanNamaTetap = singkatanNama(karyawanTetap.nama);
//                         // System.out.println("Tunjangan anak " + singkatanNamaTetap + " : " + karyawanTetap.hitungTunjanganAnak());
//                         System.out.println("Total gaji " + singkatanNamaTetap + "  : " + formatRupiah.format(karyawanTetap.hitungTotalGaji()) + "\n");
//                         break;

//                     case 2:
//                         System.out.println("\nAnda memilih karyawan kontrak");
//                         System.out.print("Silahkan masukkan nama                 : ");
//                         String namaKontrak = input.nextLine();
//                         System.out.print("Silahkan masukkan jumlah anak          : ");
//                         int jumlahAnakKontrak = input.nextInt();
//                         System.out.print("Silahkan masukkan upah                 : ");
//                         long upah = input.nextLong();
//                         System.out.print("Silahkan masukkan jumlah hari          : ");
//                         int jumlahHari = input.nextInt();
//                         KaryawanKontrak karyawanKontrak = new KaryawanKontrak(namaKontrak, jumlahAnakKontrak, upah, jumlahHari);
//                         String singkatanNamaKontrak = singkatanNama(karyawanKontrak.nama);
//                         System.out.println("Total upah " + singkatanNamaKontrak + "  : " + formatRupiah.format(karyawanKontrak.hitungTotalUpah()) + "\n");
//                         break;

//                     default:
//                         System.out.println("Pilihan tidak tersedia\n");
//                         break;
//                 }

//                 System.out.print("Apakah anda ingin mengulang (y/t)? ");
//                 menu = input.next();
//                 input.nextLine(); // membersihkan buffer
//                 clearScreen = menu.equalsIgnoreCase("y");

//                 if (menu.equalsIgnoreCase("t")) {
//                     try {
//                         if (System.getProperty("os.name").contains("Windows")) {
//                             new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//                         } else {
//                             System.out.print("\033[H\033[2J");
//                             System.out.flush();
//                         }
//                     } catch (IOException | InterruptedException ex) {
//                         System.out.println("Failed to clear the screen: " + ex.getMessage());
//                     }
//                     System.out.println("Terima kasih telah menggunakan program ini!");
//                     break;
//                 }
//         } while (menu.equalsIgnoreCase("y"));
//     }

//     private static String singkatanNama(String nama) {
//         String[] kata = nama.split(" ");
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < kata.length; i++) {
//             if (i == 0) {
//                 sb.append(kata[i]);
//             } else {
//                 if (kata.length > 2 && i > 1) {
//                     sb.append(kata[i].charAt(0));
//                 } else {
//                     sb.append(" ").append(kata[i].charAt(0)).append("."); 
//                 }
//             }
//         }
//         return sb.toString();
//     }
    

// }


import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class KaryawanDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu;
        DecimalFormat formatRupiah = (DecimalFormat) NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        formatRupiah.setPositivePrefix("Rp. ");
        formatRupiah.setNegativePrefix("-Rp. ");
        boolean clearScreen = true;
        do {
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
            }

            System.out.println("\n===============================================");
            System.out.println("            Daftar jenis karyawan :");
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
                        System.out.print("Silahkan masukkan nama          : ");
                        String namaTetap = input.nextLine();
                        System.out.print("Silahkan masukkan jumlah anak   : ");
                        int jumlahAnakTetap = input.nextInt();
                        System.out.print("Silahkan masukkan gaji          : Rp. ");
                        long gaji = input.nextLong();
                        KaryawanTetap karyawanTetap = new KaryawanTetap(namaTetap, jumlahAnakTetap, gaji);
                        String singkatanNamaTetap = singkatanNama(karyawanTetap.nama);
                        String totalGajiFormat = "%-" + (39 - singkatanNamaTetap.length()) + "s : %s%n"; 
                        System.out.printf(totalGajiFormat, "Total gaji " + singkatanNamaTetap,formatRupiah.format(karyawanTetap.hitungTotalGaji()));
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("\nAnda memilih karyawan kontrak");
                        System.out.print("Silahkan masukkan nama          : ");
                        String namaKontrak = input.nextLine();
                        System.out.print("Silahkan masukkan jumlah anak   : ");
                        int jumlahAnakKontrak = input.nextInt();
                        System.out.print("Silahkan masukkan upah          : Rp.  ");
                        long upah = input.nextLong();
                        System.out.print("Silahkan masukkan jumlah hari   : ");
                        int jumlahHari = input.nextInt();
                        KaryawanKontrak karyawanKontrak = new KaryawanKontrak(namaKontrak, jumlahAnakKontrak, upah, jumlahHari);
                        String singkatanNamaKontrak = singkatanNama(karyawanKontrak.nama);
                        String totalGajiFormatKontrak = "%-" + (39 - singkatanNamaKontrak.length()) + "s : %s%n";
                        System.out.printf(totalGajiFormatKontrak, "Total gaji " + singkatanNamaKontrak,formatRupiah.format(karyawanKontrak.hitungTotalUpah()));
                        System.out.println();
                        break;

                    default:
                        System.out.println("Pilihan tidak tersedia\n");
                        break;
                }

                System.out.print("Apakah anda ingin mengulang (y/t)? ");
                menu = input.next();
                input.nextLine(); // membersihkan buffer
                clearScreen = menu.equalsIgnoreCase("y");
            
                
        } while (menu.equalsIgnoreCase("y"));

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
            System.out.println("Terima kasih telah menggunakan program ini!");
        }
        input.close();
    }

    private static String singkatanNama(String nama) {
        String[] kata = nama.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < kata.length; i++) {
            if (i == 0) {
                sb.append(kata[i]);
            } else {
                if (kata.length > 2 && i > 1) {
                    sb.append(kata[i].charAt(0));
                } else {
                    sb.append(" ").append(kata[i].charAt(0)).append("."); 
                }
            }
        }
        return sb.toString();
    }

}

