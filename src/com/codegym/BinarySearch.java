package com.codegym;

public class BinarySearch {
    static int[] lists = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] lists, int key) {
        int low = 0;
        int high = lists.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < lists[mid])
                high = mid - 1;
            else if (key == lists[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(binarySearch(lists, 2));
        System.out.println(binarySearch(lists, 11));
        System.out.println(binarySearch(lists, 79));
        System.out.println(binarySearch(lists, 1));
        System.out.println(binarySearch(lists, 5));
        System.out.println(binarySearch(lists, 80));
    }
}
