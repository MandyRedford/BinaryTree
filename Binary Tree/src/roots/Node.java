package roots;

class Node{
    Node left, right;
    int data;

    public Node()  {
        left = null;
        right = null;
        data = 0; }

    public Node(int n) {
        left = null;
        right = null;
        data = n;}
   
    //set left node
    public void setLeft(Node n) {
        left = n;}
    
    //set right node 
    public void setRight(Node n){
        right = n; }
    
    //get left node 
    public Node getLeft(){
        return left; }
   
    //get right node 
    public Node getRight(){
        return right; }
   
    //set data to node 
    public void setData(int d) {
        data = d; }

 //get data from node 
    public int getData(){
        return data;}     
}