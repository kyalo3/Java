public class ArrayDataStructure {
    private int[] array;
    private int size;

    // Constructor to initialize the array with a given size
    public ArrayDataStructure(int size) {
        this.size = size;
        array = new int[size];
    }

    // Method to traverse and print all elements of the array
    public void traverse() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Method to update the value of an array element at a given index
    public void update(int index, int value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        ArrayDataStructure ads = new ArrayDataStructure(5);

        // Initializing the array with some values
        ads.update(0, 10);
        ads.update(1, 20);
        ads.update(2, 30);
        ads.update(3, 40);
        ads.update(4, 50);

        // Traversing the array
        System.out.println("Array elements:");
        ads.traverse();

        // Updating an element
        ads.update(2, 100);
        System.out.println("Array elements after update:");
        ads.traverse();
    }
}