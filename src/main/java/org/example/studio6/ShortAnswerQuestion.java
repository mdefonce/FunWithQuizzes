package org.example.studio6;

public class ShortAnswerQuestion extends Question{
    public ShortAnswerQuestion(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {

        if(answer.length() > 80) {
            System.out.println("Answer longer than 80 characters.");
            return false;
        }
        String correctAnswer = this.getAnswer();
        if (answer.toLowerCase().equals(correctAnswer.toLowerCase())) {
            return true;
        } else {return false;}
    }


}
