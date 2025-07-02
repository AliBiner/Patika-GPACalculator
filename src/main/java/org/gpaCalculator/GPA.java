package org.gpaCalculator;

import java.util.ArrayList;
import java.util.List;

public class GPA {
    public static void main(String[] args){
        List<Lesson> lessonList = createLessons();
        lessonList = getLessonScoreOnConsole(lessonList);
        float averageScore = GPACalculator.averageCalculator(lessonList);
        String result = averageScore < 60 ? "Kaldı" : "Geçti";
        System.out.println(result);
    }

    public static List<Lesson> createLessons(){
        List<Lesson> lessonList = new ArrayList<>();
        lessonList.add(new Lesson("Matematik"));
        lessonList.add(new Lesson("Fizik"));
        lessonList.add(new Lesson("Kimya"));
        lessonList.add(new Lesson("Türkçe"));
        lessonList.add(new Lesson("Tarih"));
        lessonList.add(new Lesson("Müzik"));
        return lessonList;
    };

    public static List<Lesson> getLessonScoreOnConsole(List<Lesson> lessons){
        for (Lesson l: lessons){
            l.setScore(OnConsole.getIntValueOnConsole(l.getName(),"dersinin notunu giriniz(0-100): "));
            while (l.getScore()<0 || l.getScore()>100){
                System.out.println("Geçersiz bir not girdiniz. Lütfen 0-100 arasında bir değer giriniz: ");
                l.setScore(OnConsole.getIntValueOnConsole(l.getName(),"dersinin notunu giriniz(0-100): "));
            }
        }
        return lessons;
    };

}
