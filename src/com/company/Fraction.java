package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Fraction {

    private String name;
    private ArrayList<Deputy> deputies;

    public Fraction(String name) {
        deputies = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Deputy> getDeputies() {
        return deputies;
    }

    public void addDeputy(Deputy deputy) {
        deputies.add(deputy);
    }

        public void deleteDeputy(String firstName, String lastName) {
        Iterator<Deputy> iterator = deputies.iterator();
        while (iterator.hasNext()){
            Deputy next = iterator.next();
            if (next.getFirstName().equals(firstName) && next.getLastName().equals(lastName)){
                iterator.remove();
            }
        }
    }
    public void deleteScoundrels() {
        Iterator<Deputy> iterator = deputies.iterator();
        while (iterator.hasNext()){
            Deputy next = iterator.next();
            if (next.isGrafter()){
               iterator.remove();
            }
        }
    }

    public void printMaxGrafter(){
        Deputy max = deputies.get(0);
        for (Deputy deputy:deputies) {
            if (deputy.getBribe()>max.getBribe()){
                max = deputy;
            }
        }
        System.out.println(max);
    }

    public void printAllDeputies(){
        for (Deputy deputy:deputies) {
            System.out.println(deputy);

        }
    }

    public void deleteAllDeputies(){
        deputies.clear();
    }

    public void printBribeSum(){
        double sum = 0;
        for (Deputy deputy:deputies) {
            sum+= deputy.getBribe();

        }
        System.out.println(sum);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return Objects.equals(name, fraction.name) &&
                Objects.equals(deputies, fraction.deputies);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, deputies);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "name='" + name + '\'' +
                ", deputies=" + deputies +
                '}';
    }
}
