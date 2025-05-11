package com.Core.Java.JDK8.MehodReferenceOrConstructorReference;

//Type of method reference
//1.Reference to static method
//2.Reference to instance method
//3.Reference to constructor
//:: operator is used to accecss 

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReference {

    // Static method reference
    public static void printMessage(String message) {
        System.out.println("Static Method Reference: " + message);
    }

    // Instance method reference of a particular object
    public void printMessageInstance(String message) {
        System.out.println("Instance Method Reference (Specific Object): " + message);
    }

    // Instance method reference of an arbitrary object of a particular type
    public static void main(String[] args) {
        List<String> messages = Arrays.asList("Hello", "World", "Java", "Method References");

        // Reference to static method
        System.out.println("Using Static Method Reference:");
        messages.forEach(MethodReference::printMessage);

        // Reference to instance method of a particular object
        MethodReference demoInstance = new MethodReference();
        System.out.println("\nUsing Instance Method Reference (Specific Object):");
        messages.forEach(demoInstance::printMessageInstance);

        // Reference to instance method of an arbitrary object of a particular type
        System.out.println("\nUsing Instance Method Reference (Arbitrary Object):");
        messages.sort(String::compareToIgnoreCase);
        messages.forEach(System.out::println);

        // Reference to constructor
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        System.out.println("\nUsing Constructor Reference:");
        List<Person> persons = names.stream()
                                    .map(Person::new) // Constructor reference
                                    .collect(Collectors.toList());
        persons.forEach(person -> System.out.println("Person Name: " + person.getName()));
    }
}

// Person class with a constructor reference
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
