package com.company;

public class Stack {
    int size;
    int top;
    int[] stack;

    public Stack(int size) {
        this.size = size;
        top = 0;
        this.stack = new int[size];
    }

    public void push(int data) {
        if (top < size) {
            stack[top] = data;
            top ++;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public void print() {
        while (top > 0) {
            System.out.print(stack[top - 1] + " ");
            top --;
        }
    }

    public int pop() {
        //deletes the last value by taking out its reference
        top --;
        return stack[top];
    }
}
