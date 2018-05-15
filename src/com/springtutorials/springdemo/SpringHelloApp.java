package com.springtutorials.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call method on the bean
        System.out.println(theCoach.getExerciseWorkout());

        //call our new fortunes service method
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
