package io.zipcoder;
import java.util.Comparator;

import java.util.*;

public class Classroom {
    Student [] students;


    public Classroom( int maxNumberOfStudent) {
        this.students = new Student[maxNumberOfStudent];
    }

    public Classroom(Student [] students) {
        this.students = students;
    }


    public Classroom () {
        this.students = new Student[30];

    }

    public Student[] getStudents () {
        return students;
    }

    public Double getAverageExamScore () {

        Double sum = 0.0;

        for (int i = 0 ; i <  this.students.length ; i++ ) {
            sum += students[i].getAverageExamScoreOfStudent();

        }
        return  sum / this.students.length;
    }

    public void addStudent (Student student) {
        Student[] arrOfStudents = new Student[students.length + 1 ];
        for (int i = 0 ; i < students.length; i++) {
            arrOfStudents[i] = students[i];
        }
        arrOfStudents[students.length] = student;
        students = arrOfStudents;
    }


    public void removeStudent(String firsName , String lastName) {
        ArrayList<Student> arrOfStudent = new ArrayList<>(students.length);

        for (int i = 0; i < arrOfStudent.size(); i++) {

            Student student = arrOfStudent.get(i);
            String stName = student.getStudentName();
            String slastName = student.getLastName();
            {
                if (stName.equals(firsName) && slastName.equals(lastName)) {
                    arrOfStudent.remove(student);
                }
            }
            arrOfStudent.add(null);
        }
        students = arrOfStudent.toArray(new Student[0]);
    }

    public Student[] getStudentsByScore() {
        ArrayList<Student> sortedStudents = new ArrayList<>(Arrays.asList(students));

        Collections.sort(sortedStudents, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                int scoreComparison = Double.compare(s2.getAverageExamScoreOfStudent(), s1.getAverageExamScoreOfStudent());
                if (scoreComparison != 0) {
                    return scoreComparison;
                } else {
                    return s1.getLastName().compareTo(s2.getLastName());
                }
            }
        });

        return sortedStudents.toArray(new Student[0]);
    }

}
