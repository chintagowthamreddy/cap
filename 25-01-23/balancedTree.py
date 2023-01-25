class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        if root==None:
            return 1
        l=self.isBalanced(root.left)
        r=self.isBalanced(root.right)
        if l==0 or r==0:
            return 0
        if abs(l-r)>1:
            return 0
        else:
            return max(l,r)+1
