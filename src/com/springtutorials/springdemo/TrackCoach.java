package com.springtutorials.springdemo;

public class TrackCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define constructor for injecting dependency
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach(){}

    @Override
    public String getExerciseWorkout() {
        return "Run 5 miles";
    }

    @Override
    public String getDailyFortune() {
        // use fortune service to get a fortune
        return "Just Do It: " + fortuneService.getFortune();
    }
}
