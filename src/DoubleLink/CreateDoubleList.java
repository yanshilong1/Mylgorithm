package DoubleLink;

/**
 * @Author: yanshilong
 * @Date: 18-12-4 下午6:12
 * @Version 1.0
 */
public class CreateDoubleList<T> {
    public MyLink<T> first;
    public MyLink<T> last;

    public CreateDoubleList() {
        first = null;
        last = null;
    }

    public boolean Isempty() {
        return first == null;
    }

    //定义添加头结点方法
    public void Addfirst(T value) {
        MyLink newlink = new MyLink(value);//新建一个节点

        if (Isempty()) {
            System.out.println("此时链表为空:---开始添加");
            last = newlink;//如果节点为空,直接将这个节点设为尾节点
        } else {//若不为空,设置这个节点为头结点的上一个节点
            first.pre = newlink;


        }

        newlink.next = first;
        first = newlink;


    }

    //定义添加尾节点方法
    public void Addlast(T value) {
        MyLink newlink=new MyLink(value);

        if (Isempty()){
            System.out.println("此时链表为空:---开始添加");
            first=newlink;//表头指针直接指向新节点
        }else {

            last.next=newlink;
            newlink.pre=last;

        }

        last=newlink;
        }

    public void displayForward() {//遍历方法
        MyLink<T> cur = first;
        while (cur != null) {
            cur.displayCurrentNode();

            cur = cur.next;


        }
        System.out.println();
    }


    public  void Rendisplay(){

        MyLink cur=last;
        while (cur!=null){
            cur.displayCurrentNode();
            cur=cur.pre;

        }


    }


    public void reverse(){  //反转函数体

          if(first==null||last==null){
              System.out.println("头为空－－－－－");
              return;
          }
          MyLink pre;
          MyLink next;
          MyLink newlast=null;
          MyLink newfirst = null;

          for(MyLink node=first;node!=null;node=node.getPre()){//变为前驱
              pre=node.getPre();
              next=node.getNext();


              if(node.getPre()==null){
                  newlast=node;
              }else if(node.getNext()==null){
                  newfirst=node;
              }

              node.setNext(pre);
              node.setPre(next);


          }


      first=newfirst;
          last=newlast;


    }


}
