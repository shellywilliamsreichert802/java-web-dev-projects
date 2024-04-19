package org.launchcode;

// Subclass for true/false questions
class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String text, String answer) {
        super(text, answer);
    }

    @Override
    public void displayQuestion() {
        super.displayQuestion();
        System.out.println("True or False?");
    }
}
