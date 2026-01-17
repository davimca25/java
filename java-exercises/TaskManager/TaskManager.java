import java.util.ArrayList;

public class TaskManager{

    private ArrayList<Task> tasks;

    TaskManager() {
        tasks = new ArrayList<>();

    }
    void addTask(Task task) {
        tasks.add(task);
    }
    void listTasks() {
        for (Task task : tasks) {
            System.out.println(task.displayInfo());

        }
    }
    void removeTask(String title) {
        for (int i = 0; i<tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getTitle().equals(title)) {
                tasks.remove(i);
                break;
            }
        }

    }
}
