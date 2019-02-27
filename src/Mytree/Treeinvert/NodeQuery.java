package Mytree.Treeinvert;

/**
 * @Author: yanshilong
 * @Date: 18-12-4 下午12:40
 *
 * function:定义二叉树的三种遍历方法
 *
 * @Version 1.0
 */

public  class NodeQuery {

        public static void preOrder(TreeNode root){//先序遍历  根>左>右


        if(root!=null){
            System.out.print(root.data+" _ ");
            preOrder(root.left);
            preOrder(root.right);
        }

        }



        public static void inOrder(TreeNode root){//中序遍历,左>根>右
            if(root!=null){
                inOrder(root.left);
                System.out.print(root.data+" _ ");
                inOrder(root.right);
            }

        }



        public static void  afterOrder(TreeNode root){//后序遍历 左>右>根


            if(root!=null){
                afterOrder(root.left);
                afterOrder(root.right);
                System.out.print(root.data+" _ ");
            }
        }

}
