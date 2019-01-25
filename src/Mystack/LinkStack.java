package Mystack;

import LinkListreversal.LinkList;

import java.util.ArrayList;

/**
 * @Author: yanshilong
 * @Date: 19-1-24 下午1:59
 * @Version 1.0
 */
public class LinkStack <T> {


    public ArrayList<T> list1;
    public int top;
    public int maxsize;



    public LinkStack(int size){

        this.top=0;
       this.list1=new ArrayList<>();
        if (size<=0){
            System.out.println("长度错误");
            return;
        }else {
            maxsize = size;
        }
    }

    public boolean Isnull(){
        if(this.top==0){
            System.out.println("TRUE");
             return true;
        }else {
            System.out.println("FLASE");
           return false;
        }
    }

    public boolean Isfull(){
      if ((top+1)>=maxsize){

          System.out.println("TRUE");
            return true;
      }else {
          System.out.println("FALSE");
         return false;
      }


    }

    public void push(T u){
        if (Isfull()) {
            System.out.println("栈已满，无法插入");

        }else {
            //System.out.println(u);


            list1.add(u);
            System.out.println("压栈成功－－－－");
        top++;
        }
        }

    public void pop(){
       if (Isnull()){
           System.out.println("栈已空，无法弹出－－－");
       }else {
           System.out.println("弹栈成功－－－－－－－");
         T ss=(T)list1.get(top-1);
       System.out.println("弹出的数值为："+ss);
       list1.remove(top-1);
       top--;


       }


    }




}
