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

    public String getExamScore () {
        StringBuilder examScor = new StringBuilder();
        for (int i = 0; i < this.examScore.size(); i++) {
            double roundInt = this.examScore.get(Math.round(i));
            examScor.append("   Exam " + (i + 1) + " -> " + (int)roundInt  + " \n ");
        }


        return " Exam Scores: \n  " + examScor;
    }
    public void addExamScore (int examNumber , double newScore) {
        this.examScore.set(examNumber,newScore);
    }

    public double getAverageExamScoreOfStudent () {
        double sum = 0.0 ;
        for (int i = 0 ; i < this.examScore.size() ;i++ ) {
            sum += this.examScore.get(i);
        }
        return sum / examScore.size();
    }

    public void setExamScore(int examNumber, double newScore) {
        if (examNumber >= 1 && examNumber <= examScore.size()) {
            examScore.set(examNumber - 1, newScore );
        }
    }


    @Override
    public String toString() {
        return "Student name " + firstName + " " + lastName + "\n"+
                "> Average Score " + getAverageExamScoreOfStudent() + "\n" + "\n" +
                "> Exam Scores : \n " + getExamScore();
    }



}
