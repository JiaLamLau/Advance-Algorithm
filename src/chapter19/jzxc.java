package chapter19;

//package juzhen;

public class jzxc {
    public static void main(String[] args) {
        int[][] A= {{1,2},{3,4}};
        int[][] B= {{5,6},{7,8}};

        int C[][]=new int[A.length][];

        for(int i=0;i<A.length;i++) {
            C[i]=new int[A[i].length];
        }

        for(int i=0;i<A.length;i++) {
            for(int j=0;j<A[i].length;j++) {
                for(int k=0;k<A.length;k++) {
                    C[i][j] +=A[i][k]*B[k][j];
                }
            }
        }
        for(int i=0;i<C.length;i++) {
            for(int j=0;j<C[i].length;j++) {
                System.out.print(C[i][j]+"  ");
            }
            System.out.println();
        }
    }
}