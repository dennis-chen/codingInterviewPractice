import java.util.HashMap;
import MyDataStructures.Node;
import MyDataStructures.MyLinkedList;

class Three{

    public static void main(String[] args){
        Three main = new Three();
        main.start();
    }

    public void start(){
        ThreeLinkedList<String> test = getTestlist();
        System.out.println(test);
        Node n1 = test.GetKthToLast(3);
        this.deleteNode(n1);
        System.out.println(test);
    }

    public void deleteNode(Node n){
        while(n.next.next != null){
            n.data = n.next.data;
            n = n.next;
        }
        n.data = n.next.data;
        n.next = null;
    }

    public ThreeLinkedList<String> getTestlist(){
        ThreeLinkedList<String> test = new ThreeLinkedList<String>("hello");
        test.append("hello");
        test.append("a");
        test.append("a");
        test.append("a");
        test.append("a");
        test.append("b");
        test.append("c");
        test.append("d");
        test.append("hello");
        return test;
    }

    public class ThreeLinkedList<T> extends MyLinkedList{

        public ThreeLinkedList(T data){
            super(data);
        }

        public Node GetKthToLast(int k){
            assert k <= this.Count();
            Node n = this.header;
            for(int nodesVisited = 1; nodesVisited < k; nodesVisited++){
                n = n.next;
            }
            Node sweeper = this.header;
            while(n.next != null){
                n = n.next;
                sweeper = sweeper.next;
            }
            return sweeper;
        }
    }

}
