// // Class utama Karyawan
// class Karyawan {
//     // atribut nama dan jumlah anak
//     protected String nama;
//     protected int jumlahAnak;

//     // constructor
//     public Karyawan(String nama, int jumlahAnak) {
//         this.nama = nama;
//         this.jumlahAnak = jumlahAnak;
//     }

//     // method untuk menghitung tunjangan anak
//     public long hitungTunjanganAnak() {
//         return jumlahAnak * 300000;
//     }
// }

// Class Karyawan, superclass
// class Karyawan {
//     // atribut nama dan jumlah anak
//     protected String nama;
//     protected int jumlahAnak;

//     // constructor
//     public Karyawan(String nama, int jumlahAnak) {
//         this.nama = nama;
//         this.jumlahAnak = jumlahAnak;
//     }

//     // method untuk menghitung tunjangan anak
//     public long hitungTunjanganAnak() {
//         int jumlahAnakYangDihitung = Math.min(jumlahAnak, 3); // hanya hitung maksimal 3 anak
//         return 300000 * jumlahAnakYangDihitung;
//     }
// }


//rev 1
// class Karyawan {
//     // atribut nama, jumlah anak, dan gaji pokok
//     protected String nama;
//     protected int jumlahAnak;
//     protected long gajiPokok;
// // constructor
// public Karyawan(String nama, int jumlahAnak, long gajiPokok) {
//     this.nama = nama;
//     this.jumlahAnak = jumlahAnak;
//     this.gajiPokok = gajiPokok;
// }

// // method untuk menghitung tunjangan anak
// public long hitungTunjanganAnak() {
//     int jumlahAnakYangDihitung = Math.min(jumlahAnak, 3); // hanya hitung maksimal 3 anak
//     double persenTunjangan = 0.02;
//     return (long) (persenTunjangan * gajiPokok * jumlahAnakYangDihitung);
// }
// }


// REV 2
class Karyawan {
// atribut nama, jumlah anak, dan gaji pokok atau upah harian
protected String nama;
protected int jumlahAnak;
protected long gajiPokokAtauUpahHarian;
// constructor
public Karyawan(String nama, int jumlahAnak, long gajiPokokAtauUpahHarian) {
    this.nama = nama;
    this.jumlahAnak = jumlahAnak;
    this.gajiPokokAtauUpahHarian = gajiPokokAtauUpahHarian;
}

// method untuk menghitung tunjangan anak
public long hitungTunjanganAnak() {
    int jumlahAnakYangDihitung = Math.min(jumlahAnak, 3); // hanya hitung maksimal 3 anak
    double persenTunjangan = 0.05;
    return (long) (persenTunjangan * gajiPokokAtauUpahHarian * jumlahAnakYangDihitung);
}
}
