import java.util.Scanner;

public class ArrayDataStructure {
    private int[] array;
    private int size;

    // Constructor to initialize the array with a given size
    public ArrayDataStructure(int size) {
        this.size = size;
        array = new int[size]; // Change to Object[] if you want to use different data types
    }

    // Method to traverse and print all elements of the array
    public void traverse() {
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Method to update the value of an array element at a given index
    public void update(int index, int value) {
        if (index >= 0 && index < size) {
            array[index] = value;
            System.out.println("Updated index " + index + " to value " + value);
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Example: Create an array of size 5
        ArrayDataStructure ads = new ArrayDataStructure(5);
        
        // Initializing the array with some values
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            ads.update(i, scanner.nextInt());
        }
        
        // Traversing the array
        ads.traverse();

        // Updating an element
        System.out.print("Enter index to update (0-4): ");
        int index = scanner.nextInt();
        System.out.print("Enter new value: ");
        int value = scanner.nextInt();
        ads.update(index, value);
        
        // Traversing the array after update
        ads.traverse();

        scanner.close();
    }
}
