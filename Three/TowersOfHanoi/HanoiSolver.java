package TowersOfHanoi;

public class HanoiSolver{

    public static void solve(TowersOfHanoi t, int towerSize){
        int startTowerIndex = 0;
        int endTowerIndex = 2;
        int bufferTowerIndex = 1;
        System.out.println("Beginning configuration:");
        System.out.println(t);
        t.moveTopNDisks(startTowerIndex, endTowerIndex, bufferTowerIndex, towerSize);
        System.out.println("Ending configuration:");
        System.out.println(t);
    }

}
