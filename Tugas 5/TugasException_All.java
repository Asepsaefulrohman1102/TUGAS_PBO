import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TugasException_All {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> errorMessages = new ArrayList<>();
        List<String> hasilList = new ArrayList<>();

        try {
            // Exception 1: ArithmeticException
            System.out.print("Masukkan angka pembilang: ");
            int numerator = scanner.nextInt();

            System.out.print("Masukkan angka penyebut: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            hasilList.add("Hasil pembagian: " + result);
        } catch (ArithmeticException e) {
            errorMessages.add("Error: Division by zero");
        }

        // try {
        //     // Exception 2: NullPointerException
        //     System.out.print("Masukkan sebuah string (tidak boleh kosong): ");
        //     scanner.nextLine(); // Membaca baris kosong untuk membersihkan buffer
        //     String str = scanner.nextLine();
        //     if (str != null) {
        //         int length = str.length();
        //         hasilList.add("Panjang string: " + length);
        //     }
        // } catch (NullPointerException e) {
        //     errorMessages.add("Error: Null reference");
        // }

        // Exception 2: NullPointerException
        try {
            System.out.print("Masukkan sebuah string (tidak boleh kosong): ");
            scanner.nextLine(); // Membaca baris kosong untuk membersihkan buffer
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                throw new NullPointerException();
            }
            int length = str.length();
            hasilList.add("Panjang string: " + length);
        } catch (NullPointerException e) {
            // errorMessages.add("String tidak boleh kosong!");
            errorMessages.add("Error: String tidak boleh kosong!" );
        }

        try {
            // Exception 3: ArrayIndexOutOfBoundsException
            System.out.println("Array yang tersedia: [1, 2, 3, 4, 5]");
            System.out.print("Masukkan indeks array: ");
            int index = scanner.nextInt();

            int[] numbers = {1, 2, 3, 4, 5};
            int number = numbers[index]; // Exception akan terjadi di sini jika indeks di luar batas array
            hasilList.add("Angka pada indeks ke-" + index + ": " + number);
        } catch (ArrayIndexOutOfBoundsException e) {
            errorMessages.add("Error: " + e.getMessage());
        }

        try {
            // Exception 4: NumberFormatException
            System.out.print("Masukkan sebuah angka: ");
            String inputNumber = scanner.next();
            int parsedNumber = Integer.parseInt(inputNumber);
            hasilList.add("Angka yang dimasukkan: " + parsedNumber);
        } catch (NumberFormatException e) {
            errorMessages.add("Error: Anda memasukkan string bukan angka! " + e.getMessage());
        }

        try {
            // Exception 5: IllegalArgumentException
            System.out.print("Masukkan usia: ");
            int age = scanner.nextInt();
            if (age >= 0) {
                hasilList.add("Usia: " + age);
            } else {
                throw new IllegalArgumentException("Usia tidak boleh negatif!");
                // Exception akan terjadi di sini jika usia negatif
                // throw akan melempar objek IllegalArgumentException
                // thrw new IllegalArgumentException akan membuat objek IllegalArgumentException baru
            }
        } catch (IllegalArgumentException e) {
            errorMessages.add("Error: " + e.getMessage());
        }

        scanner.close();

        System.out.println("=================================");
        // Menampilkan semua hasil
        System.out.println("\nHasil Input Data:");
        if (hasilList.isEmpty()) {
            System.out.println("Tidak ada hasil.");
        } else {
            for (String hasil : hasilList) {
                System.out.println(hasil);
            }
        }

        System.out.println("=================================");

        // Menampilkan semua pesan kesalahan
        System.out.println("Pesan Kesalahan:");
        if (errorMessages.isEmpty()) {
            System.out.println("Tidak ada kesalahan.");
        } else {
            for (String errorMessage : errorMessages) {
                System.out.println(errorMessage);
            }
        }
        System.out.println("=================================");
        System.out.println("Program Selesai\n");
    }
}



// import java.util.Scanner;

// public class ExceptionExample {
//     public static void main(String[] args) {
//         try {
//             Scanner scanner = new Scanner(System.in);

//             // Exception 1: ArithmeticException
//             System.out.print("Masukkan angka pembilang: ");
//             int numerator = scanner.nextInt();

//             System.out.print("Masukkan angka penyebut: ");
//             int denominator = scanner.nextInt();

//             int result = numerator / denominator;

//             // Exception 2: NullPointerException
//             System.out.print("Masukkan sebuah string (tidak boleh kosong): ");
//             String str = scanner.next();
//             int length = str.length();

//             // Exception 3: ArrayIndexOutOfBoundsException
//             System.out.print("Masukkan indeks array: ");
//             int index = scanner.nextInt();

//             int[] numbers = {1, 2, 3, 4, 5};
//             int number = numbers[index];

//             // Exception 4: NumberFormatException
//             System.out.print("Masukkan sebuah angka: ");
//             String inputNumber = scanner.next();
//             int parsedNumber = Integer.parseInt(inputNumber);

//             // Exception 5: IllegalArgumentException
//             System.out.print("Masukkan usia: ");
//             int age = scanner.nextInt();
//             if (age < 0) {
//                 throw new IllegalArgumentException("Usia tidak boleh negatif!");
//             }

//             scanner.close();
//         } catch (ArithmeticException e) {
//             System.out.println("Error: Division by zero");
//         } catch (NullPointerException e) {
//             System.out.println("Error: Null reference");
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Error: Index out of bounds");
//         } catch (NumberFormatException e) {
//             System.out.println("Error: Invalid number format");
//         } catch (IllegalArgumentException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

// import java.util.Scanner;

// public class ExceptionExample {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         try {
//             // Exception 1: ArithmeticException
//             System.out.print("Masukkan angka pembilang: ");
//             int numerator = scanner.nextInt();

//             System.out.print("Masukkan angka penyebut: ");
//             int denominator = scanner.nextInt();

//             int result = numerator / denominator;
//             System.out.println("Hasil pembagian: " + result);

//             // Exception 2: NullPointerException
//             System.out.print("Masukkan sebuah string (tidak boleh kosong): ");
//             String str = scanner.next();
//             if (str != null) {
//                 int length = str.length();
//                 System.out.println("Panjang string: " + length);
//             }

//             // Exception 3: ArrayIndexOutOfBoundsException
//             System.out.print("Masukkan indeks array: ");
//             int index = scanner.nextInt();

//             int[] numbers = {1, 2, 3, 4, 5};
//             if (index >= 0 && index < numbers.length) {
//                 int number = numbers[index];
//                 System.out.println("Elemen array: " + number);
//             }

//             // Exception 4: NumberFormatException
//             System.out.print("Masukkan sebuah angka: ");
//             String inputNumber = scanner.next();
//             try {
//                 int parsedNumber = Integer.parseInt(inputNumber);
//                 System.out.println("Angka yang dimasukkan: " + parsedNumber);
//             } catch (NumberFormatException e) {
//                 System.out.println("Error: Invalid number format");
//             }

//             // Exception 5: IllegalArgumentException
//             System.out.print("Masukkan usia: ");
//             int age = scanner.nextInt();
//             if (age >= 0) {
//                 System.out.println("Usia: " + age);
//             } else {
//                 throw new IllegalArgumentException("Usia tidak boleh negatif!");
//             }
//         } catch (ArithmeticException e) {
//             System.out.println("Error: Division by zero");
//         } catch (NullPointerException e) {
//             System.out.println("Error: Null reference");
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Error: Index out of bounds");
//         } catch (IllegalArgumentException e) {
//             System.out.println("Error: " + e.getMessage());
//         }

//         scanner.close();
//     }
// }


// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class ExceptionExample {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         List<String> errorMessages = new ArrayList<>();

//         try {
//             // Exception 1: ArithmeticException
//             System.out.print("Masukkan angka pembilang: ");
//             int numerator = scanner.nextInt();

//             System.out.print("Masukkan angka penyebut: ");
//             int denominator = scanner.nextInt();

//             int result = numerator / denominator;
//             System.out.println("Hasil pembagian: " + result);

//             // Exception 2: NullPointerException
//             System.out.print("Masukkan sebuah string (tidak boleh kosong): ");
//             String str = scanner.next();
//             if (str != null) {
//                 int length = str.length();
//                 System.out.println("Panjang string: " + length);
//             } else {
//                 errorMessages.add("Error: Null reference");
//             }

//             // Exception 3: ArrayIndexOutOfBoundsException
//             System.out.print("Masukkan indeks array: ");
//             int index = scanner.nextInt();

//             int[] numbers = {1, 2, 3, 4, 5};
//             if (index >= 0 && index < numbers.length) {
//                 int number = numbers[index];
//                 System.out.println("Elemen array: " + number);
//             } else {
//                 errorMessages.add("Error: Index out of bounds");
//             }

//             // Exception 4: NumberFormatException
//             System.out.print("Masukkan sebuah angka: ");
//             String inputNumber = scanner.next();
//             try {
//                 int parsedNumber = Integer.parseInt(inputNumber);
//                 System.out.println("Angka yang dimasukkan: " + parsedNumber);
//             } catch (NumberFormatException e) {
//                 errorMessages.add("Error: Invalid number format");
//             }

//             // Exception 5: IllegalArgumentException
//             System.out.print("Masukkan usia: ");
//             int age = scanner.nextInt();
//             if (age >= 0) {
//                 System.out.println("Usia: " + age);
//             } else {
//                 errorMessages.add("Error: Usia tidak boleh negatif!");
//             }
//         } catch (Exception e) {
//             errorMessages.add("Error: " + e.getMessage());
//         }

//         scanner.close();

//         // Menampilkan semua pesan kesalahan
//         System.out.println("\nPesan Kesalahan:");
//         if (errorMessages.isEmpty()) {
//             System.out.println("Tidak ada kesalahan.");
//         } else {
//             for (String errorMessage : errorMessages) {
//                 System.out.println(errorMessage);
//             }
//         }
//     }
// }


// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class ExceptionExample {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         List<String> errorMessages = new ArrayList<>();

//         try {
//             // Exception 1: ArithmeticException
//             System.out.print("Masukkan angka pembilang: ");
//             int numerator = scanner.nextInt();

//             System.out.print("Masukkan angka penyebut: ");
//             int denominator = scanner.nextInt();

//             int result = numerator / denominator;
//             System.out.println("Hasil pembagian: " + result);
//         } catch (ArithmeticException e) {
//             errorMessages.add("Error: Division by zero");
//         }

//         try {
//             // Exception 2: NullPointerException
//             System.out.print("Masukkan sebuah string (tidak boleh kosong): ");
//             String str = scanner.next();
//             if (str != null) {
//                 int length = str.length();
//                 System.out.println("Panjang string: " + length);
//             }
//         } catch (NullPointerException e) {
//             errorMessages.add("Error: Null reference");
//         }

//         try {
//             // Exception 3: ArrayIndexOutOfBoundsException
//             System.out.print("Masukkan indeks array: ");
//             int index = scanner.nextInt();

//             int[] numbers = {1, 2, 3, 4, 5};
//             if (index >= 0 && index < numbers.length) {
//                 int number = numbers[index];
//                 System.out.println("Elemen array: " + number);
//             }
//         } catch (ArrayIndexOutOfBoundsException e) {
//             errorMessages.add("Error: Index out of bounds");
//         }

//         try {
//             // Exception 4: NumberFormatException
//             System.out.print("Masukkan sebuah angka: ");
//             String inputNumber = scanner.next();
//             int parsedNumber = Integer.parseInt(inputNumber);
//             System.out.println("Angka yang dimasukkan: " + parsedNumber);
//         } catch (NumberFormatException e) {
//             errorMessages.add("Error: Invalid number format");
//         }

//         try {
//             // Exception 5: IllegalArgumentException
//             System.out.print("Masukkan usia: ");
//             int age = scanner.nextInt();
//             if (age >= 0) {
//                 System.out.println("Usia: " + age);
//             } else {
//                 throw new IllegalArgumentException("Usia tidak boleh negatif!");
//             }
//         } catch (IllegalArgumentException e) {
//             errorMessages.add("Error: " + e.getMessage());
//         }

//         scanner.close();

//         // Menampilkan semua pesan kesalahan
//         System.out.println("\nPesan Kesalahan:");
//         if (errorMessages.isEmpty()) {
//             System.out.println("Tidak ada kesalahan.");
//         } else {
//             for (String errorMessage : errorMessages) {
//                 System.out.println(errorMessage);
//             }
//         }
//     }
// }


