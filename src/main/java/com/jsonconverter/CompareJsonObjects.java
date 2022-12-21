package com.jsonconverter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public class CompareJsonObjects {
    public static void main(String[] args) throws JsonProcessingException {
        Employee employee1 = new Employee(null,"John Miles", "34", Arrays.asList("john@xyz.com", "9999999999"));

        System.out.println("O/p of employee1 ::" + employee1);

        ObjectMapper mapper = new ObjectMapper();
        String JsonObject1 = mapper.writeValueAsString(employee1);
        System.out.println("Displaying the JSON o/p ::" + JsonObject1);
        System.out.println("\n");

        Employee employee2 = new Employee("1212","John Miles", "35", Arrays.asList("john@xyz.com", "9999999999"));

        System.out.println("O/p of employee2 ::" + employee2);

        String JsonObject2 = mapper.writeValueAsString(employee2);

        System.out.println("Displaying the JSON o/p ::" + JsonObject2);
        System.out.println("\n");

        if (JsonObject1.equals(JsonObject2)){

            System.out.println("JSON Objects are Identical");
        }
        else {
            System.out.println("JSON Objects are NOT Identical");

        }


    }
}
