package com.Core.Java.StringStringBufferStringBuilder;

public final class CustomImmutableClass {
	private final String name;
	private final int age;
	int x=10;
	public CustomImmutableClass(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "ImmutablePerson{name='" + name + "', age=" + age + "}";
	}

	public static void main(String[] args) {
		CustomImmutableClass person = new CustomImmutableClass("John Doe", 30);

		System.out.println(person); // Outputs: ImmutablePerson{name='John Doe', age=30}
		System.out.println(person.x);
		
	}
}
