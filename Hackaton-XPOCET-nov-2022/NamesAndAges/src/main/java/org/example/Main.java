package org.example;

import java.util.*;
class Person { //clase persona
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        LinkedList<Person> persons = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            persons.add(new Person(scanner.next(), scanner.nextInt()));
        }
        if (d == 2) {
            persons.sort((Comparator.comparing(Person::getAge)));
        } else {
            persons.sort(Comparator.comparing(Person::getName));
        }

        for (Person p :
                persons) {
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}