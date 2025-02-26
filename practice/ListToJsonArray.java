package org.example;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("age", age);
        return json;
    }
}

public class ListToJsonArray {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));

        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < people.size(); i++) {
            jsonArray.put(people.get(i).toJSON());
        }

        System.out.println(jsonArray.toString(4));
    }
}

