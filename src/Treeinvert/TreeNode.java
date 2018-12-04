package Treeinvert;

/**
 * @Author: yanshilong
 * @Date: 18-12-4 上午11:58
 *
 *  function:生成平衡二叉树
 *
 * @Version 1.0
 */
public class TreeNode {
    int data;//根节点数据
    TreeNode left;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    TreeNode right;//左右节点

    public TreeNode(int data){//将左右节点重置为根节点,其左右节点为空

        this.data=data;
        left=null;
        right=null;
    }


    public void create(TreeNode root,int data){//传入这个数的根节点和这个数的值
        //1 如果新数大于根节点,放入右子树
        if(data>=root.data){
            if(root.right==null){
                //如果右子数为空
                root.right=new TreeNode(data);//把插入的节点放在右侧

            }else {
                this.create(root.right,data);//循环下移
            }


        }
        //2  如果新节点小于根节点,放入左子数

        else {
            if(root.left==null){
                root.left=new TreeNode(data);
            }else {
                this.create(root.left,data);
            }

        }

    }





}
