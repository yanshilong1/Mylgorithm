package Mytree.BinarySearchTree.Tree2;

/**
 * @Author: yanshilong
 * @Date: 19-2-26 下午10:22
 * @Version 1.0
 */
public class BinarySearchTree<T extends Comparable> {

    private BinaryNode root;
    private static   class BinaryNode<T>{

         BinaryNode(T data){


            this(data,null,null);
        }

          BinaryNode(T data,BinaryNode<T> left,BinaryNode<T> right){
            this.data=data;
            this.left=left;
            this.right=right;

        }

            BinaryNode<T> left;
            BinaryNode<T> right;
            T data;//节点数值




        }



    //构造函数进行初始化
    public BinarySearchTree(){
        root=null;
    }

    public void makeempty(){

        root=null;
    }

    public boolean isnull(){
        return root==null;
    }



    public void insert(T x){
        root=insert(x,root);
       // System.out.println("插入－－－－－－－－－－－－－－－－－－－－－－"+" X="+x+"  root= "+root);
    }
    private BinaryNode<T> insert(T x,BinaryNode root){


        if(root==null){
            System.out.println("生成节点的动作");

            return new BinaryNode<T>(x,null,null);

        }
        int  conpareresult=x.compareTo(root.data);
        if (conpareresult>0){
            System.out.println("------右移－－－－－－－－－");
            root.right=insert(x,root.right);
        }
        else if(conpareresult<0){
            System.out.println("----------左移－－－－－－－－－");
            root.left=insert(x,root.left);
        }
        else ;



        return root;//返回原来的根
    }



    private void preOrder(BinaryNode<T> tree) {
        if(tree != null) {
            System.out.print(tree.data+" ");

            preOrder(tree.left);
            preOrder(tree.right);
        }
    }

    public void preOrder() {
        preOrder(root);
    }


    public Boolean contains(T x){

        return  contains(x,root);
//        preOrder(root);
//        return true;

    }
    /*　查找二叉树是否包含该节点的方法　　　　*/
    private Boolean contains(T x,BinaryNode<T> t){

        if (t==null) return false;


        int compareResult=x.compareTo(t.data);//判断左子数还是右子树
        System.out.println("两个值为 x："+x+" data: "+t.data);
        System.out.println("比较值为："+compareResult);

        if (compareResult>0){//x大的时候

            return contains(x,t.right);
        }

        else if(compareResult<0){//data大的时候
            System.out.println("进入比较值为："+compareResult+" 的函数内"+"t.left="+t.left);
            return contains(x,t.left);

        }
        else     return true;

//          ren="二叉树包含该值，其父节点的值为："+root.data+" ";
//            System.out.println("0000000000000");
//            return ren;

    }

}
