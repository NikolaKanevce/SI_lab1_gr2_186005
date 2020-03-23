import java.util.ArrayList;
import java.util.List;

class Student {
    String index;
    String firstName;
    String lastName;
    List<Integer> grades;

    public Student() {
        index = null;
        firstName = null;
        lastName = null;
        grades = new ArrayList<>();
    }

    //TODO constructor

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }


    //TODO seters & getters

    public double getAverage() {
        return grades.stream().mapToInt(s->s).average().orElse(0);
        //TODO
    }

    public int ECTSCredits() {
        return grades.stream().filter(s->s>5).mapToInt(s->6).sum();
        //TODO
    }
}


