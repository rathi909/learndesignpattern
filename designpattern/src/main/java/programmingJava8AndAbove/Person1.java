package programmingJava8AndAbove;

public class Person1 {
    Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    String name;
    Double salary;
    Department department;

    public Person1(int i, String brian, double v, Department hr) {
        this.id =i;
        this.name = brian;
        this.salary =v;
        this.department =hr;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
