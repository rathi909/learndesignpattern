package behavioural;

public class Employee {
    private String name;
    private Integer id;
    private Integer salary;

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.id = age;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
// you have list of 100000 employee. give me ids of those employees whose name begin with "S"
