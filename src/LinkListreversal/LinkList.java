package LinkListreversal;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

/**
 * @Author: yanshilong
 * @Date: 18-12-4 上午11:19
 * @Version 1.0
 */
public class LinkList {
    static void doreverse(){
        System.out.println("请输入您的字符串");
        LinkedList newlinklist=new LinkedList();
        String str="";
        Scanner scanner=new Scanner(System.in);
        str=scanner.next();

        LinkedList <Character> list=new LinkedList<>();

        for (int i=0;i<str.length();i++){
             char c=str.charAt(i);
           // list.add(c);//向链表尾部添加数值
            list.addFirst(c);//向链表头前面添加

        }

        //System.out.println("现在的链表是:"+list);


      String newstr="";

      while (list.size()>0){
          newstr=newstr+list.removeFirst();

      }

        System.out.println("反转后的链表是:"+newstr);




    }
}
