public class linked_list {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // create a new linked list
        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("Initial linked list: ");
        list.traverse();
    }
}