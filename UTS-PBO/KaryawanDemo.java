import java.util.ArrayList;
import java.util.Scanner;

public class KaryawanDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Karyawan> listKaryawan = new ArrayList<>();

        while (true) {

            System.out.println("\nPilih jenis karyawan:");
            System.out.println("1. Karyawan Tetap");
            System.out.println("2. Karyawan Kontrak");
            System.out.println("3. Karyawan Paruh Waktu");
            System.out.print("Pilihan anda: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan gaji pokok: ");
                    double gajiPokok = input.nextDouble();
                    KaryawanTetap karyawanTetap = new KaryawanTetap(gajiPokok);
                    listKaryawan.add(karyawanTetap);
                    System.out.println("Total gaji: " + karyawanTetap.totalGaji());
                    break;
                case 2:
                    System.out.print("\nMasukkan upah harian: ");
                    double upahHarian = input.nextDouble();
                    System.out.print("Masukkan jumlah hari masuk: ");
                    int jumlahHariMasuk = input.nextInt();
                    KaryawanKontrak karyawanKontrak = new KaryawanKontrak(upahHarian, jumlahHariMasuk);
                    listKaryawan.add(karyawanKontrak);
                    System.out.println("Total upah: " + karyawanKontrak.totalUpah());
                    break;
                case 3:
                    KaryawanParuhWaktu karyawanParuhWaktu = new KaryawanParuhWaktu();
                    listKaryawan.add(karyawanParuhWaktu);
                    System.out.println("\nTotal upah: " + karyawanParuhWaktu.totalUpah());
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }

            System.out.print("Apakah ingin memilih pilihan lain? (y/t) ");
            String jawaban = input.next();
            if (jawaban.equalsIgnoreCase("t")) {
                System.out.println("...Rekap Data...");
                int i = 1;
                for (Karyawan karyawan : listKaryawan) {
                    System.out.println(i + ". " + karyawan.getClass().getSimpleName() + " dengan total "
                            + karyawan.totalPendapatan());
                    i++;
                }
                break;
            }
        }
    }
}

abstract class Karyawan {
    abstract double totalPendapatan();
}

class KaryawanTetap extends Karyawan {
    private double gajiPokok;

    public KaryawanTetap(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double totalGaji() {
        return gajiPokok + tunjanganAnak();
    }

    public double tunjanganAnak() {
        return 0; // implementasi tunjangan anak
    }

    @Override
    public double totalPendapatan() {
        return totalGaji();
    }
}

abstract class KaryawanTidakTetap extends Karyawan {
    private double tunjanganAnak = 500000;
    private double insentifBulanan = 1000000;

    public double tunjanganAnak() {
        return tunjanganAnak;
    }

    public double insentifBulanan() {
        return insentifBulanan;
    }
}

class KaryawanKontrak extends KaryawanTidakTetap {
    private double upahHarian;
    private int jumlahHariMasuk;

    public KaryawanKontrak(double upahHarian, int jumlahHariMasuk) {
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public double totalUpah() {
        return (upahHarian * jumlahHariMasuk) + tunjanganAnak() + insentifBulanan();
    }

    @Override
    public double totalPendapatan() {
        return totalUpah();
    }
}

class KaryawanParuhWaktu extends KaryawanTidakTetap {
    private double upahPerJam = 50000;
    private int jumlahJamKerja = 8;

    public double totalUpah() {
        return (upahPerJam * jumlahJamKerja) + tunjanganAnak() + insentifBulanan();
    }

    @Override
    public double totalPendapatan() {
        return totalUpah();
    }
}


