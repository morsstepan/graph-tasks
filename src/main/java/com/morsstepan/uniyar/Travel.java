package com.morsstepan.uniyar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Travel {

    private ArrayList<City> travel = new ArrayList<>();
    private ArrayList<City> previousTravel = new ArrayList<>();

    public Travel() {

    }

    public Travel(int numberOfCities) {
//        for (int i = 0; i < numberOfCities; i++) {
//            travel.add(new City());
//        }
    }

    public void generateInitialTravel() {
        if (travel.isEmpty())
            new Travel(10);
        Collections.shuffle(travel);
    }

    public void addCityToTravel(City city) {
        this.travel.add(city);
    }

    public void generateInitialTravel2() {

        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("Taxicab_64.txt");
        String data = "";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while(reader.ready()) {
                City city = new City();
                String line = reader.readLine();
                if(line.contains("n =")) {
//                    new Travel(Integer.parseInt(line.substring(line.lastIndexOf("=") + 2)));
                    new Travel();
                } else {
                    String[] strings = line.split("\\s+");
//                    node.setId(strings[0]);
                    city.setX(Integer.parseInt(strings[1]));
                    city.setY(Integer.parseInt(strings[2]));
//                    graph.addNode(node);
                    this.travel.add(city);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void swapCities() {
        int a = generateRandomIndex();
        int b = generateRandomIndex();
        previousTravel = travel;
        City x = travel.get(a);
        City y = travel.get(b);
        travel.set(a, y);
        travel.set(b, x);
    }

    public void revertSwap() {
        travel = previousTravel;
    }

    private int generateRandomIndex() {
        return (int) (Math.random() * travel.size());
    }

    public City getCity(int index) {
        return travel.get(index);
    }

    public int getDistance() {
        int distance = 0;
        for (int index = 0; index < travel.size(); index++) {
            City starting = getCity(index);
            City destination;
            if (index + 1 < travel.size()) {
                destination = getCity(index + 1);
            } else {
                destination = getCity(0);
            }
            distance += starting.distanceToCity(destination);
        }
        return distance;
    }

}