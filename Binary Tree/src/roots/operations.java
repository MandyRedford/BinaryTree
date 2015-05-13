package roots;
class operations{
    private Node root;

    public operations(){
        root = null;
    }
    //check if tree is empty 
    public boolean isEmpty(){
        return root == null;
    }
    //insert data 
    public void insert(int data) {
        root = insert(root, data);
    }
    //insert data recursively
    private Node insert(Node node, int data) {
        if (node == null)
            node = new Node(data);
        else {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }
    //delete data 
    public void delete(int k)
    {
        if (isEmpty())
            System.out.println("Tree Empty");
        else if (search(k) == false)
            System.out.println("Sorry "+ k +" is not present");
        else {
            root = delete(root, k);
            System.out.println(k+ " deleted from the tree");
        }
    }
    private Node delete(Node root, int k) {
        Node p, p2, n;
        if (root.getData() == k){
            Node lt, rt;
            lt = root.getLeft();
            rt = root.getRight();
            if (lt == null && rt == null)
                return null;
            else if (lt == null){
                p = rt;
                return p;
            }
            else if (rt == null)	{
                p = lt;
                return p;
            }
            else
            {
                p2 = rt;
                p = rt;
                while (p.getLeft() != null)
                    p = p.getLeft();
                p.setLeft(lt);
                return p2;
            }
        }
        if (k < root.getData())
        {
            n = delete(root.getLeft(), k);
            root.setLeft(n);
        }
        else
        {
            n = delete(root.getRight(), k);
            root.setRight(n);             
        }
        return root;
    }
 
    //search
    public boolean search(int val)
    {
        return search(root, val);
    }
    //search recursively
    private boolean search(Node r, int val)
    {
        boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.getData();
            if (val < rval)
                r = r.getLeft();
            else if (val > rval)
                r = r.getRight();
            else
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }
    
    // count number of nodes 
    public int countNodes()
    {
        return countNodes(root);
    }
    //count number of nodes recursively 
    private int countNodes(Node r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }
    //inorder
    public void inorder()
    {
        inorder(root);
    }
    private void inorder(Node r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }
    
    //reverse
    public void reverse() {
        reverse(root);
    }
    private void reverse(Node r){
        if (r != null) {
            reverse(r.getRight());
            System.out.print(r.getData() +" ");
            reverse(r.getLeft());
        }
    }
    //preorder
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(Node r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());             
            preorder(r.getRight());
        }
    }
    //postorder
    public void postorder()
    {
        postorder(root);
    }
    private void postorder(Node r)
    {
        if (r != null)
        {
            postorder(r.getLeft());             
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }     
}