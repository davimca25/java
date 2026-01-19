import java.util.List;
public interface TaskRepository {

    void addTask(String title);

    List<Task> findAll();

    boolean removeById(int id);

    boolean completeById(int id);
}
