package io.lab.imHarish03.bean;

public class DynamicGreetingService implements GreetingService {
	@Override
	public String greet(String name) {
		return "Hello dynamically, " + name;
	}
}
