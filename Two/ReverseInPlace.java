import java.util.HashMap;
import MyDataStructures.Node;
import MyDataStructures.MyLinkedList;

class ReverseInPlace{

    public static void main(String[] args){
        ReverseInPlace main = new ReverseInPlace();
        main.start();
    }

    public void start(){
        ReverseInPlaceLinkedList<String> test = getTestlist();
        System.out.println(test);
        ReverseInPlace(test);
        System.out.println(test);
    }

    public void ReverseInPlace(ReverseInPlaceLinkedList r){
        if(r.header.next == null){
            return;
        }
        reverse(null, r.header, r);
    }

    private void reverse(Node prev, Node n, ReverseInPlaceLinkedList r){
        if(n.next == null){
            n.next = prev;
            r.header = n;
            return;
        }
        reverse(n, n.next, r);
        n.next = prev;
    }

    public ReverseInPlaceLinkedList<String> getTestlist(){
        ReverseInPlaceLinkedList<String> test = new ReverseInPlaceLinkedList<String>("hello");
        test.append("a");
        test.append("b");
        test.append("c");
        test.append("d");
        return test;
    }

    public class ReverseInPlaceLinkedList<T> extends MyLinkedList{

        public ReverseInPlaceLinkedList(T data){
            super(data);
        }
    }

}
