import java.util.Scanner;

public class ExceptionNullPointer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Program menghitung panjang string");
            System.out.print("Masukkan sebuah string (tidak boleh kosong): ");
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                throw new NullPointerException();
            }
            int length = str.length();
            System.out.println("Panjang string: " + length);
        } catch (NullPointerException e) {
            System.out.println("String tidak boleh kosong!");
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// import java.util.Scanner;

// public class ExceptionNullPointer {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         try {
//             // Exception 2: NullPointerException
//             System.out.print("Masukkan sebuah string (tidak boleh kosong): ");
//             String str = scanner.nextLine();
//             if (str != null) {
//                 int length = str.length();
//                 System.out.println("Panjang string: " + length);
//             }
//         } catch (NullPointerException e) {
//             System.out.println("String tidak boleh kosong!");
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }


