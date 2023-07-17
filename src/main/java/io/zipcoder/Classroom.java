package io.zipcoder;
import org.junit.Assert;

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

        double sum = 0.0 ;
        for (int i = 0 ; i < students.length ; i++) {
            sum += students[i].getAverageExamScoreOfStudent();
        }
        return sum / students.length;
    }

    public void addStudent (Student student) {
        Student [] arr = new Student[students.length + 1];

        for (int i = 0 ; i < students.length ; i++) {
            arr[i] = students[i];
        }
        arr[students.length] = student;
        students = arr;
    }


    public void removeStudent(String firsName , String lastName) {
        ArrayList<Student> arrOfStudents = new ArrayList<>(students.length);

        for (int i = 0 ; i < arrOfStudents.size() ; i++) {
            Student student = arrOfStudents.get(i);
            String stname = student.getStudentName();
            String stlastname = student.getLastName();
            if (stname.equals(firsName) && stlastname.equals(lastName)) {
                arrOfStudents.remove(i);
            }
            arrOfStudents.add(null);
        }
    }

    public Student[] getStudentsByScore() {
        ArrayList <Student> arrOfStudents = new ArrayList<>(Arrays.asList(students));

        Collections.sort(arrOfStudents, new Comparator<Student>() {
            public int compare (Student s1 ,Student s2) {
                int scoreCompration = Double.compare(s2.getAverageExamScoreOfStudent(),s1.getAverageExamScoreOfStudent());
                if (scoreCompration != 0) {
                    return scoreCompration;
                }
                else {
                    return s1.getLastName().compareTo(s2.getLastName());
                }
            }
        });
        return arrOfStudents.toArray(new Student[0]);
    }




    }
