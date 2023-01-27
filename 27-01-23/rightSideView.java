class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> ip=new ArrayList<>();
        if(root==null) 
            return ip;
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
            ip.add(list.get(list.size()-1));
        }
        return ip;
        
    }
}
