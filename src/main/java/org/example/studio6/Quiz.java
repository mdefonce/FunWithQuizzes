package org.example.studio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numOfCorrectQuestions = 0;
    private Scanner scanner = new Scanner(System.in);
    public Quiz() {

    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            String userAnswer = this.getUserAnswer();
            boolean userGotQuestionCorrect = question.checkAnswer(userAnswer);
            if (userGotQuestionCorrect) {
                this.numOfCorrectQuestions++;
            }
        }
        double grade = ((double) this.numOfCorrectQuestions / (double) this.questions.size()) * 100;
        System.out.println("User's grade: " + grade + "%");
    }

    private String getUserAnswer() {
        String userAnswer = scanner.nextLine().toLowerCase();
        return userAnswer;
    }


}
