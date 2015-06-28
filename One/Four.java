class Four{

    public static void main(String[] args){
        Four main = new Four();
        main.start();
    }

    public void start(){
        char[] test = "Mr John Smith    ".toCharArray();
        replaceSpace(test, 13);
        System.out.println(test);

        char[] test1 = "   ".toCharArray();
        replaceSpace(test1, 1);
        System.out.println(test1);
    }

    public void replaceSpace(char[] a, int len){
        for(int i = 0; i < len; i++){
            if(a[i] == ' '){
                for(int j = a.length - 1; j > i+1; j--){
                    a[j] = a[j-2];
                }
                a[i] = '%';
                a[i+1] = '2';
                a[i+2] = '0';
            }
        }
    }


}
