package itheima.day02;

public class PrintStr {
    public static void main(String[] args) {
        printS("abcdefg",0);
    }

    private static void printS(String s,int idx){
        if (idx==s.length()){
            return;
        }
        printS(s,idx+1);
        System.out.println(s.charAt(idx));
    }
}
