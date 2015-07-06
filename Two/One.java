import java.util.HashMap;
import MyDataStructures.Node;
import MyDataStructures.MyLinkedList;

class One{

    public static void main(String[] args){
        One main = new One();
        main.start();
    }

    public void start(){
        OneLinkedList<String> test = getTestlist();
        System.out.println(test);
        test.removeDuplicates();
        System.out.println(test);
        OneLinkedList<String> test1 = getTestlist();
        System.out.println(test1);
        test1.removeDuplicatesSlow();
        System.out.println(test1);
    }

    public OneLinkedList<String> getTestlist(){
        OneLinkedList<String> test = new OneLinkedList<String>("hello");
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

    public class OneLinkedList<T> extends MyLinkedList{

        public OneLinkedList(T data){
            super(data);
        }

        public void removeDuplicates(){
            Node n = this.header;
            HashMap<Object,Boolean> valSeen = new HashMap<Object,Boolean>();
            valSeen.put(n.data, true);
            Node prevNode = n;
            while(n.next != null){
                n = n.next;
                if(valSeen.get(n.data) != null){
                    prevNode.next = n.next;
                } else {
                    valSeen.put(n.data, true);
                    prevNode = n;
                }
            }
        }

        public void removeDuplicatesSlow(){
            Node n = this.header;
            while(n.next != null){
                Node prevNode = n;
                Node runner = n.next;
                while(runner.next != null){
                    if(runner.data == n.data){
                        prevNode.next = runner.next;
                    } else {
                        prevNode = runner;
                    }
                    runner = runner.next;
                }
                n = n.next;
            }
        }
    }

}
