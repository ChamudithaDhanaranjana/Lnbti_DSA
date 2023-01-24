package BST_Rotation;

import java.util.Scanner;

class SBBST
{
    SBBST left, right;
    int   data;
    int   height;
 
    public SBBST()
    {
        left = null;
        right = null;
        data = 0;
        height = 0;
    }
 
    public SBBST(int n)
    {
 
        left = null;
        right = null;
        data = n;
        height = 0;
    }
}
 
class SelfBalancingBinarySearchTree
{
    private SBBST root;
 
    public SelfBalancingBinarySearchTree()
    {
        root = null;
    }
 
    public boolean isEmpty()
    {
        return root == null;
    }
 
    public void clear()
    {
        root = null;
    }
 
    public void insert(int data)
    {
        root = insert(data, root);
    }
 
    private int height(SBBST t)
    {
 
        return t == null ? -1 : t.height;
    }
 
    private int max(int lhs, int rhs)
    {
        return lhs > rhs ? lhs : rhs;
    }
 
    private SBBST insert(int x, SBBST t)
    {
        if (t == null)
            t = new SBBST(x);
        else if (x < t.data)
        {
            t.left = insert(x, t.left);
            if (height(t.left) - height(t.right) == 2)
                if (x < t.left.data)
                    t = rotateWithLeftChild(t);
                else
                    t = doubleWithLeftChild(t);
        } else if (x > t.data)
        {
            t.right = insert(x, t.right);
            if (height(t.right) - height(t.left) == 2)
                if (x > t.right.data)
                    t = rotateWithRightChild(t);
                else
                    t = doubleWithRightChild(t);
        } else
            ;
        t.height = max(height(t.left), height(t.right)) + 1;
        return t;
    }
 
    private SBBST rotateWithLeftChild(SBBST k2)
    {
        System.out.println("Left Rotation Performed");
        SBBST k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = max(height(k2.left), height(k2.right)) + 1;
        k1.height = max(height(k1.left), k2.height) + 1;
        return k1;
    }
 
    private SBBST rotateWithRightChild(SBBST k1)
    {
        //System.out.println("Right Rotation Performed");
        SBBST k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k1.height = max(height(k1.left), height(k1.right)) + 1;
        k2.height = max(height(k2.right), k1.height) + 1;
        return k2;
    }
 
    private SBBST doubleWithLeftChild(SBBST k3)
    {
        System.out.println("Left Rotation Performed");
        k3.left = rotateWithRightChild(k3.left);
        return rotateWithLeftChild(k3);
    }
 
    private SBBST doubleWithRightChild(SBBST k1)
    {
        //System.out.println("Right Rotation Performed");
        k1.right = rotateWithLeftChild(k1.right);
        return rotateWithRightChild(k1);
    }
 
    public int countNodes()
    {
        return countNodes(root);
    }
 
    private int countNodes(SBBST r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.left);
            l += countNodes(r.right);
            return l;
        }
    }
 
    public boolean search(int val)
    {
        return search(root, val);
    }
 
    private boolean search(SBBST r, int val)
    {
        boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.data;
            if (val < rval)
                r = r.left;
            else if (val > rval)
                r = r.right;
            else
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }
 
    public void inorder()
    {
        inorder(root);
    }
 
    private void inorder(SBBST r)
    {
        if (r != null)
        {
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }
    }
 
    public void preorder()
    {
 
        preorder(root);
    }
 
    private void preorder(SBBST r)
    {
        if (r != null)
        {
            System.out.print(r.data + " ");
            preorder(r.left);
            preorder(r.right);
        }
    }
 
    public void postorder()
    {
        postorder(root);
    }
 
    private void postorder(SBBST r)
    {
        if (r != null)
        {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + " ");
        }
    }
}
 
public class RotationOnBST
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
 
        SelfBalancingBinarySearchTree sbbst = new SelfBalancingBinarySearchTree();
        System.out.println("Self Balancing Tree\n");
 
        System.out.println("Inset first 10 Elements");
        int N = 10;
        for (int i = 0; i < N; i++)
        {
            sbbst.insert(scan.nextInt());
 
            System.out.println("\nPre-order  :");
            sbbst.preorder();
            System.out.println("\nIn-order   :");
            sbbst.inorder();
            System.out.println("\nPost-order :");
            sbbst.postorder();
 
            System.out.println();
        }
        scan.close();
    }
}
