package com.chaveen.e;

import java.util.ArrayList;

public class GenarateData {

    public ArrayList<Integer> addData(ArrayList<Integer> arr) {
        for (int i = 0; i < 10; i++) {
            arr.add((int) (Math.random()*25+1));
        }
        return arr;

    }
}
