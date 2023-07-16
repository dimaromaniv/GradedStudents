package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ClassroomTest {

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

        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(50.00);
        ArrayList<Double> examScores2 = new ArrayList<>();
        examScores2.add(100.0);
        Student s1 = new Student("one", "one",examScores);
        Student s2 = new Student("two", "two", examScores2);
        Classroom c = new Classroom(new Student[]{s1, s2});
        Student[] expectedStudents = new Student[]{s2, s1};

        // When: getting students sorted by their scores
        Student[] actualStudents = c.getStudentsByScore();

        // Then: equivalent arrays!
        Assert.assertEquals(expectedStudents, actualStudents);
    }
}
