public class Main {
    public static void main(String[] args) {

        Task task1 = new Task(1,"Estudar Java");
        Task task2 = new Task(2,"Estudar Linux");
        Task task3 = new Task(3,"Estudar Git");
        TaskManager manager = new TaskManager();

        //System.out.printf("Status: %b",task1.taskStatus());

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);

        task1.markAsCompleted();
        task2.markAsCompleted();

        manager.removeTask("Estudar Java");
        manager.removeTask("Estudar Git");
        manager.listTasks();
    }
}