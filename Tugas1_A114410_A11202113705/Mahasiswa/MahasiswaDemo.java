public class MahasiswaDemo {
    public static void main(String[] args) {
        // membuat objek mahasiswa dengan konstruktor 1
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Asep Saeful Rohman";
        mhs1.alamat = "Jl. Sadewa 1 No. 53";
        mhs1.nim = "A11.2021.13705";
        mhs1.ipk = 3.8;
        mhs1.cetak();

        // membuat objek mahasiswa dengan konstruktor 2
        Mahasiswa mhs2 = new Mahasiswa("A11.2021.13718");
        mhs2.nama = "Annisa Ayu Istiqomah";
        mhs2.alamat = "Jl. Ahmad Yani No. 123";
        mhs2.ipk = 3.6;
        mhs2.cetak();

        // membuat objek mahasiswa dengan konstruktor 3
        Mahasiswa mhs3 = new Mahasiswa("A11.2021.13699", "Cynthia Dwi Nafanda", "Jl. Puspanjolo Timur VI No. 23", 3.8);
        mhs3.cetak();
    }
}
