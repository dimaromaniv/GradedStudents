package io.zipcoder;

import java.util.ArrayList;

public class Student {

    String firstName;
    String lastName;
    ArrayList <Double> examScore;

    public Student (String firstName , String lastName , ArrayList testScore){
        this.firstName  = firstName;
        this.lastName = lastName;
        this.examScore = testScore;
    }

    public void setFirstName ( String firstName) {
        this.firstName = firstName;
    }
    public String getStudentName () {
        return firstName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public Integer getNumberOfExamTaken () {
        return examScore.size();
    }



    public String getExamScore() {
        StringBuilder examScoreBuilder = new StringBuilder();
            examScoreBuilder.append("Exam Scores:\n");
        for (int i = 0; i < examScore.size(); i++) {
//            double round = Math.round(examScore.get(i));

            examScoreBuilder.append(String.format("\tExam %d -> %.2f\n", i + 1, examScore.get(i)));
        }

        return  examScoreBuilder.toString();
    }



    public void addExamScore (int examNumber , double newScore) {

        this.examScore.add(examNumber,newScore);
    }

    public double getAverageExamScoreOfStudent () {
        double sum = 0.0;
        for (int i = 0; i < examScore.size(); i++ ) {
            sum += examScore.get(i);
        }
        return sum / examScore.size();
    }

    public Double setExamScore(int examNumber, double newScore) {
        return examScore.set(examNumber - 1,newScore );

    }


    @Override
    public String toString() {
        return "Student name " + firstName + " " + lastName + "\n"+
                "> Average Score " + getAverageExamScoreOfStudent() + "\n" + "\n" +
                "> Exam Scores : \n " + getExamScore();
    }



}
