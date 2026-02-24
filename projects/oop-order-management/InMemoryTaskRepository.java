import java.util.ArrayList;
import java.util.List;
public class InMemoryTaskRepository implements TaskRepository {
    private ArrayList<Task> tasks;
    private int nextId = 1;

    InMemoryTaskRepository() {
        tasks = new ArrayList<>();
    }

    @Override
    public void addTask(String title) {
        Task task = new Task(nextId++,title);
        tasks.add(task);
    }

    @Override
    public List<Task> findAll() {
        return tasks;
    }

    @Override
    public boolean removeById(int id) {
        for (int i = 0; i<tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getId() == id) {
                tasks.remove(i);
                System.out.printf("Removed task ID: %d\n", id);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean completeById(int id) {
        for (int i = 0; i<tasks.size(); i++) {
            Task task = tasks.get(i);

            if (task.getId() == id) {
                task.markAsCompleted();
                System.out.printf("Task Completed ID: %d\n", id);
                return true;
            }
        }
        return false;
    }
}
