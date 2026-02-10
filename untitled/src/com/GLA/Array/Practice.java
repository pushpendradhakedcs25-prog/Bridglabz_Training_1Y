package com.GLA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    public int[] linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return new int[]{i};
            }
        }
        return new int[]{-1};
    }

    public int[] twoSum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1};
    }

    public int[] sorting(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public int findMid(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        int mid = (end - start) / 2;
        return arr[mid];
    }

    public int search(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(
                "\n ------------------------------******************WELCOME TO MY FIRST PROJECT********************---------------------------------------------------------------------"
        );

        Practice p1 = new Practice();

        int arr[] = {14, 21, 3, 41, 15, 61, 17, 866, 19, 12};
        int target = 19;

        while (true) {

            System.out.println(
                    "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
            );
            System.out.println("1. Linear Search ");
            System.out.println("2. Two Sum ");
            System.out.println("3. Sorting of Array");
            System.out.println("4. Find mid in Array");
            System.out.println("5. Binary Search ");
            System.out.println(
                    "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
            );

            System.out.print("Click the button  :- ");

            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();

            System.out.println(
                    "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
            );

            switch (choose) {

                case 1:
                    int[] search = p1.linearSearch(arr, target);
                    System.out.println("Linear Search :- " + Arrays.toString(search));
                    break;

                case 2:
                    int[] twoSum = p1.twoSum(arr, target);
                    System.out.println("Two Sum :- " + Arrays.toString(twoSum));
                    break;

                case 3:
                    int[] sort = p1.sorting(arr);
                    System.out.println("Sorted Array :- " + Arrays.toString(sort));
                    break;

                case 4:
                    int middle = p1.findMid(arr);
                    System.out.println("Mid of an Array :- " + middle);
                    break;

                case 5:
                    System.out.println(Arrays.toString(arr));
                    System.out.println(p1.sorting(arr));
                    System.out.println(Arrays.toString(arr));

                    int[] binary = new int[]{p1.search(arr, target)};
                    System.out.println("Binary Search :- " + Arrays.toString(binary));
                    break;

                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
