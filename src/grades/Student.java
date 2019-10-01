package grades;

import java.util.ArrayList;

public class Student {
    private String name;

    private ArrayList<Integer> grades;

    public Student (String n) {
        this.name = n;
        this.grades = new ArrayList <Integer> ();
    }
    // returns the student's name
    public String getName(){
        return this.name;
    };

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);

    };
    // returns the average of the students grades
    public double getGradeAverage(){
        int temp = 0;
        for(Integer g: this.grades) {
            temp += g;
        }
        return (double) (temp / this.grades.size());
    };

    public static void main(String[] args) {
        Student jason = new Student ("Jason");


    }

}
