import java.util.*;

public class bst_preOrderTreversal {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int id=-1;
    public static node buildTree(int []arr){
        id++;
        if(arr[id]==-1){
            return null;
        }
        node newn=new node(arr[id]);
        newn.left=buildTree(arr);
        newn.right=buildTree(arr);
        return newn;
    }
    public static void preOrder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    public static void main(String[] args) {
        int n[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        node root=buildTree(n);
        System.out.println(root.data);
        System.out.println();
        preOrder(root);
    }
}
