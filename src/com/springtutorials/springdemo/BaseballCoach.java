package com.springtutorials.springdemo;

public class BaseballCoach implements Coach{

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define constructor for injecting dependency
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getExerciseWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        // use fortune service to get a fortune
        return fortuneService.getFortune();
    }
}
