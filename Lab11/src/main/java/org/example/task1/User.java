package org.example.task1;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.annotation.processing.SupportedOptions;
import java.util.List;
@SuperBuilder
@ToString
public class User {
    private String name;
    private int age;
    private String gender;
    private double weight;
    private double height;

}
