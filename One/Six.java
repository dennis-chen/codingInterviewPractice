import java.util.Arrays;

class Six{

    public static void main(String[] args){
        Six main = new Six();
        main.start();
    }

    public void start(){
        int[][] img = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        int[][] img2 = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        rotateNinety(img, 3);
        rotateNinety(img2, 4);
        System.out.println(Arrays.deepToString(img));
        System.out.println(Arrays.deepToString(img2));
    }

    public void rotateNinety(int[][] img, int n){
        for(int layer = 0; layer < n/2; layer++){
            int start = layer;
            int end = n - layer - 1;
            for(int i = start; i < end; i++){
                System.out.println(layer);
                int top = img[layer][i];
                int left = img[end - i][layer];
                int right = img[i][end];
                int bottom = img[end][end - i];
                
                img[layer][i] = left;
                img[end - i][layer] = bottom;
                img[end][end - i] = right;
                img[i][end] = top;
            }
        }
    }

}
