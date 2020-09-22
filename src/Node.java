class Node<E> {
    E element;
    Node<E> next;

    public Node(E e) {
        element = e;
    }

    int size = 0;
    Node<String> head = null;
    Node<String> tail = null;

    Node head1 =new Node<>("chicago");
    Node tail1 = head1;

    public void addFirst(E e) {
        Node newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null)
            tail = head;
    }

    public void addLast(E e) {
        Node newNode = new Node<>(e); // Create a new node for e

        if (tail == null) {
            head = tail = newNode; // The only node in list
        }
        else {
            tail.next = newNode; // Link the new node with the last node
            tail = tail.next; // tail now points to the last node
        }

        size++; // Increase size
    }


    public void add(int index, E e) {
        if (index == 0) addFirst(e); // Insert first
        else if (index >= size) addLast(e); // Insert last
        else { // Insert in the middle
            Node current = head;
            for (int i = 1; i < index; i++)
                current = current.next;
            Node temp = current.next;
            current.next = new Node(e);
            (current.next).next = temp;
            size++;
        }
    }


//    duyet linkedlist:

    //    Node current = head;
//    while(current != null){
//        System.out.println(current.element);
//        current = current.next();
}




