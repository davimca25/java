import java.util.ArrayList;

public class TaskManager{

    private ArrayList<Task> tasks;
    private int nextId = 1;

    TaskManager() {
        tasks = new ArrayList<>();

    }
    void addTask(String title) {
        Task task = new Task(nextId++,title);
        tasks.add(task);
    }
    void listTasks() {
        for (Task task : tasks) {
            System.out.println(task.displayInfo());

        }
    }
    void removeTask(String title) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getTitle().equals(title)) {
                tasks.remove(i);
                System.out.println("Removed task " + task.getTitle());
                break;
            }
        }
    }
    void removeTaskById(int id) {
        for (int i = 0; i<tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getId() == id) {
                tasks.remove(i);
                System.out.printf("Removed task ID: %d\n", id);
                break;
            }
        }
    }
    void completeTaskById(int id) {
        for (int i = 0; i<tasks.size(); i++) {
            Task task = tasks.get(i);

            if (task.getId() == id) {
                task.markAsCompleted();
                System.out.printf("Task Completed ID: %d\n", id);
                break;
            }
        }
    }
}
