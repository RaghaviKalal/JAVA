import Package_Student.Package_Stud;
import Package_Faculty.PackageFaculty;

public class PackageStudent {

    public static void main(String[] args) {

        Package_Stud student = new Package_Stud();
        PackageFaculty faculty = new PackageFaculty();

        System.out.println("COLLEGE MANAGEMENT SYSTEM");
        System.out.println();

        student.displayStudent();

        System.out.println();

        faculty.displayFaculty();
    }
}