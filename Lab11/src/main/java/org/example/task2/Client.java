package org.example.task2;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
@Getter
public class Client {
    private static int idCounter = 0;

    @Builder.Default
    private int id = idCounter++;
    private String name;
    private int age;
    private String sex;
    private String email;

}
