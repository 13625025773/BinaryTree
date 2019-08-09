package tree;


public class BinaryTree {

     private class Node{
       private Comparable data;
       private Node left;
       private Node right;

         public Node(Comparable data) {
             this.data = data;
         }
         public void addNode(Node newNode){
             if (this.data.compareTo(newNode.data)<0){
                 if(this.right==null){
                     this.right=newNode;
                 }else {
                     this.right.addNode(newNode);
                 }
             }else {
                 if(this.left==null){
                     this.left=newNode;
                 }else {
                     this.left.addNode(newNode);
                 }
             }

         }

         public void toArrayNode(){
             if(this.left!=null){
                 this.left.toArrayNode();
             }
             BinaryTree.this.retObj[BinaryTree.this.foot++]=this.data;
             if(this.right!=null){
                 this.right.toArrayNode();
             }

         }
     }



     private Node root;
     private int count;
     private int foot;
     private Object retObj[];
     public void add(Object data){
         Comparable com=(Comparable)data;
         Node newNode=new Node(com);
         if (this.root==null){
             this.root=newNode;
         }else {
             this.root.addNode(newNode);
         }
         this.count++;
     }

     public Object[] toArray(){
         if(this.root==null){
             return null;
         }
         this.foot=0;
         this.retObj=new Object[this.count];
         this.root.toArrayNode();
         return this.retObj;
     }
}
