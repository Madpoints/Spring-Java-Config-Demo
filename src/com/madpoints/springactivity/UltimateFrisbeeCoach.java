package com.madpoints.springactivity;

public class UltimateFrisbeeCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public UltimateFrisbeeCoach(FortuneService theFortuneservice) {
		fortuneService = theFortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice forehand throw";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
