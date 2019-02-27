package Mytree.BinarySearchTree.Tree2;

/**
 * @Author: yanshilong
 * @Date: 19-2-26 下午10:49
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree=new BinarySearchTree();

        System.out.println(binarySearchTree.isnull());
        int arr[]={10,2,4,6,11,1};
        for (int i=0;i<arr.length;i++){
            binarySearchTree.insert(arr[i]);
        }

      //  System.out.println(binarySearchTree.isnull());

        System.out.println(binarySearchTree.contains(6));

        binarySearchTree.preOrder();


    }

}
