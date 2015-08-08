package DataStructures;

public class MinStack extends Stack{
    private Stack min;

    public MinStack(){
        super();
        this.min = new Stack();
    }

    public void push(Integer item){
        if(this.min.peek() == null ||
            item < (Integer)this.min.peek()){
            this.min.push(item);
        }
        super.push(item);
    }

    public void push(Object item){
        this.push((Integer)item);
    }

    public Integer pop(){
        if(this.min.peek() == null){
            return null;
        }
        if((Integer)this.peek() ==
            (Integer)this.min.peek()){
            this.min.pop();
        }
        return (Integer)(super.pop());
    }

    public Integer min(){
        if(this.min.peek() == null){
            return null;
        }
        return (Integer)this.min.peek();
    }
}
