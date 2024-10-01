// Main.java
public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        TaskOutput reportGenerator = new TaskOutput();

        Task task1 = new Task("Tache 1", "Description de la tache 1");
        Task task2 = new Task("Tache 2", "Description de la tache 2");

        taskManager.addTask(task1);
        taskManager.addTask(task2);

        taskManager.markTaskAsCompleted("Tache 1");

        reportGenerator.generateReport(taskManager);
    }
}