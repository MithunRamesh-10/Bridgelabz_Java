package dataStructure.linkedList;

/**
 * Problem 3: Task Scheduler
 *
 * Demonstrates circular linked list operations
 * for scheduling tasks.
 *
 * Operations:
 * - Add at beginning
 * - Add at end
 * - Add at specific position
 * - Remove by Task ID
 * - View current task
 * - Move to next task
 * - Display tasks
 * - Search by priority
 *
 * Author : Mithun
 * Date : 08-10-2026
 */
public class TaskScheduler {

    // Node class representing a task
    static class Task {
        private int taskId;
        private String taskName;
        private int priority;
        private String dueDate;
        private Task next;

        Task(int taskId, String taskName,
             int priority, String dueDate) {

            this.taskId = taskId;
            this.taskName = taskName;
            this.priority = priority;
            this.dueDate = dueDate;
        }
    }

    private Task head;
    private Task tail;
    private Task current;

    // Add at beginning
    public void addAtBeginning(int taskId,
                               String taskName,
                               int priority,
                               String dueDate) {

        Task newTask =
                new Task(
                        taskId,
                        taskName,
                        priority,
                        dueDate
                );

        if (head == null) {
            head = tail = current = newTask;
            tail.next = head;
            return;
        }

        newTask.next = head;
        head = newTask;
        tail.next = head;
    }

    // Add at end
    public void addAtEnd(int taskId,
                         String taskName,
                         int priority,
                         String dueDate) {

        Task newTask =
                new Task(
                        taskId,
                        taskName,
                        priority,
                        dueDate
                );

        if (head == null) {
            head = tail = current = newTask;
            tail.next = head;
            return;
        }

        tail.next = newTask;
        tail = newTask;
        tail.next = head;
    }

    // Add at specific position
    public void addAtPosition(int position,
                              int taskId,
                              String taskName,
                              int priority,
                              String dueDate) {

        if (position <= 1) {
            addAtBeginning(
                    taskId, taskName, priority, dueDate
            );
            return;
        }

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Task currentTask = head;

        for (int i = 1; i < position - 1; i++) {

            currentTask = currentTask.next;

            if (currentTask == head) {
                System.out.println("Invalid position.");
                return;
            }
        }

        Task newTask =
                new Task(
                        taskId,
                        taskName,
                        priority,
                        dueDate
                );

        newTask.next = currentTask.next;
        currentTask.next = newTask;

        if (currentTask == tail) {
            tail = newTask;
        }

        tail.next = head;
    }

    // Remove task by Task ID
    public void removeByTaskId(int taskId) {

        if (head == null) {
            return;
        }

        if (head.taskId == taskId) {

            if (head == tail) {
                head = tail = current = null;
                return;
            }

            head = head.next;
            tail.next = head;

            if (current.taskId == taskId) {
                current = head;
            }

            return;
        }

        Task previous = head;
        Task node = head.next;

        while (node != head) {

            if (node.taskId == taskId) {

                previous.next = node.next;

                if (node == tail) {
                    tail = previous;
                }

                tail.next = head;

                if (current == node) {
                    current = node.next;
                }

                return;
            }

            previous = node;
            node = node.next;
        }
    }

    // View current task
    public void viewCurrentTask() {

        if (current == null) {
            System.out.println("No current task.");
            return;
        }

        displayTask(current);
    }

    // Move to next task
    public void moveToNextTask() {

        if (current != null) {
            current = current.next;
        }
    }

    // Display all tasks
    public void display() {

        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Task currentTask = head;

        do {
            displayTask(currentTask);
            currentTask = currentTask.next;
        } while (currentTask != head);
    }

    // Search by priority
    public void searchByPriority(int priority) {

        if (head == null) {
            return;
        }

        Task currentTask = head;

        do {

            if (currentTask.priority == priority) {
                displayTask(currentTask);
            }

            currentTask = currentTask.next;

        } while (currentTask != head);
    }

    private void displayTask(Task task) {

        System.out.println(
                "Task ID: " + task.taskId +
                        ", Name: " + task.taskName +
                        ", Priority: " + task.priority +
                        ", Due Date: " + task.dueDate
        );
    }

    public static void main(String[] args) {

        TaskScheduler scheduler =
                new TaskScheduler();

        scheduler.addAtBeginning(
                101, "Study", 1, "08-10-2026"
        );

        scheduler.addAtEnd(
                102, "Coding", 2, "09-10-2026"
        );

        scheduler.addAtPosition(
                2, 103, "Revision", 1, "10-10-2026"
        );

        System.out.println("All Tasks:");
        scheduler.display();

        System.out.println("Current Task:");
        scheduler.viewCurrentTask();

        scheduler.moveToNextTask();

        System.out.println("Next Task:");
        scheduler.viewCurrentTask();

        System.out.println("Priority 1 Tasks:");
        scheduler.searchByPriority(1);
    }
}