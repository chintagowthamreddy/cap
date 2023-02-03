public static int height(Node root) {
      	// Write your code here.
        int l=0;
        int r=0;
        if (root.left!=null)
            l=height(root.left)+1;
        if (root.right!=null)
            r=height(root.right)+1;
        return Math.max(l,r);
    }
