package TowersOfHanoi;

public class Tower{

    private Stack diskHolder;

    public Tower(){
        this.diskHolder = new Stack();
    }

    public void push(Disk newDisk){
        assert newDisk.size < ((Disk)this.diskHolder.peek()).size;
        this.diskHolder.push(newDisk);
    }

    public Disk pop(){
        Object res = this.diskHolder.pop();
        if(res == null){
            return null;
        }
        return (Disk)res;
    }

    public String toString(){
        return this.diskHolder.toString();
    }

}
