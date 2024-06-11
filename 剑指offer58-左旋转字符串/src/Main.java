public class Main {
    public static void main(String[] args) {
        //左旋转字符串
        System.out.println(fun("abcdefg",2));
    }

    private static String fun(String s, int i) {
        String ret="";
        ret=ret+s.substring(2)+s.substring(0,2);
        return ret;
    }
}
