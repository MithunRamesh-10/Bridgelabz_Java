package dataStructure.linkedList;

/**
 * Problem 4: Inventory Management System
 *
 * Demonstrates singly linked list operations
 * for managing inventory items.
 *
 * Operations:
 * - Add at beginning
 * - Add at end
 * - Add at specific position
 * - Remove by Item ID
 * - Update quantity
 * - Search by Item ID or Name
 * - Calculate total inventory value
 * - Sort by Name or Price
 *
 * Author : Mithun
 * Date : 08-10-2026
 */
public class InventoryManagementSystem {

    // Node class representing an inventory item
    static class Item {
        private String itemName;
        private int itemId;
        private int quantity;
        private double price;
        private Item next;

        Item(String itemName, int itemId,
             int quantity, double price) {

            this.itemName = itemName;
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
        }
    }

    private Item head;

    // Add at beginning
    public void addAtBeginning(String name,
                               int id,
                               int quantity,
                               double price) {

        Item newItem =
                new Item(name, id, quantity, price);

        newItem.next = head;
        head = newItem;
    }

    // Add at end
    public void addAtEnd(String name,
                         int id,
                         int quantity,
                         double price) {

        Item newItem =
                new Item(name, id, quantity, price);

        if (head == null) {
            head = newItem;
            return;
        }

        Item current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newItem;
    }

    // Add at specific position
    public void addAtPosition(int position,
                              String name,
                              int id,
                              int quantity,
                              double price) {

        if (position <= 1) {
            addAtBeginning(
                    name, id, quantity, price
            );
            return;
        }

        Item current = head;

        for (int i = 1;
             i < position - 1 && current != null;
             i++) {

            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }

        Item newItem =
                new Item(
                        name, id, quantity, price
                );

        newItem.next = current.next;
        current.next = newItem;
    }

    // Remove by Item ID
    public void removeByItemId(int itemId) {

        if (head == null) {
            return;
        }

        if (head.itemId == itemId) {
            head = head.next;
            return;
        }

        Item current = head;

        while (current.next != null) {

            if (current.next.itemId == itemId) {
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }
    }

    // Update quantity
    public void updateQuantity(int itemId,
                               int newQuantity) {

        Item current = head;

        while (current != null) {

            if (current.itemId == itemId) {
                current.quantity = newQuantity;
                return;
            }

            current = current.next;
        }
    }

    // Search by Item ID
    public void searchByItemId(int itemId) {

        Item current = head;

        while (current != null) {

            if (current.itemId == itemId) {
                displayItem(current);
                return;
            }

            current = current.next;
        }

        System.out.println("Item not found.");
    }

    // Search by Item Name
    public void searchByItemName(String name) {

        Item current = head;

        while (current != null) {

            if (current.itemName.equalsIgnoreCase(name)) {
                displayItem(current);
            }

            current = current.next;
        }
    }

    // Calculate total inventory value
    public double calculateTotalValue() {

        double total = 0;
        Item current = head;

        while (current != null) {

            total += current.quantity * current.price;
            current = current.next;
        }

        return total;
    }

    // Sort by name
    public void sortByName(boolean ascending) {

        sort(ascending, true);
    }

    // Sort by price
    public void sortByPrice(boolean ascending) {

        sort(ascending, false);
    }

    private void sort(boolean ascending,
                      boolean byName) {

        boolean swapped;

        do {

            swapped = false;
            Item current = head;

            while (current != null
                    && current.next != null) {

                boolean shouldSwap;

                if (byName) {
                    int result =
                            current.itemName.compareToIgnoreCase(
                                    current.next.itemName
                            );

                    shouldSwap =
                            ascending
                                    ? result > 0
                                    : result < 0;

                } else {

                    shouldSwap =
                            ascending
                                    ? current.price >
                                    current.next.price
                                    : current.price <
                                    current.next.price;
                }

                if (shouldSwap) {
                    swapData(
                            current,
                            current.next
                    );
                    swapped = true;
                }

                current = current.next;
            }

        } while (swapped);
    }

    private void swapData(Item first,
                          Item second) {

        String name = first.itemName;
        int id = first.itemId;
        int quantity = first.quantity;
        double price = first.price;

        first.itemName = second.itemName;
        first.itemId = second.itemId;
        first.quantity = second.quantity;
        first.price = second.price;

        second.itemName = name;
        second.itemId = id;
        second.quantity = quantity;
        second.price = price;
    }

    // Display inventory
    public void display() {

        Item current = head;

        while (current != null) {
            displayItem(current);
            current = current.next;
        }
    }

    private void displayItem(Item item) {

        System.out.println(
                "Item ID: " + item.itemId +
                        ", Name: " + item.itemName +
                        ", Quantity: " + item.quantity +
                        ", Price: ₹" + item.price
        );
    }

    public static void main(String[] args) {

        InventoryManagementSystem inventory =
                new InventoryManagementSystem();

        inventory.addAtBeginning(
                "Laptop", 101, 5, 55000
        );

        inventory.addAtEnd(
                "Mouse", 102, 10, 500
        );

        inventory.addAtPosition(
                2, "Keyboard", 103, 7, 1500
        );

        System.out.println("Inventory:");
        inventory.display();

        System.out.println(
                "Total Inventory Value: ₹"
                        + inventory.calculateTotalValue()
        );

        inventory.updateQuantity(102, 15);

        System.out.println("After Quantity Update:");
        inventory.display();

        System.out.println("Sorted by Price:");
        inventory.sortByPrice(true);
        inventory.display();

        inventory.searchByItemId(103);
        inventory.searchByItemName("Laptop");
    }
}