package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<String> employees=new ArrayList<>();
        employees.add("Сергей");
        employees.add("Кристина");
        employees.add("Елана");
        employees.add("Виктор");
        employees.add("Наталья");
        employees.remove(0);
        employees.remove("Наталья");
        for(String name : employees){
            System.out.println(name);
        }*/
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=0;i<1000;i++){
            numbers.add(i);
        }
        for(int i : numbers){
            System.out.println(i);
        }
    }
}
