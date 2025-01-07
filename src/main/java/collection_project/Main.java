package collection_project;

public class Main {

    public static void main(String[] args) {
        
        Task task1 = new Task(1, "Raghul Das", "High", "Pending",45000, "IT");
        Task task2 = new Task(2, "John", "Low", "Pending", 50000, "HR");
        Task task3 = new Task(3, "Aadhya", "High", "Progress", 55000, "Finance");
        Task task4 = new Task(4, "Preethi", "Low", "New", 60000, "Admin");
        Task task5 = new Task(5, "Peter", "High", "Pending", 65000, "IT");
        Task task6 = new Task(6, "Patrick", "High", "Pending", 10000, "HR");
        Task task7 = new Task(7, "Aruna", "Medium", "Pending", 75000, "IT");
        Task task8 = new Task(8, "Thara", "Medium", "Pending", 85000, "Finance");

        TaskList taskList = new TaskList();
        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);
        taskList.addTask(task4);
        taskList.addTask(task5);
        taskList.addTask(task6);
        taskList.addTask(task7);
        taskList.addTask(task8);

        taskList.tasksList();
        // taskList.markAsCompleteByID(3);
        // taskList.completeTaskManually();
        // taskList.viewAllCompletedTasks();

        //taskList.printHighSalaryTasks();
        //taskList.highestSalary();
        taskList.financeDepEmployees("Finance");
        taskList.employeeCount("HR");

        
    }

}
