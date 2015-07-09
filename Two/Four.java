import java.util.HashMap;
import MyDataStructures.Node;
import MyDataStructures.MyLinkedList;

class Four{

    public static void main(String[] args){
        Four main = new Four();
        main.start();
    }

    public void start(){
        FourLinkedList<Integer> test = getTestlist();
        System.out.println(test);
        test.Partition(6);
        System.out.println(test);
    }

    public FourLinkedList<Integer> getTestlist(){
        FourLinkedList<Integer> test = new FourLinkedList<Integer>(6);
        test.append(5);
        test.append(4);
        test.append(3);
        test.append(2);
        test.append(1);
        return test;
    }

    public class FourLinkedList<T> extends MyLinkedList{

        public FourLinkedList(T data){
            super(data);
        }

        public void Partition(int x){
            if(this.header.next == null){
                return;
            }
            Node newHead = this.header;
            Node newTail = this.header;
            Node n = this.header;
            while(n != null){
                Node newN = n.next;
                if((int)n.data < x){
                    n.next = newHead;
                    newHead = n;
                } else {
                    newTail.next = n;
                    newTail = n;
                }
                n = newN;
            }
            newTail.next = null;
            this.header = newHead;
        }
    }

}
