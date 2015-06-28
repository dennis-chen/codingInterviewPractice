import java.util.Arrays;

class Seven{

    public static void main(String[] args){
        Seven main = new Seven();
        main.start();
    }

    public void start(){
        int[][] test = {{1,2,0},
                        {1,1,1}};
        zeroArray(test);
        System.out.println(Arrays.deepToString(test));
    }

    public void zeroArray(int[][] arr){
        int M = arr.length;
        int N = arr[0].length;
        boolean[] zeroRow = new boolean[M];
        boolean[] zeroCol = new boolean[N];
        for(int row = 0; row < M; row++){
            for(int col = 0; col < N; col++){
                if(arr[row][col] == 0){
                    zeroRow[row] = true;
                    zeroCol[col] = true;
                }
            }
        }
        for(int row = 0; row < M; row++){
            if(zeroRow[row]){
                zeroRow(arr, row);
            }
        }
        for(int col = 0; col < N; col++){
            if(zeroCol[col]){
                zeroCol(arr, col);
            }
        }
    }

    public void zeroRow(int[][] arr, int row){
        for(int col = 0; col < arr[0].length; col++){
            arr[row][col] = 0;
        }
    }

    public void zeroCol(int[][] arr, int col){
        for(int row = 0; row < arr.length; row++){
            arr[row][col] = 0;
        }
    }

}
