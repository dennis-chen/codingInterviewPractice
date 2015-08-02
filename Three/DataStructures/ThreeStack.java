package DataStructures;

public class ThreeStack{
    private Object[] stackHolder;
    private int stackSize;

    public ThreeStack(int stackHolderSize){
        assert stackHolderSize % 3 == 0 && stackHolderSize > 0;
        this.stackHolder = new Object[stackHolderSize];
        this.stackSize = stackHolderSize/3;
    }

    public void push(int stackNum, Object item){
        assert -1 < stackNum && stackNum < 3;
        int stackBottom = stackNum * this.stackSize;
        int stackTop = stackBottom + this.stackSize - 1;
        int i = stackBottom;
        while(stackHolder[i] != null && i <= stackTop){
            i++;
        }
        if(i > stackTop){
            return; //no space left!
        }
        this.stackHolder[i] = item;
        return;
    }

    public Object pop(int stackNum){
        assert -1 < stackNum && stackNum < 3;
        int stackBottom = stackNum * this.stackSize;
        int stackTop = stackBottom + this.stackSize - 1;
        int i = stackTop;
        while(stackHolder[i] == null && i >= stackBottom){
            i--;
        }
        if(i < stackBottom){
            return null; //no space left!
        }
        Object res = stackHolder[i];
        stackHolder[i] = null;
        return res;
    }

    public String toString(){
        String res = "";
        for (int i = 0; i < this.stackHolder.length - 1; i++){
            if(this.stackHolder[i] == null){
                res += "null";
            } else {
                res += this.stackHolder[i].toString();
            }
            res += ", ";
        }
        res += this.stackHolder[this.stackHolder.length - 1];
        return res;
    }
}
