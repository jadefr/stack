package com.company;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack(20);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.push(110);

        int firstPop = stack.pop();
        System.out.println(firstPop);

        int secondPop = stack.pop();
        System.out.println(secondPop);

        stack.print();
    }
}
