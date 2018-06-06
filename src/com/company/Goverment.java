package com.company;

import java.util.*;

public class Goverment {

    private HashMap<String, Fraction> fractions;

    public Goverment() {
        fractions = new HashMap<>();
    }

    public void addFraction(String key, Fraction value) {

        fractions.put(key, value);
    }

    public void deleteFraction(String key) {
        fractions.remove(key);
    }


    public void printAllFractions(){
        for(Map.Entry<String, Fraction> entry: fractions.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }

    public void printFraction(String key){
        System.out.println(fractions.get(key));
    }

    public void deleteDeputy(String key, String firstName, String lastName){
        fractions.get(key).deleteDeputy(firstName, lastName);
    }
    public void addDeputy(String key, Deputy deputy){
        fractions.get(key).addDeputy(deputy);
    }

    public void printGovermentGrafters() {
        Set<Map.Entry<String, Fraction>> entries = fractions.entrySet();
        Iterator<Map.Entry<String, Fraction>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Fraction> next = iterator.next();
            Iterator<Deputy> iteratorDeputies =next.getValue().getDeputies().iterator();
            while (iteratorDeputies.hasNext()) {
                Deputy nextDeputy = iteratorDeputies.next();
                if (nextDeputy.isGrafter()) {
                    System.out.println(nextDeputy);
                }
            }
            }
        }

    public void printFractionGrafters(String key) {
            Iterator<Deputy> iteratorDeputies =fractions.get(key).getDeputies().iterator();
            while (iteratorDeputies.hasNext()) {
                Deputy nextDeputy = iteratorDeputies.next();
                if (nextDeputy.isGrafter()) {
                    System.out.println(nextDeputy);
                }
            }
    }



    public void printMaxGrafter(String key){
        fractions.get(key).printMaxGrafter();
    }

    public void printMaxGovermentGrafter(){
        Set<Map.Entry<String, Fraction>> entries = fractions.entrySet();
        Iterator<Map.Entry<String, Fraction>> iterator = entries.iterator();
        Deputy max = null;
        while (iterator.hasNext()){
            Map.Entry<String, Fraction> next = iterator.next();
            Iterator<Deputy> iteratorDeputies =next.getValue().getDeputies().iterator();
            while (iteratorDeputies.hasNext()) {
                Deputy nextDeputy = iteratorDeputies.next();
                if (nextDeputy.getBribe()>max.getBribe()){
                    max = nextDeputy;
                }
            }
        }
        System.out.println(max);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goverment goverment = (Goverment) o;
        return Objects.equals(fractions, goverment.fractions);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fractions);
    }

    @Override
    public String toString() {
        return "Goverment{" +
                "fractions=" + fractions +
                '}';
    }
}
