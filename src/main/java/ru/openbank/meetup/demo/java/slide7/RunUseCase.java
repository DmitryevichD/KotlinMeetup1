package ru.openbank.meetup.demo.java.slide7;

import com.fasterxml.jackson.databind.JsonNode;

public class RunUseCase {
    private static boolean isValidNode(JsonNode jsonNode) {
        return jsonNode != null && (jsonNode.isObject() || jsonNode.isArray());
    }
}
