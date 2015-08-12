import DataStructures.MyQueue;

class Five{

    public static void main(String[] args){
        Five main = new Five();
        main.start();
    }

    public void start(){
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }

}
