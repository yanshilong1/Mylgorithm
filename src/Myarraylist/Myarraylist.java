package Myarraylist;

import java.util.Iterator;

/**
 * @Author: yanshilong
 * @Date: 19-1-24 下午3:27
 * @Version 1.0
 */
public class Myarraylist<T> implements Iterable<T> {
      private static final int CAPACITY=10;
      private int thesize;
      private T[] theempl;

      public Myarraylist(){
          doclear();
      }

      public void clear(){
          doclear();
      }

      public void doclear(){
          thesize=0;
          increasesize(CAPACITY);
      }

      public void increasesize(int newsize){
          if (newsize<thesize) return;;
          T [] oldarray=theempl;
          theempl= (T[]) new Object[newsize];
          for (int i=0;i<thesize;i++){
              theempl[i]=oldarray[i];
          }
          System.out.println("扩容完成－－－－现在容量为："+newsize);
          System.out.println();

      }

      public int size(){
          return thesize;

      }
      public boolean isempty(){
          return thesize==0;
      }

      public void trimtosize(){
          increasesize(size());
      }


      public T get(int index){
          if(index<0||index>size()){
              throw new ArrayIndexOutOfBoundsException();
          }
          T ss=theempl[index];
          return ss;

      }

      public boolean set(int index,T newval){
          boolean ren=false;
          if (index>size()||index<0){
              throw new ArrayIndexOutOfBoundsException();
          }

          theempl[index]=newval;
          return ren;

      }


      public boolean add(T val){
          add(size(),val);

          return true;
      }
      public  void add(int index,T val){

          if(theempl.length==size()){
              increasesize(size()*2);
          }
          for (int i=thesize;i>index;i--){
              theempl[i]=theempl[i-1];

          }
          theempl[index]=val;

          thesize++;
      }



    public boolean remove(int index){
          boolean ren=false;
          if(index<0||index>thesize){

              throw new ArrayIndexOutOfBoundsException();
          }

              ren = true;

          for (int i=index;i<thesize-1;i++){
              theempl[i]=theempl[i+1];

          }
          thesize--;
          return ren;


      }



    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
