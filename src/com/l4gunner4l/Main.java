package com.l4gunner4l;

public class Main {

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("1");
        list.add("3");
        list.add("5");
        list.add("2");

        list.remove(2);
        list.remove(0);
    }
}
