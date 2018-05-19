package com.madpoints.springactivity;

public class DailyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today you will accomplish your goal";
	}

}
