public Tree reverseTree(Tree root){
        if(root == null)
            return;
        
        Tree leftNode = root.left;
        root.left=root.right;
        root.right=leftNode;
  
        reverseTree(root.left);
        reverseTree(root.right);
  
        return root;
    }
