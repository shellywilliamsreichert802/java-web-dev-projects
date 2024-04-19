package org.launchcode;

// Subclass for multiple-choice questions
class MultipleChoiceQuestion extends Question {
    private String[] choices;

    public MultipleChoiceQuestion(String text, String answer, String[] choices) {
        super(text, answer);
        this.choices = choices;
    }

    @Override
    public void displayQuestion() {
        super.displayQuestion();
        System.out.println("Choices:");
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
    }
}