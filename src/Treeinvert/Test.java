package Treeinvert;

/**
 * @Author: yanshilong
 * @Date: 18-12-4 下午12:42
 * function:主类平衡调用二叉树的生成-遍历-反转-遍历
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

               System.out.println();
            System.out.println("中序遍历");
            NodeQuery.inOrder(treeNode);
                 System.out.println();
            System.out.println("后序遍历");
            NodeQuery.afterOrder(treeNode);


            //开始反转
           // TreeNode newtree=invertNode.doinvert(treeNode);
               TreeNode newtree=invertNode.lastdoinvert(treeNode);
           //再次遍历



        System.out.println();
        System.out.println("*****************************************************");
        System.out.println("先根遍历:");
        NodeQuery.preOrder(newtree);

        System.out.println();
        System.out.println("中序遍历");
        NodeQuery.inOrder(newtree);
        System.out.println();
        System.out.println("后序遍历");
        NodeQuery.afterOrder(newtree);





    }
}
