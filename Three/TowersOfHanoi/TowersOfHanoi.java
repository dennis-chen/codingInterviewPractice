package TowersOfHanoi;

public class TowersOfHanoi{
    
    private static int NUM_TOWERS = 3;
    private Tower[] towers;
    private int numDisks;

    public TowersOfHanoi(int numDisks){
        this.numDisks = numDisks;
        this.towers = new Tower[TowersOfHanoi.NUM_TOWERS];
        for(int i = 0; i < 3; i++){
            this.towers[i] = new Tower();
        }
        for(int i = numDisks; i > 0; i--){
            this.towers[0].push(new Disk(i));
        }
    }

    public void moveTopDisk(int begin, int end){
        assert -1 < begin && begin < 3;
        assert -1 < end && end < 3;
        Disk d = this.towers[begin].pop();
        if(d == null){
            return; //nothing to actually move
        }
        this.towers[end].push(d);
    }

    public void moveTopNDisks(int begin, int end, int buffer, int n){
        if(n == 1){
            moveTopDisk(begin, end);
        } else {
            moveTopNDisks(begin, buffer, end, n - 1);
            moveTopDisk(begin, end);
            moveTopNDisks(buffer, end, begin, n - 1);
        }
    }

    public String toString(){
        String toPrint = "";
        for(int i = 0; i < 3; i++){
            toPrint += "Tower " + i + ": ";
            toPrint += this.towers[i].toString();
            toPrint += "\n";
        }
        return toPrint;
    }

}
