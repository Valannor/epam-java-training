package hackerrank;

import java.util.Scanner;

public class Day22
{
    static class Node
    {
        Node left, right;
        int data;

        Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }

    static class Solution
    {
        public static int getHeight(Node root)
        {
            //Write your code here
            int left = 0;
            int right = 0;
            if (root == null)
                return 0;
            if (root.left != null)
                left += getHeight(root.left);
            else left = -1;

            if (root.right != null)
                right += getHeight(root.right);
            else
                right = -1;

            int max = left > right ? left : right;

            return max + 1;
        }

        public static Node insert(Node root, int data)
        {
            if (root == null)
            {
                return new Node(data);
            } else
            {
                Node cur;
                if (data <= root.data)
                {
                    cur = insert(root.left, data);
                    root.left = cur;
                } else
                {
                    cur = insert(root.right, data);
                    root.right = cur;
                }
                return root;
            }
        }

        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            Node root = null;
            while (T-- > 0)
            {
                int data = sc.nextInt();
                root = insert(root, data);
            }
            int height = getHeight(root);
            System.out.println(height);
        }
    }
}
