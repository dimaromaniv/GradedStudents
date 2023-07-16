package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {


    @Test

    public void testFirstName ()  {

        ArrayList<Double> arrayList = new ArrayList<>();

        arrayList.add(100.0);
        arrayList.add(50.0);
        arrayList.add(25.0);

        Student student = new Student("name","lastName",  arrayList);

        String exeptedFirstName = "name";
        student.setFirstName(exeptedFirstName);

        String actualFirstName = student.getStudentName();

        Assert.assertEquals(exeptedFirstName,actualFirstName);


    }
    @Test
    public void testGetExamScores () {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<Double>() ;
        //100.0, 95.0, 123.0, 96.0
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add(123.0);
        examScores.add(96.0);
        Student student = new Student(firstName, lastName, examScores);

        // When
        String actual = student.getExamScore();
        String expected = " Exam Scores:\n" +
                " \tExam 1 -> 100\n" +
                " \tExam 2 -> 95\n" +
                " \tExam 3 -> 123\n" +
                " \tExam 4 -> 96";
        // Then
        Assert.assertEquals(expected,actual);
    }







}
