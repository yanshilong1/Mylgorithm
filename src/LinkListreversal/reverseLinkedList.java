package LinkListreversal;

/**
 * @Author: yanshilong
 * @Date: 19-1-18 上午11:00
 * @Version 1.0
 */

//递归法实现链表反转
public class reverseLinkedList {

    public Node doreverse(Node node){

        System.out.println("这是传入的数:-----------"+node.getDate());
        //判断是否是链表
        if(node==null||node.next==null){
            return node;

        }else {
            Node headnode=doreverse(node.next);//让这个节点的下一个节点作为头结点,进行循环
            System.out.println("这是反转的数:-----------"+node.getDate());
            /*这里是我的循环体
            * 1 让这个节点的指向发转1>2  变为2>1
            * 2 取消原来的指向 销毁1>2
            * */
            node.next.next=node;
            node.next=null;
            return headnode;






        }



    }



}
