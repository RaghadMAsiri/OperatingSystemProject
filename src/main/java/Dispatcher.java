
public class Dispatcher {
    // Save the state of the current process before switching

    public void saveState(Process process) {
        System.out.println("[Dispatcher] Saving state of process PID: " + process.getPid()
                + " | Remaining Time: " + process.getRemainingTime()
                + " | Status: " + process.getStatus());
        process.setStatus("Ready"); // Set status back to Ready after saving
    }

    // Load the state of the next process to be executed
    public void loadState(Process process) {
        System.out.println("[Dispatcher] Loading state of process PID: " + process.getPid()
                + " | Arrival Time: " + process.getArrivalTime()
                + " | Status: " + process.getStatus());
        process.setStatus("Running"); // Set status to Running
    }

    // Perform a full context switch from one process to another
    public void contextSwitch(Process from, Process to) {
        System.out.println("---- Context Switch ----");

        if (from != null) {
            saveState(from);
        }

        if (to != null) {
            loadState(to);
        }

        System.out.println("------------------------\n");
    }

}
