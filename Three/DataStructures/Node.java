package DataStructures;

public class Node{
    public Object data;
    public Node next;

    public Node(Object data){
        this.data = data;
    }

    public String toString(){
        return data.toString();
    }
}
