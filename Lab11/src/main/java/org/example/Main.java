package org.example;

import org.example.task1.Student;
import org.example.task1.User;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        User user = Student.builder().name("Oles")
                .age(32)
                .mark(61)
                .mark(100)
                .grades(Arrays.asList(62, 63))
                .gender("m")
                .build();
        System.out.println(user);
    }
}