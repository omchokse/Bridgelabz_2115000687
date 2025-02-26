package org.example;

import org.json.JSONObject;

class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        json.put("brand", brand);
        json.put("model", model);
        json.put("year", year);
        return json;
    }
}

public class CarToJson {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2022);
        System.out.println(car.toJSON().toString(4));
    }
}

