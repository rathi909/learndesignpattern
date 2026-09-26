package creational1;


public class Student implements Cloneable{

    private String name;
    private  String rollno;
    private String  age;

    public Student(Builder builder)
    {
        this.name = builder.name;
        this.age = builder.age;
        this.rollno = builder.rollno;
    }


    public static class Builder {
        private String name;
        private String rollno;
        private String  age;

        public Builder(String name) {
            this.name = name;
        }
        public Builder name(String name)
        {
            this.name =name;
            return this;
        }
        public Builder age(String age)
        {
            this.age =age;
            return this;
        }

        public  Builder rollno(String rollno)
        {
            this.rollno = rollno;
            return this;
        }

        public Student build(){
          return new Student(this);
        }
    }
}
