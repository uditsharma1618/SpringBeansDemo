package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach hockeyCoach = context.getBean("myHockeyCoach", Coach.class);
        System.out.println(hockeyCoach.getDailyWorkout());
        context.close();
    }
}