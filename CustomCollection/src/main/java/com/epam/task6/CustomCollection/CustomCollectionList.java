package com.epam.task6.CustomCollection;
import java.util.Arrays;
public class CustomCollectionList<E>
{
      private int len=0;
      private static final int DEFAULT_CAPACITY=10;
      private Object elements[];
      public CustomCollectionList() {
          elements=new Object[DEFAULT_CAPACITY];
      }
      public void add(E e) {
          if (len==elements.length) {
              ensureCapacity();
          }
          elements[len++] = e;
      }
      @SuppressWarnings("unchecked")
      public E print(int i) {
          if (i>=len||i<0) {
              throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
          }
          return (E) elements[i];
      }
       
      //Remove method
      @SuppressWarnings("unchecked")
      public E remove(int i) {
        if (i>=len||i<0) {
              throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
          }
          Object item = elements[i];
          int numElts = elements.length - ( i + 1 ) ;
          System.arraycopy( elements, i + 1, elements, i, numElts ) ;
          len--;
          return (E) item;
      }
       
      //Get Size of list
      public int size() {
          return len;
      }
       
      //Print method
      @Override
      public String toString() 
      {
           StringBuilder sb = new StringBuilder();
           sb.append('[');
           for(int i = 0; i<len;i++) {
               sb.append(elements[i].toString());
               if(i<len-1){
                   sb.append(",");
               }
           }
           sb.append(']');
           return sb.toString();
      }
       
      private void ensureCapacity() {
          int newSize = elements.length*2;
          elements = Arrays.copyOf(elements, newSize);
}
  public static void main(String[] args) 
    {
        CustomCollectionList<Integer>list =new CustomCollectionList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
         
        list.remove(2);
        System.out.println(list);
         
        System.out.println( list.print(0) );
        System.out.println( list.print(1) );
 
        System.out.println(list.size());
    }
}