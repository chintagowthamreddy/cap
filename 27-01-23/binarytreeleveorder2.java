class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) 
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){       
                TreeNode curr = queue.poll();
                list.add(curr.val);
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);
            }
            result.add(list);
        }
        List<List<Integer>> ip = new ArrayList<>();
        for(int i=result.size()-1;i>=0;i--){
            ip.add(result.get(i));
        }
        return ip;

    }
}
