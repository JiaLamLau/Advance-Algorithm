package chapter20;

import java.util.*;

public class TestIterator {
  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>();
    collection.add("New York"); 
    collection.add("Atlanta"); 
    collection.add("Dallas"); 
    collection.add("Madison"); 

    Iterator<String> iterator = collection.iterator();//声明构造器
    for(String element:collection)
      System.out.print(iterator.next().toUpperCase() + " ");//下一个的转大写，输出字母

    System.out.println();
  }
}
