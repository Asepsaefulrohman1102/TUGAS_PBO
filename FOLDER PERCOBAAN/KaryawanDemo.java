import java.util.ArrayList;
import java.util.Scanner;

class Karyawan {
    private double tunjanganAnak;
    private double insentifBulanan;

    public Karyawan(double tunjanganAnak, double insentifBulanan) {
        this.tunjanganAnak = 300000;
        this.insentifBulanan = 1000000;
    }

    public double getTunjanganAnak() {
        return tunjanganAnak;
    }

    public double getInsentifBulanan() {
        return insentifBulanan;
    }

    public void setTunjanganAnak(double tunjanganAnak) {
        this.tunjanganAnak = tunjanganAnak;
    }

    public void setInsentifBulanan(double insentifBulanan) {
        this.insentifBulanan = insentifBulanan;
    }

    public double hitungTotalGaji(double gajiPokok) {
        return gajiPokok + tunjanganAnak;
    }
}

// Class KaryawanTetap
class KaryawanTetap extends Karyawan {
    private double gajiPokok;

    public KaryawanTetap( int tunjanganAnak, int insentifBulanan, double gajiPokok) {
        super( tunjanganAnak, insentifBulanan);
        this.gajiPokok = gajiPokok;
    }

    public KaryawanTetap(double gajiPokok) {
        super(0, 0);
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok + getTunjanganAnak();
    }

    @Override
    public double hitungTotalGaji(double gajiPokok) {
        return super.hitungTotalGaji(gajiPokok);
    }

    public double hitungTotalGaji() {
        return super.hitungTotalGaji(gajiPokok);
    }
}

// Class KaryawanTidakTetap
class KaryawanTidakTetap extends Karyawan {
    public KaryawanTidakTetap( int tunjanganAnak, int insentifBulanan) {
        super( tunjanganAnak, insentifBulanan);
    }

    @Override
    public double hitungTotalGaji(double gajiPokok) {
        return super.hitungTotalGaji(gajiPokok);
    }
}

// Class KaryawanKontrak
class KaryawanKontrak extends KaryawanTidakTetap {
    private double upahHarian;
    private int jumlahHariMasuk;

    public KaryawanKontrak(int tunjanganAnak, int insentifBulanan, double upahHarian, int jumlahHariMasuk) {
        super(tunjanganAnak, insentifBulanan);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public KaryawanKontrak(double upahHarian, int jumlahHariMasuk) {
        super(0, 0);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public double getUpahHarian() {
        return upahHarian;
    }

    public int getJumlahHariMasuk() {
        return jumlahHariMasuk;
    }

    public void setUpahHarian(int upahHarian) {
        this.upahHarian = upahHarian;
    }

    public void setJumlahHariMasuk(int jumlahHariMasuk) {
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    @Override
    public double hitungTotalGaji(double gajiPokok) {
        return super.hitungTotalGaji(gajiPokok);
    }

    public double hitungTotalUpah() {
        return (upahHarian * jumlahHariMasuk) + getTunjanganAnak() + getInsentifBulanan();
    }
}

// Class KaryawanParuhWaktu
class KaryawanParuhWaktu extends KaryawanTidakTetap {
    public KaryawanParuhWaktu(int tunjanganAnak, int insentifBulanan) {
        super(tunjanganAnak, insentifBulanan);
    }

    public KaryawanParuhWaktu() {
        super(0, 0);
    }

    @Override
    public double hitungTotalGaji(double gajiPokok) {
        return super.hitungTotalGaji(0); // tidak ada gaji pokok pada karyawan paruh waktu
    }

    public double hitungTotalUpah() {
        return getTunjanganAnak() + getInsentifBulanan();
    }
}

public class KaryawanDemo {
    public static void main(String[] args) {
        ArrayList<Karyawan> listKaryawan = new ArrayList<>();
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
