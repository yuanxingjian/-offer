import java.util.ArrayList;

public class Main {
    static ArrayList<int[]> array = new ArrayList<>();

    public static void main(String[] args) {
        //和为s的连续正数序列(滑动窗口)
//        int[] a = new int[]{1,2,3,4,5};
//        int[] b = Arrays.copyOfRange(a,0,3);
//        for (int i : b) {
//            System.
//            out.println(i);
//        }
        int[][] b=fun(15);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] fun(int s) {
        int i = 1;
        int j = i + 1;
        int sum = i + j;
        int max=s/2+1;
        while (sum < s) {
            j++;
            sum=sum+j;
        }
        if (sum == s) {
            add(s, i, j);
            j++;
            sum=sum+j;}
        while(true){
            while (sum > s&&i<j) {
                sum=sum-i;
                i++;
            }
            if (sum == s) {
                add(s, i, j);
               }
            j++;
            if(j>max)
                return array.toArray(new int[array.size()][]);
            sum=sum+j;
        }
    }

    private static void add(int s, int i, int j) {
            int[] a = new int[j - i + 1];
            for (int k = i, l = 0; k <= j; k++) {
                a[l++] = k;
            }
            array.add(a);
    }
}
