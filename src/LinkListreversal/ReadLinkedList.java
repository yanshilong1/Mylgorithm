package LinkListreversal;

import java.util.ArrayList;

/**
 * @Author: yanshilong
 * @Date: 18-12-4 上午10:50
 * @Version 1.0
 */


//定义遍历方法
public class ReadLinkedList {
    public static ReadLinkedList readLink(Node node){
        ArrayList arrayList=new ArrayList();
        while (node!=null){
            System.out.println("遍历节点的数据是:"+node.getDate());
            node=node.getNext();


        }



        return null;
    }


}
