package ru.sbrf;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Department department = mapper.readValue(new File("C:\\Users\\user\\IdeaProjects\\SberStudy\\homework12\\src\\main\\resources\\data.json"), Department.class);
        System.out.println(mapper.writeValueAsString(department));
    }
}
