public class MujSpojovySeznam {

    private Node head;
    private Node tail;
    private int size;

    public MujSpojovySeznam() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    public void addToEnd(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    /*
    vrati index od 0, pokud je index vetsi nez size vrati posledni existujici
     */
    public int getIndex(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (temp.next != null) {
                temp = temp.next;
            }
        }
        return temp.value;
    }

    public int deleteFirst() {
        int cislo = head.value;
        head = head.next;
        return  cislo;
    }

    public int deleteLast(){
        Node deleted = head;
        for (int i = 0; i < size - 2; i++) {
            deleted = deleted.next;
        }
        int cislo = deleted.next.value;
        deleted.next = null;
        tail = deleted;
        size--;
        return cislo;
    }

    public int indexOf(int value){
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == value) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public boolean contains(int value){
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String text = "";
        Node curr = head;
        while (curr != null) {
            text += curr.value + " -> ";
            curr = curr.next;
        }
        text += "null";
        return text;
    }

    public int count() {
        return size;
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }


}
