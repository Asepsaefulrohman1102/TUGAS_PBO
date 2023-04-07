package user;

public class Mahasiswa {
    public String nim;
    public String nama;
    public String alamat;
    public double ipk;

    public Mahasiswa() {
        // tidak melakukan apa-apa
    }

    public Mahasiswa(String nim) {
        this.nim = nim;
    }

    public Mahasiswa(String nimBaru, String namaBaru, String alamatBaru, double ipkBaru) {
        this.nama = namaBaru;
        this.alamat = alamatBaru;
        this.nim = nimBaru;
        this.ipk = ipkBaru;
    }

    public String predikat(double ipk) {
        if (ipk >= 2.0 && ipk <= 2.75) {
            return "Memuaskan";
        } else if (ipk >= 2.76 && ipk <= 3.5) {
            return "Sangat memuaskan";
        } else if (ipk >= 3.51 && ipk <= 4.0) {
            return "Dengan pujian";
        } else {
            return "-";
        }
    }

    public void cetak() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Alamat   : " + alamat);
        System.out.println("IPK      : " + ipk);
        System.out.println("Predikat : " + predikat(ipk));
    }

    public static void info() {
        // membuat objek mahasiswa dengan konstruktor 1
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Asep Saeful Rohman";
        mhs1.nim = "A11.2021.13705";
        mhs1.alamat = "Jl. Sadewa 1 No. 53";
        mhs1.ipk = 3.8;
        mhs1.cetak();
    }
}
