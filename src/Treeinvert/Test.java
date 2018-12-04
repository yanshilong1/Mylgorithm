package Treeinvert;

/**
 * @Author: yanshilong
 * @Date: 18-12-4 下午12:42
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
            int [] arr={23,54,13,2,67,4,85,29,27,8};
            TreeNode treeNode=new TreeNode(arr[0]);//创建了一个二叉树
           for (int i=1;i<arr.length;i++){
               treeNode.create(treeNode,arr[i]);//循环插入

           }

           //开始遍历
        System.out.println("先根遍历:");
           NodeQuery.preOrder(treeNode);


    }
}
