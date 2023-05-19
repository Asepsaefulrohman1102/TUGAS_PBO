// Class KaryawanTetap merupakan subclass dari class Karyawan
// class KaryawanTetap extends Karyawan {
//     // atribut gaji pokok
//     private long gajiPokok;

//     // constructor
//     public KaryawanTetap(String nama, int jumlahAnak, long gajiPokok) {
//         super(nama, jumlahAnak, gajiPokok);
//         this.gajiPokok = gajiPokok;
//     }

//     // method untuk menghitung total gaji
//     public long hitungTotalGaji() {
//         return gajiPokok + hitungTunjanganAnak();
//     }
// }

// REV 1
// Class KaryawanTetap merupakan subclass dari class Karyawan
class KaryawanTetap extends Karyawan {
    // constructor
public KaryawanTetap(String nama, int jumlahAnak, long gajiPokok) {
super(nama, jumlahAnak, gajiPokok);
}

// method untuk menghitung total gaji
public long hitungTotalGaji() {
    return gajiPokokAtauUpahHarian + hitungTunjanganAnak();
}
}
