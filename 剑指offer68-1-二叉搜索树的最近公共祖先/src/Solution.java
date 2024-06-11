 class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public TreeNode fun(TreeNode root,TreeNode p,TreeNode q){
        if(root ==null){
            return null;
        }
        if(p.val<root.val&&q.val<root.val) {
    return fun(root.left,p,q);
        }else if(p.val>root.val&&q.val>root.val){
            return fun(root.right,p,q);
        }else {
            return root;
        }
    }
}
