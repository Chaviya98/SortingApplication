package com.chaveen.e;

import java.util.ArrayList;

public class Service {
    static ArrayList<Integer> arr = new ArrayList<Integer>();

    public static void main(String[] args) {

        Function obj = new Function();
        obj.display(new GenarateData().addData(arr));
        obj.display(obj.menu(arr));

    }
}
