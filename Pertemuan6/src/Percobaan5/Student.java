
package Percobaan5;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Student {

    public String id;
    public String name;

    public Student() {
        this.id = "";
        this.name = "";
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setData(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void display() {
        System.out.println("Student id is: " + id + " "
        +"and Student name is : "
                + name);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Id Student : " + id + "\nStudent name : " + name;
    }
}
