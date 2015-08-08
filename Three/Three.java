import DataStructures.SetOfStacks;

class Three{

    public static void main(String[] args){
        Three main = new Three();
        main.start();
    }

    public void start(){
        SetOfStacks s = new SetOfStacks();
        for(int i = 0; i < 20; i++){
            s.push(3);
        }
        System.out.println(s);
        for(int i = 0; i < 19; i++){
            s.pop();
        }
        System.out.println(s);
    }

}
