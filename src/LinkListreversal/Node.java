package LinkListreversal;

/**
 * @Author: yanshilong
 * @Date: 18-12-4 上午10:42
 * @Version 1.0
 */

//定义数据结构
public class Node {
    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    int date;//数据域
    Node next;//下一个节点指向


    public static Node Createnode() {

        Node linknode1 = new Node();
        Node linknode2 = new Node();
        Node linknode3 = new Node();
        Node linknode4 = new Node();
        Node linknode5 = new Node();
        Node linknode6 = new Node();
        Node linknode7 = new Node();//定义7个节点

        linknode1.date=1;
        linknode2.date=2;
        linknode3.date=3;
        linknode4.date=4;
        linknode5.date=5;
        linknode6.date=6;
        linknode7.date=7;//数据域赋值

        linknode1.next=linknode2;//定义链表结构
        linknode2.next=linknode3;
        linknode3.next=linknode4;
        linknode4.next=linknode5;
        linknode5.next=linknode6;
        linknode6.next=linknode7;
        linknode7.next=null;









         return linknode1;
    }
}


