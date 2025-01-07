package collection_project;

public class Task {

    private int id;
    private String name;
    private String priority;
    private String status;
    private int salary;
    private String department;

    public Task(int id, String name, String priority, String status, int salary, String department) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.status = status;
        this.salary = salary;
        this.department = department;
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

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String getDepartment(){
        return department;
    }   

    public void setDepartment(String department){
        this.department = department;
    }

    @Override
    public String toString(){
        return "Task ID: " + id + ", Task Name: " + name + ", Priority: " 
                + priority + ", Status: " + status + ", Salary: " + salary + ", Department: " + department;
    }


}
