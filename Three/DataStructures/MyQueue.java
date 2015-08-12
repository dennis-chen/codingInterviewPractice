package DataStructures;

public class MyQueue{
    private Stack newItems;
    private Stack oldItems;

    public MyQueue(){
        this.newItems = new Stack();
        this.oldItems = new Stack();
    }

    public void push(Object item){
        this.newItems.push(item);
    }

    public Object pop(){
        if(this.oldItems.peek() == null){
            transferNewToOldStack();
        }
        return this.oldItems.pop();
    }

    private void transferNewToOldStack(){
        Object o = this.newItems.pop();
        while(o != null){
            this.oldItems.push(o);
            o = this.newItems.pop();
        }
    }
}
