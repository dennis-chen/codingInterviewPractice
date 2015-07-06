import java.util.HashMap;
import MyDataStructures.Node;
import MyDataStructures.MyLinkedList;

class Two{

    public static void main(String[] args){
        Two main = new Two();
        main.start();
    }

    public void start(){
        TwoLinkedList<String> test = getTestlist();
        System.out.println(test);
        Node n = test.GetKthToLast(1);
        System.out.println(n);
        Node n1 = test.GetKthToLast(2);
        System.out.println(n1);
    }

    public TwoLinkedList<String> getTestlist(){
        TwoLinkedList<String> test = new TwoLinkedList<String>("hello");
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

    public class TwoLinkedList<T> extends MyLinkedList{

        public TwoLinkedList(T data){
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
