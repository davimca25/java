public class Task {

    private int id;
    private String title;

    private boolean completed = false;

    Task(int id, String title) {
        this.id = id;
        this.title = title;
    }
    void markAsCompleted() {
        completed = true;
    }
    String displayInfo() {
        return "Task: " + title + " | Completed: " + completed;
    }
    boolean taskStatus() {
        return completed;
    }
    String getTitle() {
        return title;
    }
}
