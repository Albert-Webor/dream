package jproject.basic;

import java.util.Arrays;
/*
* 数组案例
* */
public class ArrayDemo {
    static int n;
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        //访问所有元素的第一种方式
        System.out.print("访问数组元素的第1种方式:");
        for (int s: list )
            System.out.print("#"+s);
        System.out.println();
        //访问所有元素的第二种方式
        System.out.println("访问数组元素的第2种方式："+ Arrays.toString(list));
        //拷贝数组的值到另外一个数组
        int[] backupList = Arrays.copyOf(list,list.length+1);
        System.out.println("拷贝的数组："+Arrays.toString(backupList));

    }
}
