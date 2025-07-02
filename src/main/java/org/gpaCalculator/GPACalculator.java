package org.gpaCalculator;

import java.util.List;

public class GPACalculator {
    public static float averageCalculator(List<Lesson> lessons){
        int scoreSum = 0;
        for(Lesson e : lessons){
            scoreSum += e.getScore();
        }
        return (float) scoreSum / lessons.size();
    }
}
