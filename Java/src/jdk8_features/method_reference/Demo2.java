package jdk8_features.method_reference;
//Part 2

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Person1> roster = Person1.createRoster();
        Person1[] rosterAsArray = roster.toArray(new Person1[roster.size()]);

        //with lambda, we can invoke compareByAge() method of PersonClass
        Arrays.sort(rosterAsArray,
                (a, b) -> Person1.compareByAge(a, b)
        );

        //this lambda expression invokes an existing method, so we can replace lambda with a method reference
        Arrays.sort(rosterAsArray, Person1::compareByAge);

        /*
        Method reference Person1::compareByAge is semantically the same as
        Lambda expression (a, b) -> Person1.compareByAge(a, b)

        Each has the following characteristics:
        - Its formal parameter list is copied from Comparator<Person1>.compare, which is (Person1, Person1).
        - Its body calls the method Person1.compareByAge.
         */
    }
}

class Person1 {

    String name;
    LocalDate birthday;

    Person1(String nameArg, LocalDate birthdayArg) {
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

    public static int compareByAge(Person1 a, Person1 b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static List<Person1> createRoster() {
        List<Person1> roster = new ArrayList<>();
        roster.add(
                new Person1(
                        "Fred", IsoChronology.INSTANCE.date(1980, 6, 20)));
        roster.add(
                new Person1(
                        "Jane", IsoChronology.INSTANCE.date(1990, 7, 15)));
        roster.add(
                new Person1(
                        "George",
                        IsoChronology.INSTANCE.date(1991, 8, 13)));
        roster.add(
                new Person1(
                        "Bob", IsoChronology.INSTANCE.date(2000, 9, 12)));

        return roster;
    }
}
