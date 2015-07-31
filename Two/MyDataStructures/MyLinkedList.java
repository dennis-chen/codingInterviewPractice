package MyDataStructures;

public class MyLinkedList<T>{
    public Node header = null;
    protected int count;

    public MyLinkedList(T data){
        this.header = new Node<T>(data);
        this.count = 1;
    }

    public MyLinkedList(Node header){
        this.header = header;
        Node n = header;
        this.count = 1;
        while(n.next != null){
            this.count++;
            n = n.next;
        }
    }

    public void append(T data){
        this.header.append(data);
        this.count++;
    }

    public void append(Node<T> node){
        this.header.append(node);
        this.count++;
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
                this.count--;
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

    public int Count(){
        return this.count;
    }
}
