package com.javafundamentals.generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundExample_3 {

    List<Building> buildings = new ArrayList<>();

    public static void main(String[] args) {
        UnboundExample_3 testObj = new UnboundExample_3();
        testObj.demo();
    }

    public void demo(){
        House house = new House();
        register(house);

        Factory factory = new Factory();
        register(factory);

        Hotel hotel = new Hotel();
        register(hotel);

        paintAllBuildings(buildings);
    }

    public void register(Building building) {
        buildings.add(building);
    }

//    public static void paintAllBuildings(List<Building> buildings) {
//        buildings.forEach(Building::paint);
//    }

    // Upper bound demo:-
    public static void paintAllBuildings(List<? extends Building> buildings) {
        buildings.forEach(Building::paint);
    }

    abstract class Building {
        abstract void paint();
    }

    public class House extends Building {
        void paint(){
            System.out.println("Painting House..");
        }
    }

    public class Hotel extends Building {
        void paint(){
            System.out.println("Painting Hotel..");
        }
    }

    public class Factory extends Building {
        void paint(){
            System.out.println("Painting Factory..");
        }
    }
}
