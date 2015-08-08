package DataStructures;

public class Stack{
    public Node Top = null;

    public Stack(){
    }

    public void push(Node n){
        n.next = this.Top;
        this.Top = n;
    }

    public void push(Object item){
        Node newTop = new Node(item);
        newTop.next = this.Top;
        this.Top = newTop;
    }

    public Object peek(){
        if(this.Top == null){
            return null;
        }
        return this.Top.data;
    }

    public Object pop(){
        Node poppedItem = this.Top;
        this.Top = this.Top.next;
        return poppedItem.data;
    }

    public String toString(){
        String s = "";
        Node n = this.Top;
        if(n == null){
            return "Empty stack!";
        }
        while(n.next != null){
            s += n.toString();
            s += ", ";
            n = n.next;
        }
        s += n.toString();
        return s;
    }
}
