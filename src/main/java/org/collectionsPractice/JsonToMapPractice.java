//package org.collectionsPractice;
//
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.DatabindException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//import java.util.Map;
//
//public class JsonToMapPractice {
//    public static void main(String[] args)  {
//
//        File jsonFile = new File("src/main/resources/sample.json");
//
//        // Create an ObjectMapper instance
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        try {
//            // Use TypeReference to specify the type of Map
//            Map<String, Object> map = objectMapper.readValue(jsonFile, Map.class);
//
//            map.forEach((k,v) -> {
//                System.out.println("k = " + k);
//                System.out.println("v = " + v);
//            } );
//
//            // Access and reuse the data from the Map
//            System.out.println("Name: " + map.get("name"));
//            System.out.println("Age: " + map.get("age"));
//
//            // Access nested objects
//            Map<String, Object> address = (Map<String, Object>) map.get("address");
//            System.out.println("Street: " + address.get("street"));
//            System.out.println("City: " + address.get("city"));
//            System.out.println("Zipcode: " + address.get("zipcode"));
//
//            // Access arrays
//            List<Map<String, String>> phones = (List<Map<String, String>>) map.get("phones");
//            for (Map<String, String> phone : phones) {
//                System.out.println("Phone (" + phone.get("type") + "): " + phone.get("number"));
//            }
//
//            phones.forEach(m -> {
//                m.forEach((k,v) -> {
//                    System.out.println("k = " + k);
//                    System.out.println("v = " + v);
//                });
//            });
//            List<String> emails = (List<String>) map.get("emails");
//            System.out.println("Emails: " + String.join(", ", emails));
//
//            // Access boolean values
//            boolean active = (boolean) map.get("active");
//            System.out.println("Active: " + active);
//
//        } catch (IOException e) {
//            System.err.println("Error reading JSON: " + e.getMessage());
//            e.printStackTrace();
//        }
//
//    }
//
//
//}
