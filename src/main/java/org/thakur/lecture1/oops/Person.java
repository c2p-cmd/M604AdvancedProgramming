package org.thakur.lecture1.oops;

public abstract class Person implements Comparable<Person> {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getOccupation();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo(boolean detailed) {
        if (detailed) {
            System.out.println(this);
            return;
        }
        System.out.println("Person{" + "name='" + name + '\'' + ", age=" + age + ", occupation=" + '\'' + getOccupation() + '}');
    }

    public String calculateAgeCategory() {
        if (age < 18) {
            return "Child";
        } else if (age < 65) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    @Override
    public String toString() {
        final String category = calculateAgeCategory();
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", category='" + category + '\'' + ", occupation=" + '\'' + getOccupation() + '}';
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }
}
