class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        def trav(root):
            return trav(root.left)+[root.val]+trav(root.right) if root else []
        l=trav(root)
        return l==sorted(l) and len(set(l))==len(l)
