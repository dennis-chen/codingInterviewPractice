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
        //System.out.println(num1);
        //System.out.println(num2);
        //FiveLinkedList backwardSum = addBackwards(num1, num2);
        //System.out.println(backwardSum);
        FiveLinkedList ForwardSum = addForwards(num1, num2);
        System.out.println(ForwardSum);
    }


    public FiveLinkedList addForwards(FiveLinkedList<Integer> l1, FiveLinkedList<Integer> l2){
        PadList(l1, l2);
        Node solutionHead = new Node(0);
        int carry = addForwardsHelper(l1.header, l2.header, solutionHead);
        solutionHead.data = carry;
        if(solutionHead.data == 0){
            solutionHead = solutionHead.next;
        }
        return new FiveLinkedList(solutionHead);
    }

    public int addForwardsHelper(Node n1, Node n2, Node prev){
        if(n1.next == null && n2.next == null){
            int sum = (int)n1.data + (int)n2.data;
            if(sum >= 10){
                prev.next = new Node(sum % 10);
                return 1;
            } else {
                prev.next = new Node(sum);
                return 0;
            }
        } else {
            prev.next = new Node(0);
            int carry = addForwardsHelper(n1.next, n2.next, prev.next);
            int sum = (int)n1.data + (int)n2.data + carry;
            if(sum >= 10){
                prev.next.data = sum % 10;
                return 1;
            } else {
                prev.next.data = sum;
                return 0;
            }
        }
    }

    public FiveLinkedList addBackwards(FiveLinkedList<Integer> l1, FiveLinkedList<Integer> l2){
        Node solutionHead = new Node(0);
        addBackwardsHelper(l1.header, l2.header, solutionHead);
        if(solutionHead.next != null){
            solutionHead = solutionHead.next;
        }
        return new FiveLinkedList(solutionHead);
    }

    public void addBackwardsHelper(Node h1, Node h2, Node prev){
        if(h1.next == null && h2.next != null){
            h1.next = new Node(0);
        }
        else if(h1.next != null && h2.next == null){
            h2.next = new Node(0);
        }
        int carry = 0;
        if((int)prev.data >= 10){
            carry = 1;
            prev.data = (int)prev.data % 10;
        }
        int sum = (int)h1.data + (int)h2.data + carry;
        Node next = new Node(sum);
        prev.next = next;
        if(h1.next == null && h2.next == null){
            //base case
            if((int)next.data >= 10){
                next.data = (int)next.data % 10;
                next.next = new Node(1);
            }
            return;
        } else {
            addBackwardsHelper(h1.next, h2.next, next);
        }
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
                Node newHead = new Node(0);
                newHead.next = l1.header;
                l1.header = newHead;
                h2 = h2.next;
            } else if(h1.next != null && h2.next == null){
                Node newHead = new Node(0);
                newHead.next = l2.header;
                l2.header = newHead;
                h1 = h1.next;
            } else {
                h1 = h1.next;
                h2 = h2.next;
            }
        }
    }

    public class FiveLinkedList<T> extends MyLinkedList{

        public FiveLinkedList(T data){
            super(data);
        }

        public FiveLinkedList(Node header){
            super(header);
        }

    }

}
