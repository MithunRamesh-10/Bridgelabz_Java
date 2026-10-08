package dataStructure.linkedList;

/**
 * Problem 8: Undo/Redo Functionality for Text Editor
 *
 * Demonstrates a doubly linked list for maintaining
 * text editor history.
 *
 * Operations:
 * - Add new text state
 * - Undo
 * - Redo
 * - Display current state
 * - Limit history to 10 states
 *
 * Author : Mithun
 * Date : 08-10-2026
 */
public class UndoRedoTextEditor {

    // Node representing a text state
    static class TextState {
        private String text;
        private TextState previous;
        private TextState next;

        TextState(String text) {
            this.text = text;
        }
    }

    private TextState head;
    private TextState tail;
    private TextState current;

    private int historySize;
    private static final int MAX_HISTORY = 10;

    // Add a new text state
    public void addState(String text) {

        TextState newState =
                new TextState(text);

        if (head == null) {

            head = tail = current = newState;
            historySize = 1;
            return;
        }

        // Remove redo states
        current.next = null;
        tail = current;

        newState.previous = current;
        current.next = newState;

        current = newState;
        tail = newState;

        historySize++;

        // Maintain maximum history size
        if (historySize > MAX_HISTORY) {

            head = head.next;
            head.previous = null;

            historySize--;
        }
    }

    // Undo operation
    public void undo() {

        if (current != null
                && current.previous != null) {

            current = current.previous;

        } else {

            System.out.println(
                    "Nothing to undo."
            );
        }
    }

    // Redo operation
    public void redo() {

        if (current != null
                && current.next != null) {

            current = current.next;

        } else {

            System.out.println(
                    "Nothing to redo."
            );
        }
    }

    // Display current text
    public void displayCurrentState() {

        if (current == null) {

            System.out.println(
                    "Editor is empty."
            );

            return;
        }

        System.out.println(
                "Current Text: "
                        + current.text
        );
    }

    // Display history
    public void displayHistory() {

        TextState state = head;

        while (state != null) {

            System.out.println(
                    state.text
            );

            state = state.next;
        }
    }

    public static void main(String[] args) {

        UndoRedoTextEditor editor =
                new UndoRedoTextEditor();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState(
                "Hello World Java"
        );

        System.out.println(
                "Current State:"
        );

        editor.displayCurrentState();

        System.out.println(
                "\nAfter Undo:"
        );

        editor.undo();
        editor.displayCurrentState();

        System.out.println(
                "\nAfter Redo:"
        );

        editor.redo();
        editor.displayCurrentState();

        System.out.println(
                "\nHistory:"
        );

        editor.displayHistory();
    }
}