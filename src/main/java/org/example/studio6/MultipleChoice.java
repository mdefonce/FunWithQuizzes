package org.example.studio6;

import java.util.ArrayList;

public class MultipleChoice extends Question {

    public MultipleChoice(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        String correctAnswer = this.getAnswer();
        if(answer.toLowerCase().equals(correctAnswer.toLowerCase())) {
            return true;
        } else {return false;}
    }

//    private ArrayList<String> answer;
//    private ArrayList<String> correctAnswer;

//    public MultipleChoice(String question, int points, ArrayList answer) {
//        super(question, points);
//        this.answer = answer;
//    }
//    public ArrayList<String> getAnswer() {
//        return answer;
//    }
//    public ArrayList<String> getCorrectAnswer() {
//        return correctAnswer;
//    }

}
