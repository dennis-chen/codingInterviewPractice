import java.util.Arrays;

class Eight{

    public static void main(String[] args){
        Eight main = new Eight();
        main.start();
    }

    public void start(){
        String s1 = "watterbottle";
        String s2 = "erbottlewatt";
        boolean isRotation = isRotation(s1,s2);
        System.out.println(isRotation); 
    }

    public boolean isRotation(String s1, String s2){
        return isSubstring(s1+s1, s2) && s1.length() == s2.length();
    }

    public boolean isSubstring(String bigger, String smaller){
        return bigger.contains(smaller);
    }

}
