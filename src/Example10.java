import org.w3c.dom.Node;

public class TraverseDemo {
    public static void main(String[] args) {
// Build: head -> 17 -> 92 -> 63 -> 45 -> null
       Node<Integer> head = new Node<>(17);
        Node<Integer> n2 = new Node<>(92);
        Node n3 = new Node<>(63);
        Node<Integer> n4 = new Node<>(45);
        head.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4); // n4.next stays null = end of list
        Node<Integer> current = head;
        while (current != null) {
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }
}
