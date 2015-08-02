package DataStructures;

public class ThreeStackDynamic{
    private Object[] stackHolder;
    private Object[] stackIndices;
    private int stackSize;
    private int firstEmpty;

    public ThreeStackDynamic(int stackHolderSize){
        assert stackHolderSize > 0;
        this.stackHolder = new Object[stackHolderSize];
        this.stackIndices = new Object[stackHolderSize];
        this.stackSize = stackHolderSize;
    }

    public void push(int stackNum, Object item){
        if(this.firstEmpty >= this.stackSize){
            return;
        }
        stackHolder[this.firstEmpty] = item;
        stackIndices[this.firstEmpty] = stackNum;
        firstEmpty ++;
    }

    public Object pop(int stackNum){
        int i = this.stackSize - 1;
        while(stackIndices[i] != stackNum && i >= 0){
            i--;
        }
        if(i == -1){
            return null;
        }
        Object elemToPop = stackHolder[i];
        for(int j = i; j < this.stackSize - 1; j++){
            stackHolder[j] = stackHolder[j+1];
            stackIndices[j] = stackIndices[j+1];
        }
        stackHolder[this.stackSize - 1] = null;
        stackIndices[this.stackSize - 1] = null;
        this.firstEmpty--;
        return elemToPop;
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
        if(this.stackHolder[this.stackHolder.length - 1] == null){
            res += "null";
        } else {
            res += this.stackHolder[this.stackHolder.length - 1];
        }
        return res;
    }
}
