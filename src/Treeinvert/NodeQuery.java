package Treeinvert;

/**
 * @Author: yanshilong
 * @Date: 18-12-4 下午12:40
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
}
