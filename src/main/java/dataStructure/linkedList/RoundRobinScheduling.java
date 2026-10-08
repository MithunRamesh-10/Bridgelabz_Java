package dataStructure.linkedList;

/**
 * Problem 6: Round Robin Scheduling Algorithm
 *
 * Demonstrates a circular linked list implementation
 * of the Round Robin CPU scheduling algorithm.
 *
 * Operations:
 * - Add process
 * - Execute using fixed time quantum
 * - Remove process after execution
 * - Display circular queue after each round
 * - Calculate average waiting time
 * - Calculate average turnaround time
 *
 * Author : Mithun
 * Date : 08-10-2026
 */
public class RoundRobinScheduling {

    // Node class representing a process
    static class Process {
        private int processId;
        private int burstTime;
        private int remainingTime;
        private int priority;

        private int waitingTime;
        private int turnaroundTime;

        private Process next;

        Process(int processId,
                int burstTime,
                int priority) {

            this.processId = processId;
            this.burstTime = burstTime;
            this.remainingTime = burstTime;
            this.priority = priority;
        }
    }

    private Process head;
    private Process tail;

    private int completedProcesses;
    private double totalWaitingTime;
    private double totalTurnaroundTime;

    // Add process at end
    public void addProcess(int processId,
                           int burstTime,
                           int priority) {

        Process newProcess =
                new Process(
                        processId,
                        burstTime,
                        priority
                );

        if (head == null) {
            head = tail = newProcess;
            tail.next = head;
            return;
        }

        tail.next = newProcess;
        tail = newProcess;
        tail.next = head;
    }

    // Execute Round Robin scheduling
    public void execute(int timeQuantum) {

        if (head == null) {
            System.out.println("No processes available.");
            return;
        }

        int currentTime = 0;
        Process current = head;
        Process previous = tail;

        while (head != null) {

            int executionTime =
                    Math.min(
                            timeQuantum,
                            current.remainingTime
                    );

            current.remainingTime -= executionTime;
            currentTime += executionTime;

            if (current.remainingTime == 0) {

                current.turnaroundTime = currentTime;

                current.waitingTime =
                        current.turnaroundTime
                                - current.burstTime;

                totalWaitingTime +=
                        current.waitingTime;

                totalTurnaroundTime +=
                        current.turnaroundTime;

                completedProcesses++;

                Process nextProcess =
                        current.next;

                removeProcess(
                        current,
                        previous
                );

                if (head == null) {
                    break;
                }

                current = nextProcess;
                previous = findPrevious(current);

            } else {

                previous = current;
                current = current.next;
            }

            System.out.println(
                    "\nProcesses after round:"
            );

            display();
        }

        displayAverages();
    }

    // Remove a process from circular list
    private void removeProcess(Process process,
                               Process previous) {

        if (process == head
                && process == tail) {

            head = tail = null;
            return;
        }

        if (process == head) {

            head = head.next;
            tail.next = head;
            return;
        }

        previous.next = process.next;

        if (process == tail) {
            tail = previous;
            tail.next = head;
        }
    }

    // Find previous node
    private Process findPrevious(Process target) {

        if (head == null || target == head) {
            return tail;
        }

        Process current = head;

        while (current.next != target) {
            current = current.next;
        }

        return current;
    }

    // Display circular queue
    public void display() {

        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Process current = head;

        do {

            System.out.println(
                    "Process ID: " + current.processId +
                            ", Burst Time: " + current.burstTime +
                            ", Remaining Time: "
                            + current.remainingTime +
                            ", Priority: " + current.priority
            );

            current = current.next;

        } while (current != head);
    }

    // Display averages
    private void displayAverages() {

        if (completedProcesses == 0) {
            return;
        }

        System.out.println(
                "\nAverage Waiting Time: "
                        + totalWaitingTime
                        / completedProcesses
        );

        System.out.println(
                "Average Turnaround Time: "
                        + totalTurnaroundTime
                        / completedProcesses
        );
    }

    public static void main(String[] args) {

        RoundRobinScheduling scheduler =
                new RoundRobinScheduling();

        scheduler.addProcess(1, 5, 1);
        scheduler.addProcess(2, 4, 2);
        scheduler.addProcess(3, 6, 1);

        System.out.println("Initial Processes:");
        scheduler.display();

        System.out.println(
                "\nRound Robin Execution:"
        );

        scheduler.execute(2);
    }
}