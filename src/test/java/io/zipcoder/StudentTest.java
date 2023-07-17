package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    private Student s1;
    private Student s2;
   // private ArrayList<Double> arrayList ;
    @Before
    public void setUp() {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(100.0, 50.0, 25.0));
        ArrayList<Double> arrayList2 = new ArrayList<>();
        arrayList.addAll(Arrays.asList(15.0, 30.0, 45.0));

        s1 = new Student("name1","lastName1",arrayList);
        s2 = new Student("name2","lastName2",arrayList2);
    }

    @Test

    public void testFirstName ()  {

        String exeptedFirstName = "name";

        s1.setFirstName(exeptedFirstName);

        String actualFirstName = s1.getStudentName();

        Assert.assertEquals(exeptedFirstName,actualFirstName);
    }
    @Test
    public void testLastName () {
        String expected = "lastName1";

        s1.setFirstName(expected);

        String actual = s1.getLastName();
        Assert.assertEquals(expected,actual);
    }


//    @Test
//    public void testNumberOfTakingExams () {
//
//        arrayList.add(100.0);
//        arrayList.add(50.0);
//        arrayList.add(25.0);
//        Student s3 = new Student("name1","lastName1",arrayList);
//        Integer expected = s3.getNumberOfExamTaken();
//        Integer actual = arrayList.size();
//        Assert.assertEquals(expected,actual);
//    }



    @Test
    public void testAddExamScore (){
        Classroom classroom = new Classroom();
        ArrayList expected = null;
        expected.add(0,s1);
        expected.add(1,s2);
        Student[] newArrayLIst = classroom.getStudents();
        Assert.assertEquals(expected,newArrayLIst);

    }

    @Test
    public void testAverageExamScoreOfStudent () {

        Double expected = s1.getAverageExamScoreOfStudent();
        Double actual = 58.333333333333336;
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testAddtExamScore (){
        //s1.addExamScore(4,55.0);
       // Assert.assertEquals(s1.getExamScore(),s1.setExamScore(4,55.0);;
        s1.setExamScore(3, 55.0);
        double expectedScore = 55.0;
        double actualScore = s1.examScore.get(3); // Assuming index 3 corresponds to exam number 4
        Assert.assertEquals(expectedScore, actualScore, 0.001);
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
        String expected =

                            " Exam Scores: \n" +
                          "  \tExam 1 -> 100 \n" +
                          "  \tExam 2 -> 95 \n" +
                          "  \tExam 3 -> 123 \n" +
                          "  \tExam 4 -> 96";
        // Then
        Assert.assertEquals(expected,actual);
    }







}
