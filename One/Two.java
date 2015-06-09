import java.util.HashMap;

class Two{

    public static void main(String[] args){
        Two main = new Two();
        main.start();
    }

    public void start(){
        char[] stringToReverse = "abcdefgh.".toCharArray();
        System.out.println(stringToReverse);
        reverse(stringToReverse);
        System.out.println(stringToReverse);
    }

    public void reverse(char[] c){
        int i = 0;
        int j = c.length - 2;
        while (i < j){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
    }

}
