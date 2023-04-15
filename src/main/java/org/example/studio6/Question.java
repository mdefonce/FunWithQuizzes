package org.example.studio6;

import java.awt.Checkbox;
import java.util.Scanner;

public abstract class Question {

    private final String question;
    private final String answer;
//    private int points;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {return this.question;}
    public String getAnswer() {return this.answer;}

    public abstract boolean checkAnswer(String answer);



//    public void printQuestion() {
//        System.out.println(question);
//    }
//
//    public abstract int getAnswer();
//    public abstract void printAnswer();
//
//    public int getPoints() {
//        return points;
//    }
//    public void setPoints(int points) {
//        this.points = points;
//    }

}
