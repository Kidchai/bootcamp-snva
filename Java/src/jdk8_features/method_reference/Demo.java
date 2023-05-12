package jdk8_features.method_reference;
//Part 1

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Person> roster = Person.createRoster();
        Person[] rosterAsArray = roster.toArray(new Person[roster.size()]);

        //we use comparator to sort rosterAsArray by age
        Arrays.sort(rosterAsArray, new PersonAgeComparator());

        //Notice: interface Comparator is a functional interface.
        //So we can use a lambda expression instead of defining and then creating a new instance
        // of a class that implements Comparator:
    }
}

class Person {

    String name;
    LocalDate birthday;

    Person(String nameArg, LocalDate birthdayArg) {
        name = nameArg;
        birthday = birthdayArg;
    }

    public int getAge() {
        return birthday
                .until(IsoChronology.INSTANCE.dateNow())
                .getYears();
    }

    public void printPerson() {
        System.out.println(name + ", " + this.getAge());
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static List<Person> createRoster() {
        List<Person> roster = new ArrayList<>();
        roster.add(
                new Person(
                        "Fred", IsoChronology.INSTANCE.date(1980, 6, 20)));
        roster.add(
                new Person(
                        "Jane", IsoChronology.INSTANCE.date(1990, 7, 15)));
        roster.add(
                new Person(
                        "George",
                        IsoChronology.INSTANCE.date(1991, 8, 13)));
        roster.add(
                new Person(
                        "Bob", IsoChronology.INSTANCE.date(2000, 9, 12)));

        return roster;
    }
}

class PersonAgeComparator implements Comparator<Person> {
    public int compare(Person a, Person b) {
        return a.getBirthday().compareTo(b.getBirthday());
    }
}
