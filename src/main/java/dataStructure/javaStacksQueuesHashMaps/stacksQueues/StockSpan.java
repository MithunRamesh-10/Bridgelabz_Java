package javaStacksQueuesHashMaps.stacksQueues;

import java.util.Stack;

/**
 * Problem 3 (Stock Span Problem)
 * For each day in a stock price array, calculate the span.
 *
 * Span is the number of consecutive days for which the stock price
 * was less than or equal to the current day's price.
 *
 * Hint: Use a stack to keep track of indices of prices
 * in descending order.
 *
 * Author : Mithun
 * Date : 07-10-2026
 */

public class StockSpan {

    public static int[] calculateSpan(int[] prices) {

        int[] span = new int[prices.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {

            // Remove previous smaller or equal prices
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, all previous days are included
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                // Difference between current day and previous greater price
                span[i] = i - stack.peek();
            }

            // Store current day's index
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] span = calculateSpan(prices);

        System.out.print("Stock Prices: ");

        for (int price : prices) {
            System.out.print(price + " ");
        }

        System.out.println();

        System.out.print("Stock Span: ");

        for (int value : span) {
            System.out.print(value + " ");
        }
    }
}