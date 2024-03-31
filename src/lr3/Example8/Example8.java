package lr3.Example8;

public class Example8 {
    private Node head;
    public void createHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void createTail(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data).append(" ");
            current = current.next;
        }
        return result.toString();
    }

    public void addFirst(int data) {
        createHead(data);
    }

    public void addLast(int data) {
        createTail(data);
    }

    public void Insert(int index, int data) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index cannot be negative");
        if (index == 0) {
            createHead(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null)
                throw new IndexOutOfBoundsException("Index out of bounds");
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void remove(int index) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index cannot be negative");
        if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null || current.next == null)
                throw new IndexOutOfBoundsException("Index out of bounds");
            current.next = current.next.next;
        }
    }

    // Методы с использованием рекурсии

    public void createHeadRec(int data) {
        head = createHeadRec(head, data);
    }

    private Node createHeadRec(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        current.next = createHeadRec(current.next, data);
        return current;
    }

    public void createTailRec(int data) {
        head = createTailRec(head, data);
    }

    private Node createTailRec(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        current.next = createTailRec(current.next, data);
        return current;
    }

    public String toStringRec() {
        return toStringRec(head);
    }

    private String toStringRec(Node current) {
        if (current == null) {
            return "";
        }
        return current.data + " " + toStringRec(current.next);
    }
}
