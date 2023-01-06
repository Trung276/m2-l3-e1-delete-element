import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int [] array = new int [size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the element want to delete: ");
        int element = scanner.nextInt();
        System.out.println("new array:");
        for (int i = 0; i < size; i++) {
            if(array[i] == element) continue;
            System.out.print(array[i] + "\t");
        }
    }
}
