class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode s=new TreeNode(val);
        if (root==null){
            root=s;
            return root;
        }
        TreeNode curr=root;
        TreeNode par=null;
        while(curr!=null){
            par=curr;
            if (val<curr.val){
                curr=curr.left;
            }
            else{
                curr=curr.right;
            }
        }
        if(val<par.val){
            par.left=s;
        }
        else{
            par.right=s;
        }
        return root;   
    }
}
