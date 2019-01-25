package Mystack;

import static javafx.scene.input.KeyCode.T;

/**
 * @Author: yanshilong
 * @Date: 19-1-21 下午4:22
 * @Version 1.0
 */
public class Test {



    public static void main(String[] args) {


        /*数组模拟栈的测试*/
//        ArrayStack arrayStack=new ArrayStack(5);
//        System.out.println("栈是否为空："+arrayStack.isnull());
//        System.out.println("栈是否已满："+arrayStack.isfull());
//
//        //压栈
//        arrayStack.push("a");
//        arrayStack.push("b");
//        arrayStack.push("c");
//        System.out.println("栈的长度为："+arrayStack.getsize());
//
//
//        //出栈
//        arrayStack.pop();
//        arrayStack.pop();
//        arrayStack.pop();
//        arrayStack.pop();
//
//
//        arrayStack.destory();


        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
        LinkStack linkStack=new LinkStack(3);
      //  linkStack.Isfull();
        //linkStack.Isnull();

        linkStack.push("1");
        linkStack.push(2);

        //linkStack.Isnull();
      //  linkStack.Isfull();


        linkStack.pop();
        linkStack.pop();




    }





}
