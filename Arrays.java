/**
 * An array of size 12 to store integer values.
 * The user is prompted to enter 12 different values using a while loop.
 * Finally, a for loop is used to display all the elements of the array.
 */
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        int[] array = new int[12];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 12 integer values:");

        int count = 0;
        while (count < 12) {
            System.out.print("Value " + (count + 1) + ": ");
            array[count] = scanner.nextInt();
            count++;
        }

        System.out.println("Array elements:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
