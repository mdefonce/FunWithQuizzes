package org.example.studio6;

public class QuizRunner {
    public static void main(String[] args) {

        Quiz myQuiz = new Quiz();

        MultipleChoice myMultiChoiceQuestion = new MultipleChoice("Which of the following are primary colors?\n\nA) Red\nB) Blue\nC) Green\nD) Yellow", "A, B, D");
        myQuiz.addQuestion(myMultiChoiceQuestion);
        Checkbox myCheckBoxQuestion = new Checkbox("What is the capital of France?", "Paris");
        myQuiz.addQuestion(myCheckBoxQuestion);
        TrueFalse myTrueFalseQuestion = new TrueFalse("True or False: The Great Wall of China is visible from space.", "False");
        myQuiz.addQuestion(myTrueFalseQuestion);
        ShortAnswerQuestion myShortAnswerQuestion = new ShortAnswerQuestion("Kangaroos are from which country?", "Australia");
        myQuiz.addQuestion(myShortAnswerQuestion);

        myQuiz.runQuiz();

    }
}
