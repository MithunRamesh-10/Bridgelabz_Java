package javaStacksQueuesHashMaps.stacksQueues;

import java.util.Stack;

/**
 * Problem 1 (Queue Using Stacks)
 * Design a queue using two stacks such that enqueue and dequeue
 * operations are performed efficiently.
 *
 * Hint: Use one stack for enqueue and another stack for dequeue.
 * Transfer elements between stacks as needed.
 *
 * Author : Mithun
 * Date : 07-10-2026
 */

public class QueueUsingStacks {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    // Add element to the queue
    public static void enqueue(int value) {
        stack1.push(value);
    }

    // Remove element from the queue
    public static int dequeue() {

        // Move elements to stack2 if it is empty
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // Check if queue is empty
        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return stack2.pop();
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);

        System.out.println("Dequeued: " + dequeue());
        System.out.println("Dequeued: " + dequeue());

        enqueue(40);

        System.out.println("Dequeued: " + dequeue());
        System.out.println("Dequeued: " + dequeue());
    }
}