public class Main {
    public static void main(String[] args) {
        // membuat objek mahasiswa dengan konstruktor 1
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Budi";
        mhs1.alamat = "Jl. Jend. Sudirman No. 123";
        mhs1.nim = "10101010";
        mhs1.ipk = 3.5;
        mhs1.cetak();

        // membuat objek mahasiswa dengan konstruktor 2
        Mahasiswa mhs2 = new Mahasiswa("20202020");
        mhs2.nama = "Joko";
        mhs2.alamat = "Jl. Ahmad Yani No. 456";
        mhs2.ipk = 2.8;
        mhs2.cetak();

        // membuat objek mahasiswa dengan konstruktor 3
        Mahasiswa mhs3 = new Mahasiswa("30303030", "Andi", "Jl. Gatot Subroto No. 789", 3.9);
        mhs3.cetak();
    }
}
