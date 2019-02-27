package DoubleLink;

/**
 * @Author: yanshilong
 * @Date: 18-12-4 下午7:52
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        CreateDoubleList doubleList=new CreateDoubleList();
        doubleList.Addfirst("a");
        doubleList.Addfirst("b");
        doubleList.Addfirst("c");
        doubleList.Addfirst("d");

        doubleList.displayForward();
        System.out.println("====================================================");


        doubleList.Rendisplay();//反向打印

        doubleList.reverse();//反转　

        doubleList.displayForward();//打印


    }
}
