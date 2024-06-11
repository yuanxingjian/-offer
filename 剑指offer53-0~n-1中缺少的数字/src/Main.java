public class Main {
    public static void main(String[] args) {
        //0~n-1中缺少的数字，有序数组
        int[] a=new int[]{0,1,3};
        System.out.println(fun(a));
    }

    private static int fun(int[] a) {
        //二分查找(有序数组应该考虑二分查找，但不一定，可能有更好的方法)
        int left=0;
        int right=a.length-1;
        int mid = 0;
        while (left<right){
            mid=(left+right)/2;
            if(mid!=a[mid]){
                right=mid;
            }else {
                left=mid+1;
            }
        }
        return a[mid]+1;
    }
}
