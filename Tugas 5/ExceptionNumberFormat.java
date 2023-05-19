import java.util.Scanner;

public class ExceptionNumberFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan sebuah angka: ");
            String inputNumber = scanner.next();
            int parsedNumber = Integer.parseInt(inputNumber);
            System.out.println("Angka yang dimasukkan: " + parsedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error: Anda memasukkan string bukan angka!");
            System.out.println("Error: " + e.getMessage());
        }
    }
}
