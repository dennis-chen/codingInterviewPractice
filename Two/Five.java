import java.util.HashMap;
import java.util.Random;
import MyDataStructures.Node;
import MyDataStructures.MyLinkedList;

class Five{

    public static void main(String[] args){
        Five main = new Five();
        main.start();
    }

    public void start(){
        FiveLinkedList<Integer> num1 = getRandomTestlist();
        FiveLinkedList<Integer> num2 = getRandomTestlist();
        PadList(num1,num2);
    }

    public FiveLinkedList<Integer> getRandomTestlist(){
        Random generator = new Random();
        int listLength = generator.nextInt(4);
        FiveLinkedList<Integer> test = new FiveLinkedList<Integer>(generator.nextInt(10));
        for(int i = 0; i < listLength; i++){
            test.append(generator.nextInt(10));
        }
        return test;
    }

    public void PadList(FiveLinkedList<Integer> l1, FiveLinkedList<Integer> l2){
        Node h1 = l1.header;
        Node h2 = l2.header;
        while(h1 != null || h2 != null){
            if(h1.next == null && h2.next != null){
                h1.next = new Node(0);
            } else if(h1.next != null && h2.next == null){
                h2.next = new Node(0);
            }
            h1 = h1.next;
            h2 = h2.next;
        }
    }

    public class FiveLinkedList<T> extends MyLinkedList{

        public FiveLinkedList(T data){
            super(data);
        }
    }

}
