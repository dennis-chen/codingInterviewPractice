import DataStructures.MinStack;

class Two{

    public static void main(String[] args){
        Two main = new Two();
        main.start();
    }

    public void start(){
        MinStack m = new MinStack();
        m.push(5);
        System.out.println(m.min());
        m.push(4);
        System.out.println(m.min());
        m.push(3);
        m.push(3);
        m.push(3);
        System.out.println(m.min());
        m.push(2);
        System.out.println(m.min());
        m.pop();
        System.out.println(m.min());
        m.pop();
        m.pop();
        m.pop();
        m.pop();
        m.pop();
        System.out.println(m);
    }

}
