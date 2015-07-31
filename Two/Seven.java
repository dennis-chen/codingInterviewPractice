import java.util.HashSet;
import java.util.Random;
import MyDataStructures.Node;
import MyDataStructures.MyLinkedList;

class Seven{

    public static void main(String[] args){
        Seven main = new Seven();
        main.start();
    }

    public void start(){
        MyLinkedList<String> palindrome = getPalindrome(8);
        MyLinkedList<String> rand = getRandom(3);
        System.out.println(palindrome);
        System.out.println(isPalindrome(palindrome));
        System.out.println(rand);
        System.out.println(isPalindrome(rand));
    }

    public boolean isPalindrome(MyLinkedList l)
    {
        MyLinkedList reverse = getReverse(l);
        return isEqual(l, reverse);
    }

    public MyLinkedList getReverse(MyLinkedList l){
        Node n = l.header;
        Node reverseHeader = null;
        while(n != null){
            if(reverseHeader == null){
                reverseHeader = new Node(n.data);
            } else {
                Node newHeader = new Node(n.data);
                newHeader.next = reverseHeader;
                reverseHeader = newHeader;
            }
            n = n.next;
        }
        return new MyLinkedList(reverseHeader);
    }

    public boolean isEqual(MyLinkedList l1, MyLinkedList l2){
        Node n1 = l1.header;
        Node n2 = l2.header;
        while(n1.next != null && n2.next != null){
            if(!n1.data.equals(n2.data)){
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1.next == null &&
            n2.next == null;
    }

    public MyLinkedList<String> getRandom(int length){
        assert length > 0;
        Random r = new Random();
        MyLinkedList<String> rand = new MyLinkedList<String>(
                "" + getRandomChar(r));
        for(int i = 1; i < length; i++){
            rand.append("" + getRandomChar(r));
        }
        return rand;
    }

    public MyLinkedList<String> getPalindrome(int length){
        assert length > 0;
        Random r = new Random();
        String palindromeString;
        if(length % 2 == 0){
            palindromeString = "";
        } else {
            palindromeString = "" + getRandomChar(r);
        }
        for(int i = 0; i < length / 2; i++){
            char randomChar = getRandomChar(r);
            palindromeString = randomChar + palindromeString + randomChar;
        }
        MyLinkedList<String> palindrome = new MyLinkedList(
                new Node(palindromeString.substring(0,1))
        );
        for(int i = 1 ; i < palindromeString.length(); i++){
            palindrome.append(
                    new Node(palindromeString.substring(i,i+1))
            );
        }
        return palindrome;
    }

    public char getRandomChar(Random gen){
        return (char)(gen.nextInt(26) + 'a');
    }

}
