import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //第一个只出现一次的字符
        String s="aaccdebff";
        System.out.println(fun(s));
    }

    private static char fun(String s) {
        //HashSet无序、TreeSet 有序
        ArrayList<Character> arrayList=new ArrayList<>();
        char[] ch=s.toCharArray();
        for (char c : ch) {
            arrayList.add(c);
        }
       while (true){
           Character c=arrayList.get(0);//ArrayList的泛型是Character
           arrayList.remove(0);
           if(!arrayList.contains(c)){
               return c;
           }else {
               arrayList.remove(c);//object<-Character
           }

       }
    }
}
