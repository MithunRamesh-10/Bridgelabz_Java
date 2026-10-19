package javaStacksQueuesHashMaps.hashMaps;

/**
 * Problem 9 (Implement a Custom Hash Map)
 * Design and implement a basic hash map class with operations
 * for insertion, deletion, and retrieval.
 *
 * Hint: Use an array of linked lists to handle collisions
 * using separate chaining.
 *
 * Author : Mithun
 * Date : 07-10-2026
 */

public class CustomHashMap {

    static class Node {
        int key;
        String value;
        Node next;

        Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    static class MyHashMap {

        private Node[] buckets;

        MyHashMap(int size) {
            buckets = new Node[size];
        }

        // Calculate bucket index
        private int getIndex(int key) {
            return Math.abs(key) % buckets.length;
        }

        // Insert or update a key-value pair
        public void put(int key, String value) {

            int index = getIndex(key);

            Node current = buckets[index];

            // Check if key already exists
            while (current != null) {

                if (current.key == key) {
                    current.value = value;
                    return;
                }

                current = current.next;
            }

            // Insert new node at the beginning
            Node newNode = new Node(key, value);
            newNode.next = buckets[index];
            buckets[index] = newNode;
        }

        // Retrieve value using key
        public String get(int key) {

            int index = getIndex(key);

            Node current = buckets[index];

            while (current != null) {

                if (current.key == key) {
                    return current.value;
                }

                current = current.next;
            }

            return null;
        }

        // Delete a key-value pair
        public void remove(int key) {

            int index = getIndex(key);

            Node current = buckets[index];
            Node previous = null;

            while (current != null) {

                if (current.key == key) {

                    if (previous == null) {
                        buckets[index] = current.next;
                    } else {
                        previous.next = current.next;
                    }

                    return;
                }

                previous = current;
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {

        MyHashMap map = new MyHashMap(5);

        map.put(1, "Hemang");
        map.put(2, "Java");
        map.put(7, "Data Structures");

        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Value for key 2: " + map.get(2));
        System.out.println("Value for key 7: " + map.get(7));

        map.remove(2);

        System.out.println("Value for key 2 after deletion: " + map.get(2));
    }
}