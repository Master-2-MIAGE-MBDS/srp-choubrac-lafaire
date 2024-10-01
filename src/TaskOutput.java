import java.util.List;

public class TaskOutput {
    public void generateReport(TaskManager taskManager) {
        List<Task> completedTasks = taskManager.getCompletedTasks();
        List<Task> pendingTasks = taskManager.getPendingTasks();

        System.out.println("Completed Tasks:");
        for (Task task : completedTasks) {
            System.out.println(task.getTitle() + ": " + task.getDescription());
        }

        System.out.println("\nPending Tasks:");
        for (Task task : pendingTasks) {
            System.out.println(task.getTitle() + ": " + task.getDescription());
        }
    }
}