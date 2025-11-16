package lab5;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTree<T extends Comparable<T>> {
   private Node<T> root;

   public void add(T val)
   {
       root = insertRec(root, val);
   }

   private Node<T> insertRec(Node<T> root, T val)
   {
       if(root == null)
       {
           root = new Node<>(val);
           return root;
       }

       if(search(val) == true)
           return root;

       if(val.compareTo(root.val) < 0)
           root.left = insertRec(root.left, val);
       else
           root.right = insertRec(root.right, val);

       return root;
   }

   public boolean search(T val)
   {
       return searchRec(root, val);
   }

   private boolean searchRec(Node<T> root, T val)
   {
       if(root == null)
           return false;
       if(val.compareTo(root.val) == 0)
           return true;
       if(val.compareTo(root.val) < 0)
           return searchRec(root.left, val);
       return searchRec(root.right, val);
   }

   public void inOrder()
   {
       inOrderRec(root);
   }

   private void inOrderRec(Node<T> curr)
   {
       if(curr != null)
       {
           inOrderRec(curr.left);
           System.out.print(curr.val + " ");
           inOrderRec(curr.right);
       }
   }

   private static class Node<T>
   {
       T val;
       Node<T> left, right;

       public Node(T val)
       {
           this.val = val;
       }
   }
}