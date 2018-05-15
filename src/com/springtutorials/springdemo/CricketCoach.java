package com.springtutorials.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    // add new fields for email address and team
    private String emailAddress;
    private String team;


    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    @Override
    public String getExerciseWorkout() {
        return "Practice fast bowling for 15 minutes a day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
