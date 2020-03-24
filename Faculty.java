import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String facultyName;
    List<Student> students;

    public Faculty() {
        facultyName = "";
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public double averageGrade(){
        return students.stream().mapToDouble(Student::getAverage).average().orElse(0);
    }
}
