//  inhertance using an exmple 
//  teacher class and student class which extends from it



public class wtaJava23 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setId(1);
        s1.setName("Rahul");
        s1.setAddress("India");
        s1.setMarks(90);
        s1.display(); 
        System.out.println();
        // student details
        System.out.println("The Student details ");

        System.out.println("id ="+s1.id);
        System.out.println("name ="+s1.name);
        System.out.println("address ="+s1.address);
        System.out.println("marks ="+s1.marks);
        System.out.println();

        
    }
    
}


class Teacher {
    int id;
    String name;
    float salary;
    String address;

    void setId(int id) {
        this.id = id;

    }

    void setName(String name) {
        this.name = name;
    }

    void setSalary(float salary) {
        this.salary = salary;
    }

    void setAddress(String address) {
        this.address = address;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    float getSalary() {
        return salary;
    }

    String getAddress() {
        return address;
    }

}

class Student extends Teacher {
    int marks;

    void setMarks(int marks) {

        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Address: " + address);
        System.out.println("Marks: " + marks);
    }

}
