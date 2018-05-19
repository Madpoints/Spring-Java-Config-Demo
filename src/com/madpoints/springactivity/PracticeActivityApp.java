package com.madpoints.springactivity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeActivityApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(CoachConfig.class);
		
		// get bean from container
		UltimateFrisbeeCoach theCoach = context.getBean("ultimateFrisbeeCoach", UltimateFrisbeeCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// close context
		context.close();

	}

}
