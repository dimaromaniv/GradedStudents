package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest {

    private Student s1;
    private Student s2;
   // private ArrayList<Double> arrayList ;
    @Before
    public void setUp() {
        ;ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(100.0, 50.0, 25.0));
        ArrayList<Double> arrayList2 = new ArrayList<>();
        arrayList2.addAll(Arrays.asList(15.0, 30.0, 45.0));

        s1 = new Student("name1","lastName1",arrayList);
        s2 = new Student("name2","lastName2",arrayList2);
    }

    @Test

    public void testSetFirstName ()  {

        String exeptedFirstName = "name";

        s1.setFirstName(exeptedFirstName);

        String actualFirstName = s1.getStudentName();

        Assert.assertEquals(exeptedFirstName,actualFirstName);
    }

    @Test
    public void testGetFirstName () {
        String expectedFitstName = "thisName";
        s1.setFirstName(expectedFitstName);
        Assert.assertEquals(expectedFitstName,s1.getStudentName());

    }
    @Test
    public void testSetLastName () {
        String expected = "lastName1";

        s1.setFirstName(expected);

        String actual = s1.getLastName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetLastName () {

        String expected = "lastName1";

        s1.setFirstName(expected);
        Assert.assertEquals(expected,s1.getLastName());

    }
    @Test
    public void testAddExamScore (){
        ArrayList arrgetScore = new ArrayList<>();
        arrgetScore.add(33.3);
        arrgetScore.add(44.5);

        Student st3 = new Student("StudentA", "LastNameB",arrgetScore);

        st3.addExamScore(2,55.0);
        double expectedScore = 55.0;
        double actualScore = st3.examScore.get(3-1); // Assuming index 3 corresponds to exam number 4
        Assert.assertEquals(expectedScore, actualScore, 0.001);

    }

    @Test

    public void  testAddExamScore3 () {
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(9.01);
        examScores.add(13.00);
        Student student1 = new Student("StudentA", "LastNameB", examScores);

        examScores.add(33.33);

        Double expected = 55.33;
        examScores.add(expected);
        Double actual = student1.setExamScore(5-1,expected);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testGetExamScores1() {
        // Given: no expected exam scores and regular Student

        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student("StudentA", "LastNameB", examScores);
        String noTestScores = " Exam Scores:\n ";

        // When: get exam scores of Student
        String actualExamScores = student.getExamScore();

        // Then: got no scores but the strings equal!
        Assert.assertEquals(noTestScores, actualExamScores);
    }

    @Test
    public void testAverageExamScoreOfStudent () {

        Double expected = s1.getAverageExamScoreOfStudent();
        Double actual = 58.333333333333336;
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void  testSetExamScore (){


        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(9.01);
        examScores.add(13.00);
        Student student1 = new Student("StudentA", "LastNameB", examScores);

        String expected = "Exam Scores:\n\tExam 1 -> 9.01\n\tExam 2 -> 13.00\n";
        String actual = student1.getExamScore();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void testGetNumberOfExamTaken () {

        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(9.01);
        examScores.add(13.00);
        examScores.add(33.33);

        Student student1 = new Student("StudentA", "LastNameB", examScores);

        Integer expected = 3 ;

        Integer actual = student1.getNumberOfExamTaken();
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
