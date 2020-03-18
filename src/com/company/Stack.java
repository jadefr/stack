package com.company;

import java.util.spi.AbstractResourceBundleProvider;

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
            System.out.print(pop() + " ");
        }
    }

    public int pop() {
        //deletes the last value by taking out its reference

        if (top > 0) {
            top --;
        }
        else {
            System.out.println("Stack Underflow");
            return -100;
        }
        return stack[top];
    }

    public int peek() {
        return stack[top - 1];
    }
}
