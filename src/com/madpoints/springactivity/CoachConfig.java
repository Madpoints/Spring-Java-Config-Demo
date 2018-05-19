package com.madpoints.springactivity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachConfig {

	@Bean
	public FortuneService dailyFortuneService() {
		return new DailyFortuneService();
	}
	
	@Bean
	public Coach ultimateFrisbeeCoach() {
		UltimateFrisbeeCoach frisbeeCoach = new UltimateFrisbeeCoach(dailyFortuneService());
		return frisbeeCoach;
	}
}
