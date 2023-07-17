package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ClassroomTest {
    private Student s1;
    private Student s2;
    private Student s5;
    private Student s6;
    private Student s7;
    private Student s8;


    @Before
    public void setUp() {
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(50.00);
        ArrayList<Double> examScores2 = new ArrayList<>();
        examScores2.add(100.0);
        ArrayList<Double> examScores5 = new ArrayList<>();
        examScores.add(69.00);
        ArrayList<Double> examScores6 = new ArrayList<>();
        examScores.add(13.00);
        ArrayList<Double> examScores7 = new ArrayList<>();
        examScores.add(99.00);
        ArrayList<Double> examScores8 = new ArrayList<>();
        examScores.add(59.00);

        s1 = new Student("one", "one",examScores);
        s2 = new Student("two", "two", examScores2);
        s5 = new Student("five", "five", examScores5);
        s6 = new Student("six", "six", examScores6);
        s7 = new Student("seven", "seven", examScores7);
        s8 = new Student("eight", "eight", examScores8);
    }
    // : Given
//    String firstName = "Leon";
//    String lastName = "Hunter";
//    ArrayList examScoress = {100.0, 95.0, 123.0, 96.0};
//    Student student = new Student(firstName, lastName, examScoress);
//
//    @Test
//    public String testExamScore (String firstName , String lastName ,ArrayList examScore) {
//    }



    @Test
    public void testGetStudentsByScore() {
        // Given: expected Student Array and classroom
        Classroom classroom = new Classroom(new Student[]{s1, s2});
        Student[] expectedStudents = new Student[]{s2, s1};

        // When: getting students sorted by their scores
        Student[] actualStudents = classroom.getStudentsByScore();


        // Then: equivalent arrays!
        Assert.assertEquals(expectedStudents, actualStudents);
    }

    @Test

    public void testGetStudentsByScore1() {
        // Given: expected Student Array and classroom
        // Student s1 = new Student("one", "owo", new Double[]{100.0});
        // Student s2 = new Student("two", "one", new Double[]{100.0});
        Classroom c = new Classroom(new Student[]{s1, s2});
        Student[] expectedStudents = new Student[]{s2, s1};

        // When: getting students sorted by their scores
        Student[] actualStudents = c.getStudentsByScore();

        // Then: equivalent arrays!
        Assert.assertEquals(expectedStudents, actualStudents);
    }

    @Test
    public void testGetStudentsByScore3() {

        // Given: their classroom
        Classroom c = new Classroom(new Student[]{s1, s2, s5, s6, s7, s8});

        // Given: expected ranking array
        Student[] expectedArray = new Student[]{s7, s1,  s5, s8,  s2, s6};

        // When: getting the mappings
        Student[] actualArray = c.getStudentsByScore();

        // Then: equivalent maps?
        Assert.assertEquals(expectedArray, actualArray);
    }


}
