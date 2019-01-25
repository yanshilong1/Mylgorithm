package DoubleLink;

/**
 * @Author: yanshilong
 * @Date: 18-12-4 下午6:07
 *
 * function :双向链表的定义
 * @Version 1.0
 */
public class MyLink<T> {
    public  T data;
    public MyLink<T> next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyLink<T> getNext() {
        return next;
    }

    public void setNext(MyLink<T> next) {
        this.next = next;
    }

    public MyLink<T> getPre() {
        return pre;
    }

    public void setPre(MyLink<T> pre) {
        this.pre = pre;
    }

    public MyLink<T> pre;

    public MyLink(T data){
        this.data=data;
    }

    public void  displayCurrentNode(){
        System.out.println("*******************************************");
        System.out.println("数据为："+data+"  ");
        System.out.println("他的前驱为：　"+this.getPre());
        System.out.println("他的后继是：　"+this.getNext());
        System.out.println("*******************************************");

        System.out.println();
        System.out.println();
    }


}
