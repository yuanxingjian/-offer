public class Main {
    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        //圆圈中最后剩下的数字
        Node head = new Node(0);
        Node pre=head;
        int n = 10;
        int m = 17;
        for (int i = 1; i < n; i++) {
                 pre.next=new Node(i);
                 pre=pre.next;
        }
        pre.next=head;
        Node start=head;
        Node pre1=null;
        while (start.next!=start){//循环条件不要写成了循环终止条件
            for (int i = 1; i <m ; i++) {
                pre1=start;
                start=start.next;
            }
            pre1.next=start.next;
            start=start.next;
        }
        System.out.println(start.value);
    }
}
