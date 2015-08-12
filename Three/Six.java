import DataStructures.Stack;

class Six{

    public static void main(String[] args){
        Six main = new Six();
        main.start();
    }

    public void start(){
        Stack s = new Stack();
        for(int i = 10; i > 0; i--){
            s.push(i);
        }
        System.out.println(s);
        sortStack(s);
        System.out.println(s);
    }

    public void sortStack(Stack s){
        Stack buffer = new Stack();
        while(!s.isEmpty()){
            int valToInsert = (Integer)s.pop();
            int valsPoppedFromBuffer = 0;
            while(!buffer.isEmpty() && 
                    (Integer)buffer.peek() < valToInsert){
                s.push(buffer.pop());
                valsPoppedFromBuffer++;
            }
            buffer.push(valToInsert);
            for(int i = 0; i < valsPoppedFromBuffer; i++){
                buffer.push(s.pop());
            }
        }
        while(!s.isEmpty()){
            s.pop();
        }
        while(!buffer.isEmpty()){
            s.push(buffer.pop());
        }
    }

}
