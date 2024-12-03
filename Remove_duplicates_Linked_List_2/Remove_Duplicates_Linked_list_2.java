import java.util.HashMap;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void removeDuplicates() {
        if (head == null) return;

        HashMap<Integer, Integer> frequency = new HashMap<>();        Node current = head;
        while (current != null) {
            frequency.put(current.data, frequency.getOrDefault(current.data, 0) + 1);
            current = current.next;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        current = head;

        while (current != null) {
            if (frequency.get(current.data) > 1) {
                prev.next = current.next;
            }
            else {
                prev = current;
            }
            current = current.next;

            head = dummy.next;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.data + "->");
            current = current.next;
        }
        System.out.println("None");

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.append(10);
        ll.append(30);
        ll.append(20);

        System.out.println("Original Linked List");
        ll.display();

        ll.removeDuplicates();

        System.out.println("List after Removing Duplicates:");
        ll.display();
    }
}
