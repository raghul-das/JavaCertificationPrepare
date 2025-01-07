package collection_project;

public class Task {

    private int id;
    private String name;
    private String priority;
    private String status;
    private String salary;

    public Task(int id, String name, String priority, String status, String salary) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.status = status;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSalary(){
        return salary;
    }

    public void setSalary(String salary){
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Task ID: " + id + ", Task Name: " + name + ", Priority: " 
                + priority + ", Status: " + status + ", Salary: " + salary;
    }


}
