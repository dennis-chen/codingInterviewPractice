class Five{

    public static void main(String[] args){
        Five main = new Five();
        main.start();
    }

    public void start(){
        String test = "aabccccaaa";
        String compressed = getCompressed1(test);
        System.out.println(compressed);

        String test1 = "abcdefghijklmn";
        String compressed1 = getCompressed1(test1);
        System.out.println(compressed1);
    }

    public String getCompressed(String s){
        if(s.length() < 2){
            return s;
        }
        String temp = s + ' ';
        String compressed = "";
        int j = 0;
        for(int i = 0; i < temp.length(); i++){
            if(temp.charAt(i) != temp.charAt(j)){
                compressed += temp.charAt(j);
                compressed += Integer.toString(i-j);
                j = i;
            }
        }
        if(compressed.length() > s.length()){
            return s;
        }
        return compressed;
    }

    public String getCompressed1(String s){
        if(s.length() < 2){
            return s;
        }
        int numRepeats = 0;
        char lastUniqueChar = s.charAt(0);
        StringBuffer compressed = new StringBuffer();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == lastUniqueChar){
                numRepeats++;
            } 
            if(s.charAt(i) != lastUniqueChar || i == s.length() -1){
                compressed.append(Character.toString(lastUniqueChar));
                compressed.append(Integer.toString(numRepeats));
                lastUniqueChar = s.charAt(i);
                numRepeats = 1;
            }
        }
        if(compressed.toString().length() > s.length()){
            return s;
        }
        return compressed.toString();
    }

}
