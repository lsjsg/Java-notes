package learn.Algorithms;

import java.util.List;
import java.util.Scanner;

public class InsertSort {
    public int[] insertsort(int[] list) {
        int len = list.length;
        int min = list[0];
        int buffer;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j] < list[j - 1]) {
                    buffer = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = buffer;
                } else {
                    break;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = null;
        System.out.println("Please enter a list of numbers:");
        nums = sc.nextLine().split(" ");
        int num[] = new int[nums.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.valueOf(nums[i]);
        }
        InsertSort sort = new InsertSort();
        int sorted[] = new int[nums.length];
        sorted = sort.insertsort(num);
        System.out.print("The sorted list is:");
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }
}
