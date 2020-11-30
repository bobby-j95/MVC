//Employee Controller

public class EmployeeController {
    Employee employee;
    void setEmployeeName(Employee employee, String name){
        employee.setName(name);
    }
    String getEmployeeName(Employee employee){
        return employee.getName();
    }
    void setEmployeeNumber(Employee employee, Integer number){
        employee.setNumber(number);
    }
    String getEmployeeNumber(Employee employee){
        return employee.getNumber();
    }
    void setEmployeeJobTitle(Employee employee, String jobTitle){
        employee.setJobTitle(jobTitle);
    }
    String getEmployeeJobTitle(Employee employee){
        return employee.getJobTitle();
    }
    void setEmployeeSalary(Employee employee, Integer salary){
        employee.setSalary(salary);
    }
    String getEmployeeSalary(Employee employee){
        return employee.getSalary();
    }
}

//Employee.java

public class Employee{
    String name = null;
    Integer number = 0;
    String jobTitle = null;
    Integer salary = 0;
    ArrayList observers = new ArrayList<Observer>;

    getName(){
        return name;
    }

    setName(String name){
        this.name = name;
    }

    getNumber(){
        return number;
    }

    setNumber(Integer number){
        this.number = number;
    }

    setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    getJobTitle(){
        return jobTitle;
    }

    setSalary(Integer salary){
        this.salary = salary;
    }

    getSalary(){
        return salary;
    }

    notifyObservers(){
        //calls for observers
    }
}

//EmployeeView.java

public class EmployeeView(){
    displayEmployeeInfo(){
        //returns the employee info
    }
}
