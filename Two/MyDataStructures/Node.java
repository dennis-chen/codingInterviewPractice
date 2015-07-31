package MyDataStructures;

public class Node<T>{
    public Node next = null;
    public T data;

    public Node(T data){
        this.data = data;
    }

    public String toString(){
        return data.toString();
    }

    void append(T data){
        Node<T> end = new Node<T>(data);
        Node<T> n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    void append(Node<T> node){
        Node<T> n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = node;
    }
}
