import java.util.Scanner;

public class ExceptionArrayIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Program mengambil data array");
            System.out.println("Array yang tersedia: [1, 2, 3, 4]");
            System.out.print("Masukkan indeks array: ");
            int index = scanner.nextInt();

            int[] array = { 1, 2, 3, 4 };
            int data = array[index];
            System.out.printf("Data pada indeks ke-%d adalah %d\n", index, data);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indeks array yang dimasukkan tidak sesuai!");
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
