class Three{

    public static void main(String[] args){
        Three main = new Three();
        main.start();
    }

    public void start(){
        String s1 = "abcd";
        String s2 = "acbd";
        boolean isPerm = isPerm(s1,s2);
        System.out.println(isPerm);
    }

    public boolean isPerm(String s1, String s2){
        int[] s1count = getCharCount(s1);
        int[] s2count = getCharCount(s2);
        for(int i = 0; i < s1count.length; i++){
            if(s1count[i] != s2count[i]){
                return false;
            }
        }
        return true;
    }

    public int[] getCharCount(String s){
        int[] charCount = new int[128];
        for(char ch: s.toCharArray()){
            charCount[(int)ch]++;
        }
        return charCount;
    }

}
