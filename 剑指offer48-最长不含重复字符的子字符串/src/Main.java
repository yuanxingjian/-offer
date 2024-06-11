import java.util.HashSet;

public class Main {
    static HashSet<Character> hashSet;//Charater可以进行比较

    public static void main(String[] args) {
        String s = "abcabcbb";
//        Character c='a';
//        Character b='a';
//        System.out.println(c==b);
        System.out.println(fun(s));
    }

    private static int fun(String s) {
        int max=0;
        char[] ch = s.toCharArray();
        int n = ch.length;
        for (int i = 0; i <n ; i++) {
            int j = i;
            int count=0;
            hashSet=new HashSet<>();
            while (j<n){
                if(hashSet.contains(ch[j])){
                    break;
                }else {
                    hashSet.add(ch[j]);
                    j++;
                    count++;
                }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
