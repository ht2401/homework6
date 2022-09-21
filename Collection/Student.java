package Collection;

import thuvien.SinhVien;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private String id;
    private String name;
    LocalDate dateOfBirth;
    private String className;
    private double mathScore;
    private double physicsScore;
    private double chemistryScore;

    public Student() {
    }

    public Student(String id, String name, LocalDate dateOfBirth, String className, double mathScore, double physicsScore, double chemistryScore) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.className = className;
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(double physicsScore) {
        this.physicsScore = physicsScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public String toString() {
        return "Sinh vien --- Id: " +this.id + ", name: " + this.name
                + ", ngay sinh: " + this.dateOfBirth + ", Lop: " + this.className + ", math score: " + this.mathScore
                + ", physical score: " + this.physicsScore + ", chemistry score: " + this.chemistryScore ;
    }

    public double sumScore() {
        return mathScore + physicsScore + chemistryScore;
    }

//     public int hashCode() {
//         return Objects.hash(chemistryScore, physicsScore, mathScore, name, id, className, dateOfBirth);
//     }

}
