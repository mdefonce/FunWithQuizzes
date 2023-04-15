package org.example.studio6;

import java.util.Scanner;

public class TrueFalse extends Question{
    public TrueFalse(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        if(answer.toLowerCase().equals(this.getAnswer().toLowerCase())) {
            return true;
        } else {return false;}
    }

//    private boolean correctAnswer;
//    public TrueFalse(String question, int points, boolean correctAnswer) {
//        super(question, points);
//        this.correctAnswer = correctAnswer;
//    }
//    public boolean compareAnswers(boolean userAnswer) {
//        if(userAnswer = correctAnswer) {
//            return true;
//        } else {return false;}
//    }
//    @Override
//    public int getAnswer() {
//        Scanner answer = new Scanner(System.in);
//        System.out.println("Were we able to complete the studio?");
//        String userAnswer = answer.nextLine().toLowerCase();
//        boolean userAnswerBoolean = Boolean.valueOf(userAnswer);
//
//        if(compareAnswers(userAnswerBoolean)) {
//            return 1;
//        } else { return 0;}
//    }
//    @Override
//    public void printAnswer() {
//        System.out.println("True or False");
//    }

}
