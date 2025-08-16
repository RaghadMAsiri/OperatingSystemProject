
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Process p1 = new Process(1, 0, 5, 1);
        Process p2 = new Process(2, 2, 7, 2);
        Process p3 = new Process(3, 4, 3, 3);
        Process p4 = new Process(4, 5, 4, 1);
        Process p5 = new Process(5, 6, 6, 2);

        QueueLevel high = new QueueLevel(1, 2);   // High priority - RR with quantum 2
        QueueLevel medium = new QueueLevel(2, 4); // Medium priority - RR with quantum 4
        QueueLevel low = new QueueLevel(3, 6);    // Low priority - RR with quantum 6

        Process[] allProcesses = {p1, p2, p3, p4, p5};
        for (Process p : allProcesses) {
            switch (p.getPriorityLevel()) {
                case 1 ->
                    high.addProcess(p);
                case 2 ->
                    medium.addProcess(p);
                case 3 ->
                    low.addProcess(p);
            }
        }

        System.out.println("High Priority Queue:");
        for (Process p : high.getQueue()) {
            System.out.println(p);
        }

        System.out.println("\nMedium Priority Queue:");
        for (Process p : medium.getQueue()) {
            System.out.println(p);
        }

        System.out.println("\nLow Priority Queue:");
        for (Process p : low.getQueue()) {
            System.out.println(p);
        }

        Dispatcher dispatcher = new Dispatcher();
        System.out.println("\n--- Dispatcher Context Switches ---");
        dispatcher.contextSwitch(null, p1);
        dispatcher.contextSwitch(p1, p2);
        dispatcher.contextSwitch(p2, p3);

        Scheduler scheduler = new Scheduler();
        System.out.println("\n--- Running Multilevel Queue Scheduler ---");

        List<QueueLevel> queues = new ArrayList<>();
        queues.add(high);
        queues.add(medium);
        queues.add(low);

        scheduler.schedule(queues);

    }
}
