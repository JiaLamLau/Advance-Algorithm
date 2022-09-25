package chapter20;


import java.util.Arrays;

public class Test {
        public static void main(String []args)
        {
            int[] a=new int[]{10,1,6,8,4,5};

            System.out.println("从1到4的排序，也就是1到3的排序");
            Arrays.sort(a,1,4);
            for (int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+" ,");
            }
        }
    }
