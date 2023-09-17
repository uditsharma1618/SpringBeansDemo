package org.example;

public class HockeyCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Practice shooting the ball daily";
    }
    public void getStarterCode(){
        System.out.println("You have entered starter code area");
    }
    public void getDestroyerCode(){
        System.out.println("You are destroying the bean now");
    }
}
