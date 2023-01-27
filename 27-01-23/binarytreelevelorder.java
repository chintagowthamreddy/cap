class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> node=new ArrayList<>(); 
            for(int i=1; i<=size;i++){
                TreeNode curr=queue.poll();
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
                node.add(curr.val);
            }
            result.add(node);
        }
        return result;
    }
}
