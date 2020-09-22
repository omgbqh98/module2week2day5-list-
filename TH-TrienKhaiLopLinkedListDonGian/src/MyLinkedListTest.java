public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList test = new MyLinkedList(10);
        test.addFirst(14);
        test.addFirst(15);
        test.addFirst(17);

        test.add(2, 1);
        test.add(3, 5);
        test.printList();
    }
}
