import java.util.Scanner;

public class ExceptionIllegalArgument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Program menghitung luas persegi panjang");
            System.out.print("Masukkan panjang: ");
            int length = scanner.nextInt();
            System.out.print("Masukkan lebar: ");
            int width = scanner.nextInt();
            if (length < 0 || width < 0) {
                throw new IllegalArgumentException("Input tidak boleh negatif!");
            }
            int area = length * width;
            System.out.println("Luas persegi panjang: " + area);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
