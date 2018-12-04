package LinkListreversal;

import java.util.LinkedList;

/**
 * @Author: yanshilong
 * @Date: 18-12-4 上午10:42
 * @Version 1.0
 */

//递归法实现链表反转
public class Test {

    public static void main(String[] args) {
        Node node=Node.Createnode();//新建一个链表

        //执行一次遍历
        ReadLinkedList reverseLinkedList= ReadLinkedList.readLink(node);

        //进行发转操作
        reverseLinkedList user=new reverseLinkedList();
        Node newnode=user.doreverse(node);

        //反转完成,进行遍历
        System.out.println("这是反转后的数据:");
        ReadLinkedList readLinkedList2=ReadLinkedList.readLink(newnode);




        //测试linkedList的反转,
         LinkList.doreverse();



    }

}
