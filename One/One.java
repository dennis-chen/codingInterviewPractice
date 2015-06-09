import java.util.HashMap;

class One{

    public static void main(String[] args){
        One main = new One();
        main.start();
    }

    public void start(){
        String noRepeats = "abcdefg";
        String repeats = "aabcdefg";
        boolean result = hasAllUniqueChar(noRepeats);
        boolean resultTwo = hasAllUniqueChar(repeats);
        System.out.println(result);
        System.out.println(resultTwo);
        result = hasAllUniqueChar1(noRepeats);
        resultTwo = hasAllUniqueChar1(repeats);
        System.out.println(result);
        System.out.println(resultTwo);
        result = hasAllUniqueChar2(noRepeats);
        resultTwo = hasAllUniqueChar2(repeats);
        System.out.println(result);
        System.out.println(resultTwo);
    }

    public boolean hasAllUniqueChar(String s){
        for(int i = 0; i < s.length() -1; i++){
            char charToCheck = s.charAt(i);
            for(int j = i+1; j < s.length(); j++){
                if(s.charAt(j) == charToCheck){
                    return false;
                }

            }
        }
        return true;
    }

    public boolean hasAllUniqueChar1(String s){
        boolean[] isCharPresent = new boolean[128];
        for(char ch: s.toCharArray()){
            if(isCharPresent[(int)ch]){
                return false;
            }
            isCharPresent[(int)ch] = true;
        }
        return true;
    }

    public boolean hasAllUniqueChar2(String s){
        HashMap<Character, Boolean> isCharPresent = new HashMap<>();
        for(char ch: s.toCharArray()){
            if(isCharPresent.get(ch) != null){
                return false;
            }
            isCharPresent.put(ch, true);
        }
        return true;
    }
    
}
