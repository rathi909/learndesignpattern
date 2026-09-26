package programmingJava8AndAbove;

import java.util.Objects;

public class Department {
    Integer id;
    String name;

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

    public Department(int i, String hr) {
        this.id = i;
        this.name =hr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        Department department = (Department) obj;
        return Objects.equals(id, department.id);

    }



    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
