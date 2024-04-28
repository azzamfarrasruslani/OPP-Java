package Percobaan5;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class TestStudent {

    public static void main(String[] args) {
//        Deklarasi arrat of object
        Student[] arr = new Student[5];

// data student
        String dataStudent[][] = {
            {"1701289270", "Indah Rebana"},
            {"1701289219", "Bagas Prasad"},
            {"1801289219", "Cantik Pitaloka"},
            {"1901289210", "Lee Samson"},
            {"1901270219", "Hani Pratama"}
        };

        // Inisialisasi Array of object
        for (int i = 0; i < 5; i++) {
            arr[i] = new Student();
        }

        // Set nilai data student
        for (int i = 0; i < dataStudent.length; i++) {
            arr[i].setData(dataStudent[i][0], dataStudent[i][1]);
        }

        // Displaying the student data
        for (int i = 0; i < 3; i++) {
            System.out.println("Student data in student arr " + i + ": ");
            arr[i].display();
        }
        // displaying with toString method
        for (int i = 3; i < 5; i++) {
            System.out.println("Student data in student arr " + i + ": ");
            System.out.println(arr[i]);
            System.out.println();
        }
    }
}
