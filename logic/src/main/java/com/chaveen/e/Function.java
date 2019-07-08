package com.chaveen.e;

import java.util.ArrayList;
import java.util.Scanner;

public class Function {
    Scanner sc = new Scanner(System.in);

    public ArrayList<Integer> menu(ArrayList<Integer> arr) {
        System.out.println("Enter 0 to sort using bubble sort ");
        System.out.println("Enter 1 to sort using insertion sort ");
        int option = sc.nextInt();
        switch (option) {
            case 0: {
                return bubbleSort(arr);
            }
            case 1: {
                return insertionSort(arr);
            }
             default : {
                System.exit(0);
            }

        }
        return arr;
    }

    public ArrayList<Integer> bubbleSort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - 1 - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        return arr;
    }

    public ArrayList<Integer> insertionSort(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); ++i) {
            int key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));

                j = j - 1;
            }
            arr.set(j + 1, key);
        }
        return arr;
    }

    public void display(ArrayList<Integer> arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
