package Mystack;

/**
 * @Author: yanshilong
 * @Date: 19-1-21 下午4:23
 * @Version 1.0
 *
 */

/*   两个操作　压栈　出栈
* 　　两个数据　栈空？　　栈满？
* 　　以数组为基础实现
* */
public class ArrayStack <T>{

    private T data[];//数组存储元素
    private  int maxsise;//最大深度
    private  int top;//设置栈顶


    public ArrayStack(int maxsise){//创建

        this.maxsise=maxsise;
        this.data= (T[]) new Object[maxsise];
        this.top=-1;

    }

     public boolean isfull(){//是否栈满
        boolean flag=false;
        if(this.top==maxsise-1){
            flag=true;
        }

         return flag;
     }


     public boolean isnull(){//是否栈空
        boolean flag=false;
        if(this.top==-1){

             flag=true;
        }

        return flag;
     }


       public void  push(T value){

          if(isfull()){
              System.out.println("栈满无法存储。　　　最大长度："+maxsise);
              return;
          }


          data[++top]=value;
           System.out.println("此时top的值为： "+top+" 栈未满，存储成功");

       }




       public void pop(){

         if(isnull()){
             System.out.println("栈已空，无法弹栈　");
             return;
         }
         T v=data[top];//取出栈顶元素
           --top;
           System.out.println("成功弹出栈顶元素：　"+v+"  此时栈的深度为："+(top+1));

       }


       public int getsize(){

        return top+1;
       }

       public void destory(){


           this.maxsise=maxsise;
           this.data= (T[]) new Object[maxsise];
           this.top=-1;
           System.out.println("栈销毁－－－");

       }
}
