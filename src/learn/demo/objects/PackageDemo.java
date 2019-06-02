/*
通过package关键字可以声明一个包， 必须将package语句放在所有语句前面
当调用一个包时：
1.可以在每个类名前面加上完整的包名
2.通过import语句引入包中的类
 */
package learn.demo.objects;

import learn.Algorithms.InsertSort;

import java.util.Arrays;

public class PackageDemo {
    // method 1
    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        int[] nums = new int[]{90, 78, 54, 23, 12};
        int[] sorted = new int[5];
        sorted = sort.insertsort(nums);
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }
    // method 2
//    public static void main(String[] args) {
//        learn.Algorithms.InsertSort sort = new learn.Algorithms.InsertSort();
//        int[] nums = new int[]{90, 78, 54, 23, 12};
//        int[] sorted = new int[5];
//        sorted = sort.insertsort(nums);
//        for (int i = 0; i < sorted.length; i++) {
//            System.out.print(sorted[i] + " ");
//        }
//    }
}
