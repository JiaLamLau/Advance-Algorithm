package chapter20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("red", "green", "blue");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Part 1:******************");
        List<String> list1 =Arrays.asList("red","green","blue","yellow","pink");
        Collections.sort(list,Collections.reverseOrder());//逆序输出
        System.out.println(list1);

        System.out.println("Part 2:**********");

        List<Integer> list2=Arrays.asList(2,3,4,5,6,76,34,333,23);
        System.out.println("(1) Index:"+Collections.binarySearch(list2,4));
        System.out.println("(1) Index:"+Collections.binarySearch(list2,433));
        List<String> list3=Arrays.asList("red","pink","blue");
        System.out.println("(2) Index:"+Collections.binarySearch(list3,"pink"));
        System.out.println("(2) Index:"+Collections.binarySearch(list3,"red"));

    }
}
