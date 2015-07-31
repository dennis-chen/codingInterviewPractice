import java.util.HashSet;
import java.util.Random;
import MyDataStructures.Node;
import MyDataStructures.MyLinkedList;

class Six{

    public static void main(String[] args){
        Six main = new Six();
        main.start();
    }

    public void start(){
        SixLinkedList<Integer> corruptList = getCircularList(2,1);
        Node corruptNode = getCorruptNode(corruptList);
        System.out.println(corruptNode);
    }

    public Node getCorruptNode(SixLinkedList l){
        HashSet visitedNodes = new HashSet();
        Node n = l.header;
        while(!visitedNodes.contains(n)){
            visitedNodes.add(n);
            n = n.next;
        }
        return n;
    }

    public SixLinkedList<Integer> getCircularList(int length, int loopSize){
        //returns circular list where the node at the beginning of the loop
        //contains the value 0. all other nodes contain the value 1.
        assert length >= loopSize && length > 0 && loopSize > 0;
        SixLinkedList<Integer> circular = new SixLinkedList<Integer>(1);
        Node lastAdded = null;
        Node loopBegin = null;
        for(int i = 1; i < length; i++){
            if(i == length - loopSize){
                loopBegin = new Node(0);
                circular.append(loopBegin);
                lastAdded = loopBegin;
            } else {
                Node newTail = new Node(1);
                circular.append(newTail);
                lastAdded = newTail;
            }
        }
        lastAdded.next = loopBegin;
        return circular;
    }

    public class SixLinkedList<T> extends MyLinkedList{

        public SixLinkedList(T data){
            super(data);
        }

        public SixLinkedList(Node header){
            super(header);
        }

    }

}
