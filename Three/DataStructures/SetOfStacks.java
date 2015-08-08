package DataStructures;
import java.util.ArrayList;

public class SetOfStacks{
    private ArrayList<Stack> stacks;
    private static final int STACK_HEIGHT_LIMIT = 5;

    public SetOfStacks(){
        this.stacks = new ArrayList<Stack>();
    }

    public Stack getLastStack(){
        if(this.stacks.size() == 0){
            return null;
        }
        return this.stacks.get(this.stacks.size() - 1);
    }

    public void removeLastStack(){
        this.stacks.remove(this.stacks.size() - 1);
    }

    public void push(Object item){
        Stack lastStack = getLastStack();
        if(lastStack == null ||
            lastStack.size() >= SetOfStacks.STACK_HEIGHT_LIMIT){
            this.stacks.add(new Stack());
        }
        getLastStack().push(item);
    }

    public Object pop(){
        Stack lastStack = getLastStack();
        if(lastStack == null){
            return null;
        }
        Object item = lastStack.pop();
        if(lastStack.size() == 0){
            removeLastStack();
        }
        return item;
    }

    public String toString(){
        String res = "";
        for(Stack s: this.stacks){
            res += s.toString();
            res += "\n";
        }
        return res;
    }
}

