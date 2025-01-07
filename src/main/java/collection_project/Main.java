package collection_project;

public class Main {

    public static void main(String[] args) {
        
        Task task1 = new Task(1, "Raghul Das", "High", "Pending","45000");
        Task task2 = new Task(2, "John", "Low", "Pending", "50000");
        Task task3 = new Task(3, "Aadhya", "High", "Progress", "55000");
        Task task4 = new Task(4, "Preethi", "Low", "New", "60000");
        Task task5 = new Task(5, "Peter", "High", "Pending", "65000");

        TaskList taskList = new TaskList();
        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);
        taskList.addTask(task4);
        taskList.addTask(task5);

        taskList.tasksList();
        taskList.markAsCompleteByID( 3);
        taskList.completeTaskManually();
        taskList.viewAllCompletedTasks();
    }

}
