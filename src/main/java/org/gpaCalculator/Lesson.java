package org.gpaCalculator;

public class Lesson {
    private String name;
    private int score;

    public Lesson(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Lesson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
