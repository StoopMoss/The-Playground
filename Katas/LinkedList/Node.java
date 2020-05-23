public class Node {
    
    /// Properties 
    private int value;
    public int getValue() {
        return this.value;
    }
    public void setValue(int v) {
        this.value = v;
    }

    private Node next;
    public Node getNext() {
        return this.next;
    }
    public void setNext(Node n) {
        this.next = n;
    }

    /// Constructors 
    public Node(int v) {
        this.value = v;
        this.next = null;
    }

    public Node(int v, Node _next) {
        this.value = v;
        this.next = _next;
    }

    public Node(){
        this.value = 0;
        this.next = null;
    }

}