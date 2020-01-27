package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CountMap<Number> map = new CountMapIml<>();
        map.add(1);
        map.add(12D);
        map.add(1);
        map.add(12D);

        //System.out.println(map.printMap());
        HashMap newMap = new HashMap();
        map.toMap(newMap);

        System.out.println(newMap);
        map.addAll(map);
        System.out.println(map.toMap());
    }
}