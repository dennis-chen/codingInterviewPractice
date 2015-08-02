import DataStructures.ThreeStackDynamic;
import DataStructures.ThreeStack;

class One{

    public static void main(String[] args){
        One main = new One();
        main.start();
    }

    public void start(){
        //testRigidStack();
        testDynamicStack();
    }

    public void testDynamicStack(){
        int stackSize = 9;
        ThreeStackDynamic t = new ThreeStackDynamic(stackSize);
        System.out.println(t);
        t.push(0, "ayyyy");
        t.push(1, "b");
        t.push(2, "c");
        System.out.println(t);
        Object test = t.pop(0);
        System.out.println(test);
        t.push(0, "new ayyy");
        System.out.println(t);
    }

    public void testRigidStack(){
        int threeStackArrayLength = 9;
        ThreeStack t = new ThreeStack(threeStackArrayLength);
        System.out.println(t);
        t.push(0, "hello");
        t.push(0, "hello1");
        t.push(0, "hello2");
        System.out.println(t);
        System.out.println(t.pop(0));
        System.out.println(t);
    }

}
