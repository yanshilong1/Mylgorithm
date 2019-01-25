package Myarraylist;

/**
 * @Author: yanshilong
 * @Date: 19-1-24 下午3:55
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Myarraylist myarraylist=new Myarraylist();
        myarraylist.add(1);
        myarraylist.add(2);

        System.out.println("是否为空："+myarraylist.isempty());
        System.out.println(" 长度为：:"+myarraylist.size());

        System.out.println(myarraylist.get(0));
        System.out.println(myarraylist.get(1));

        myarraylist.set(0,19);
        System.out.println(myarraylist.get(0));

        myarraylist.increasesize(100);

        myarraylist.iterator();








    }
}
