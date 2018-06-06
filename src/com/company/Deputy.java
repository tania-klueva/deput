package com.company;

import java.util.Objects;

public class Deputy extends Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean grafter;
    private double bribe;

    public Deputy() {
    }

    public Deputy(String firstName, String lastName, boolean grafter) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grafter = grafter;
        this.bribe = 0;
    }

    public Deputy(String firstName, String lastName, boolean grafter, double bribe) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.grafter = grafter;
        this.bribe = bribe;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }



    public String getLastName() {
        return lastName;
    }


    public int getAge() {
        return age;
    }

    public boolean isGrafter() {
        return grafter;
    }


    public double getBribe() {
        return bribe;
    }

    public void giveABribe(double bribe){
        if(!this.grafter){
            if(bribe > 10000){
                System.out.println("Oh, maybe I should think about it");
            } else
            System.out.println("Take this away");
        }
        else{
            System.out.println("I'm sure we can do smth");
            this.bribe+=bribe;
        }
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", grafter=" + grafter +
                ", bribe=" + bribe +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Deputy deputy = (Deputy) o;
        return age == deputy.age &&
                grafter == deputy.grafter &&
                Double.compare(deputy.bribe, bribe) == 0 &&
                Objects.equals(firstName, deputy.firstName) &&
                Objects.equals(lastName, deputy.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), firstName, lastName, age, grafter, bribe);
    }
}
