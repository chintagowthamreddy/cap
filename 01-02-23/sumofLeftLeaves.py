class Solution:
    def sumOfLeftLeaves(self, root: Optional[TreeNode]) -> int:
        l=[]
        def trav(root,l):
            if root==None:
                return 
            if root.left!=None:
                if root.left.left==None and root.left.right==None:
                    l.append(root.left.val)
            trav(root.left,l)
            trav(root.right,l)
        trav(root,l)
        return sum(l)
