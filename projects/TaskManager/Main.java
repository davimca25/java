public class Main {
    public static void main(String[] args) {

        TaskManager manager1 = new TaskManager();

        manager1.addTask("Estudar java");
        manager1.addTask("Estudar git");
        manager1.addTask("Estudar linux");
        manager1.addTask("Estudar Cloud");

        manager1.removeTask("Estudar Cloud");

        manager1.removeTaskById(2);

        manager1.completeTaskById(3);

        manager1.listTasks();

    }
}