import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> nilai1 = new ArrayList<>();
        ArrayList<Double> nilai2 = new ArrayList<>();
        ArrayList<Double> jumlah = new ArrayList<>();
        ArrayList<Double> kurang = new ArrayList<>();
        ArrayList<Double> kali = new ArrayList<>();
        ArrayList<Double> bagi = new ArrayList<>();

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();

        System.out.println("Nilai 1");
        for (int i = 0; i < jumlahData; i++) {
            double nilai = input.nextDouble();
            while (nilai < 0) {
                System.out.println("Nilai tidak boleh kurang dari 0. Silahkan masukkan nilai yang lebih besar dari atau sama dengan 0.");
                nilai = input.nextDouble();
            }
            nilai1.add(nilai);
        }

        System.out.println("Nilai 2");
        for (int i = 0; i < jumlahData; i++) {
            double nilai = input.nextDouble();
            while (nilai < 0) {
                System.out.println("Nilai tidak boleh kurang dari 0. Silahkan masukkan nilai yang lebih besar dari atau sama dengan 0.");
                nilai = input.nextDouble();
            }
            nilai2.add(nilai);
        }

        for (int i = 0; i < jumlahData; i++) {
            jumlah.add(nilai1.get(i) + nilai2.get(i));
            kurang.add(nilai1.get(i) - nilai2.get(i));
            kali.add(nilai1.get(i) * nilai2.get(i));
            bagi.add(nilai1.get(i) / nilai2.get(i));
        }

        System.out.println("Hasil Jumlah nilai 1 dan nilai 2 ");
        for (int i = 0; i < jumlahData; i++) {
            double hasil = Math.max(0, jumlah.get(i));
            if (hasil == (int) hasil) {
                System.out.println("Index ke-" + i + " = " + Math.round(hasil));
            } else {
                System.out.println("Index ke-" + i + " = " + hasil);
            }
        }

        System.out.println("Hasil Pengurangan nilai 1 dan nilai 2 ");
        for (int i = 0; i < jumlahData; i++) {
            double hasil = Math.max(0, kurang.get(i));
            if (hasil == (int) hasil) {
                System.out.println("Index ke-" + i + " = " + Math.round(hasil));
            } else {
                System.out.println("Index ke-" + i + " = " + hasil);
            }
        }

        System.out.println("Hasil Perkalian nilai 1 dan nilai 2 ");
        for (int i = 0; i < jumlahData; i++) {
            double hasil = Math.max(0, kali.get(i));
            if (hasil == (int) hasil) {
                System.out.println("Index ke-" + i + " = " + Math.round(hasil));
            } else {
                System.out.println("Index ke-" + i + " = " + hasil);
            }
        }

        System.out.println("Hasil Pembagian nilai 1 dan nilai 2 ");
        for (int i = 0; i < jumlahData; i++) {
            double hasil = Math.max(0, bagi.get(i));
            if (hasil == (int) hasil) {
                System.out.println("Index ke-" + i + " = " + Math.round(hasil));
            } else {
                System.out.println("Index ke-" + i + " = " + hasil);
            }
        }
    }
}