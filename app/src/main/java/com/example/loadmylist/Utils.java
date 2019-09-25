package com.example.loadmylist;

import com.example.loadmylist.model.Animal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Utils {
    public static List<Animal> getAnimalsList() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Clifford", "Dog", 4, true, getRandomDate()));
        animals.add(new Animal("Cindy", "Cat", 4, true, getRandomDate()));
        animals.add(new Animal("Harry", "Horse", 4, true, getRandomDate()));
        animals.add(new Animal("Sophie", "Snail", 0, true, getRandomDate()));
        animals.add(new Animal("Peter", "Penguin", 2, true, getRandomDate()));
        animals.add(new Animal("Sally", "Snake", 0, true, getRandomDate()));
        animals.add(new Animal("Fin", "Fish", 0, true, getRandomDate()));
        animals.add(new Animal("Freddy", "Frog", 4, true, getRandomDate()));
        animals.add(new Animal("Larry", "Lizard", 4, true, getRandomDate()));
        animals.add(new Animal("Eddie", "Eagle", 2, true, getRandomDate()));
        animals.add(new Animal("Ferdinance", "Falcon", 2, true, getRandomDate()));
        animals.add(new Animal("Patricia", "Pigeon", 2, true, getRandomDate()));
        animals.add(new Animal("Dave", "Dolphin", 0, true, getRandomDate()));
        animals.add(new Animal("Shar", "Shark", 0, true, getRandomDate()));
        animals.add(new Animal("Jerry", "Giraffe", 4, true, getRandomDate()));
        animals.add(new Animal("Ryan", "Rhino", 4, true, getRandomDate()));
        animals.add(new Animal("Rhonda", "Rabbit", 4, true, getRandomDate()));
        animals.add(new Animal("Albert", "Alligator", 4, true, getRandomDate()));
        animals.add(new Animal("Eric", "Elephant", 4, true, getRandomDate()));
        animals.add(new Animal("Mike", "Monkey", 2, true, getRandomDate()));
        animals.add(new Animal("Greg", "Gorilla", 2, true, getRandomDate()));
        animals.add(new Animal("Leonard", "Lion", 4, true, getRandomDate()));
        animals.add(new Animal("LeBron", "Goat", 4, true, getRandomDate()));
        animals.add(new Animal("Chris", "Centaur", 4, true, getRandomDate()));
        return animals;
    }
    private static Date getRandomDate() {
        int day = new Random().nextInt((31 - 1) + 1) + 1;
        int month = new Random().nextInt((12 - 1) + 1) + 1;
        int year = new Random().nextInt((2019 - 1900) + 1) + 1900;
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        try {
            date = sdf.parse(day + "/" + month + "/" + year);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
