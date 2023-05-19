import java.util.Scanner;

public class ExceptionArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan angka pembilang: ");
            int numerator = scanner.nextInt();

            System.out.print("Masukkan angka penyebut: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Hasil pembagian: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Pembagian dengan nol!");
            System.out.println("Error: " + e.getMessage());
        }
    }
}


// import java.util.Scanner;

// public class ExceptionArithmetic {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         try {
//             System.out.println("Program operasi aritmatika");
//             System.out.print("Masukkan sebuah bilangan bulat: ");
//             int number = scanner.nextInt();

//             // Operasi pembagian
//             if (number == 0) {
//                 throw new ArithmeticException("Tidak dapat membagi dengan nol");
//             }
//             int divisionResult = 10 / number;
//             System.out.println("Hasil pembagian: " + divisionResult);

//             // Operasi penambahan
//             // int additionResult = 10 + number;
//             // System.out.println("Hasil penambahan: " + additionResult);

//             // // Operasi pengurangan
//             // int subtractionResult = 10 - number;
//             // System.out.println("Hasil pengurangan: " + subtractionResult);
//         } catch (ArithmeticException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }


// import java.util.Scanner;

// public class ExceptionArithmetic {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         try {
//             System.out.println("Program pembagian bilangan");
//             System.out.print("Masukkan sebuah bilangan bulat: ");
//             int number = scanner.nextInt();
//             if (number == 0) {
//                 throw new ArithmeticException();
//             }
//             int result = 10 / number;
//             System.out.println("Hasil pembagian: " + result);
//         } catch (ArithmeticException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

