package collection_project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskList {

    private List<Task> listOfTasks = new ArrayList<>();
    private LinkedList<Task> highPriorityTasks = new LinkedList<>();
    private List<Task> completedTasks = new Stack<>();
   
    //Add task to the list
    public void addTask(Task task){

        listOfTasks.add(task);
        if("High".equalsIgnoreCase(task.getPriority())){
            highPriorityTasks.add(task);
        }
    }

    public void completeTaskManually(){

        // if(!listOfTasks.isEmpty()){
        //     System.out.println("List of All Tasks: ");
        //     listOfTasks.forEach(System.out::println);
        // }
        Task taskObj = highPriorityTasks.poll();
        if(taskObj != null){
            taskObj.setStatus("COMPLETED");
            completedTasks.add(taskObj); //Add the task to completed list - Stack
            highPriorityTasks.remove(taskObj); //Remove the task from high priority list

            // System.out.println("List of All Tasks after completion: ");
            // listOfTasks.forEach(System.out::println);
        }
    }

    //View all tasks
    public void viewAllCompletedTasks(){
        System.out.println("List of All Tasks after completion: ");
        if(!completedTasks.isEmpty()){
            System.out.println("Completed Tasks: ");
            completedTasks.forEach(System.out::println);
        }
    }

    public void markAsCompleteByID(int id){

        listOfTasks.stream().filter(task -> task.getId() == id).forEach(task -> {
            task.setStatus("COMPLETED");
            task.setPriority("Low");
            completedTasks.add(task);
            highPriorityTasks.remove(task);
        });
    }

    public void tasksList(){
        listOfTasks.forEach(System.out::println);
    }

     public void printHighSalaryTasks() {
         List<Task> highSalary = listOfTasks.stream().filter(task -> task.getSalary() > 50000).collect(Collectors.toList());
         System.out.println("High Salary Tasks: ");
         highSalary.forEach(System.out::println);
     }

     
     
     public void highestSalary(){

        Optional<Task> task = listOfTasks.stream().max(Comparator.comparingDouble(Task::getSalary));
        if(task.isPresent()){
            System.out.println("Highest Salary Task: " + task.get());
        }

        listOfTasks.stream().max((t1, t2) -> t1.getSalary() - t2.getSalary()).ifPresent(System.out::println);
     }

    public void financeDepEmployees(String dep) {
        
       List<String> names = listOfTasks.stream().filter(task -> task.getDepartment().equalsIgnoreCase(dep)).
                                    map(Task::getName).collect(Collectors.toList());

                names.forEach(System.out::println);
    }

    //count number of employees in a department

    public void employeeCount(String dep){
        
        long count = listOfTasks.stream().filter(task -> task.getDepartment().equalsIgnoreCase(dep)).count();
        System.out.println("Number of Employees in " + dep + " Department: " + count);

        listOfTasks.stream().collect(Collectors.groupingBy(Task::getDepartment, Collectors.counting()))
                                    .forEach((x, y) -> System.out.println("Department: "+x +"Count: " + y));
        
    }


     
}
