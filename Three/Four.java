import TowersOfHanoi.TowersOfHanoi;
import TowersOfHanoi.HanoiSolver;

class Four{

    public static void main(String[] args){
        Four main = new Four();
        main.start();
    }

    public void start(){
        int towerSize = 5;
        TowersOfHanoi t = new TowersOfHanoi(towerSize);
        HanoiSolver.solve(t, towerSize);
    }

}
