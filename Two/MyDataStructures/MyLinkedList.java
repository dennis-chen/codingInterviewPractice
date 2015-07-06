package MyDataStructures;

public class MyLinkedList<T>{
    protected Node header = null;

    public MyLinkedList(T data){
        this.header = new Node<T>(data);
    }

    public void append(T data){
        this.header.append(data);
    }

    public void delete(T data){
        if(this.header.data == data){
            this.header = this.header.next;
            return;
        }
        Node n = this.header;
        while(n.next != null){
            if(n.next.data == data){
                n.next = n.next.next;
                return;
            }
            n = n.next;
        }
    }

    public String toString(){
        Node n = this.header;
        String values = "";
        while (n.next != null){
            values += n.data.toString();
            values += ", ";
            n = n.next;
        }
        values += n.data.toString();
        return values;
    }
}
