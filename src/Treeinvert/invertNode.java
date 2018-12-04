package Treeinvert;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: yanshilong
 * @Date: 18-12-4 下午3:48
 * function:递归法实现二叉树生成反转二叉树
 * @Version 1.0
 */



public class invertNode {
    public static TreeNode doinvert(TreeNode root){
        if(root==null)return root;//如果为空直接返回
        TreeNode temp=root.left;//定义一个中间量为了存放左子树
        root.left=doinvert(root.right);//在返回root.right的同时候,循环调用了自身的函数
        root.right=doinvert(temp);//在返回temp的同时,调用了函数
        return root;


    }
    //遍历法实现反转
    public static  TreeNode lastdoinvert(TreeNode root) {

        if (root == null) {
            return root;
        }
        if (root.left == null && root.right == null) {
            return root;

        }
        TreeNode temp = null;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left != null) {
            lastdoinvert(root.left);
        }
        if (root.right != null) {
            lastdoinvert(root.right);
        }
    return root;

    }
    }





