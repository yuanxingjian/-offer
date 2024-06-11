public class Main {
    public static void main(String[] args) {
        String s="aaa";
        String p="a";
        boolean flag=isMatch(s,p);
        System.out.println(flag);
    }

    private static boolean isMatch(String s, String p) {
        //匹配成功的条件
        if(p.isEmpty()&&s.isEmpty()){
            return true;
        }else if(p.isEmpty()||s.isEmpty()){//s和p没有同时为空，则为匹配失败
            return false;
        }
        //第一个字符是否相等
        boolean headMatch=s.charAt(0)==p.charAt(0)||p.charAt(0)=='.';
        //p的第二个字符为'*'
        if(p.length()>=2&&p.charAt(1)=='*'){
            //第一个字符不相等
            if(!headMatch){
                return isMatch(s,p.substring(2));
            }else {//第一个字符相等
                return isMatch(s.substring(1),p);
            }
        }else if(headMatch){//p的第二个字符不是'*'，且第一个字符相等
            return isMatch(s.substring(1),p.substring(1));
        }else {//p的第二个字符不是'*'，且第一个字符不等相等
            return false;
        }
    }
}
