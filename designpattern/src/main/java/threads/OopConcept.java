package threads;

public class OopConcept {
    public static void main(String[] args) {

    }

    public void inheritence(){
        Dog a = new Dog();
        a.eat();
        a.bark();
    }


    class Student {
        public String getSchoolName() {
            return schoolName;
        }

        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }

        private String schoolName;

        Student(String schoolName) {
            this.schoolName = schoolName;
        }
    }


     class Animal {
        void eat(){
            System.out.println("Animal eat");
        }

    }

     class Dog extends Animal{
        void bark(){
            System.out.println("Bark ");
        }
    }

    abstract class Animal1 {
        abstract void  sound();
        void eat(){
            System.out.println("eat");
        }
    }
}
