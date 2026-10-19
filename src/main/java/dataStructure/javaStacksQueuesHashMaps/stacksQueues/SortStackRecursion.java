package javaStacksQueuesHashMaps.stacksQueues;

import java.util.Stack;

/**
 * Problem 2 (Sort a Stack Using Recursion)
 * Given a stack, sort its elements in ascending order using recursion.
 *
 * Hint: Pop elements recursively, sort the remaining stack,
 * and insert the popped element back at the correct position.
 *
 * Author : Mithun
 * Date : 07-10-2026
 */

public class SortStackRecursion {

    // Insert an element at its correct position
    public static void insertSorted(Stack<Integer> stack, int value) {

        // Insert if stack is empty or top is smaller
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        // Remove top element temporarily
        int top = stack.pop();

        // Recursively find correct position
        insertSorted(stack, value);

        // Put removed element back
        stack.push(top);
    }

    // Sort the stack using recursion
    public static void sortStack(Stack<Integer> stack) {

        // Base case
        if (stack.isEmpty()) {
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Sort remaining elements
        sortStack(stack);

        // Insert removed element at correct position
        insertSorted(stack, top);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(40);
        stack.push(20);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}