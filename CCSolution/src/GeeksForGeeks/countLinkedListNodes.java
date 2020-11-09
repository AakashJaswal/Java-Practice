package GeeksForGeeks;

class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> next;

    Node(T data) {
        this.data = data;
        setNext(null);
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }
}

class LinkedList<T extends Comparable<T>> {
    private Node<T> head = null;

    void addNode(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(new Node<T>(data));
        }
    }

    int printList() {
        int count = 0;
        if (head == null) {
            System.out.println("Empty LinkedList");
            return count ;
        } else {
            Node<T> curr = head;
            while (curr != null) {
                count++;
                System.out.print(curr.getData().toString() + " ");
                curr = curr.getNext();
            }
            System.out.println();
            return count;
        }
    }


}

public class countLinkedListNodes {
    public static void main(String[] args) {
        LinkedList<Integer> test = new LinkedList<Integer>();
        System.out.println(test.printList());
        test.addNode(2);
        test.addNode(3);
        test.addNode(4);
        System.out.println(test.printList());
    }
}
