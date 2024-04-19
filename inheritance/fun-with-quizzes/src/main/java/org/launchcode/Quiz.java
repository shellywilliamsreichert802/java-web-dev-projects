package org.launchcode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Quiz class
class Quiz {
    private List<Question> questions = new ArrayList<>();

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        int score = 0;
        for (Question question : questions) {
            question.displayQuestion();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + question.checkAnswer() + "\n");
            }
        }
        System.out.println("Your score: " + score + "/" + questions.size());
    }

    public static void main(String[] args) {
        // Example usage
        Quiz quiz = new Quiz();
        quiz.addQuestion(new MultipleChoiceQuestion("What is the capital of France?", "Paris",
                new String[]{"London", "Paris", "Berlin"}));
        quiz.addQuestion(new TrueFalseQuestion("Java is an object-oriented language.", "true"));
        quiz.runQuiz();
    }
}