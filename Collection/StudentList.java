package Collection;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentArrayList;

    public StudentList() {
        this.studentArrayList = new ArrayList<Student>();
    }

    public StudentList(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }

    public void addStudent(Student student) {
        this.studentArrayList.add(student);
    }

    public void removeStudent(String id) {
        Student student = null;
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getId().equals(id)) {
                student = studentArrayList.get(i);
                break;
            }
        }
        if (student != null) {
            studentArrayList.indexOf(student);
        } else {
            System.out.println("Ko tồn tại sinh viên có id " + id);
        }
    }

    public boolean checkExistence(Student student) {
        return this.studentArrayList.contains(student);
    }

    public void printListStudent() {
        for (Student student : studentArrayList) {
            System.out.println(student);
        }
    }

    public void printStudentHighScore() {
        for (Student student : studentArrayList) {
            if (student.sumScore() >= 20 && student.getMathScore() > 8) {
                System.out.println(student);
            }
        }
    }
}
