package collection_project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
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


}
