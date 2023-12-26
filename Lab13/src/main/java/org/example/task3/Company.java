package org.example.task3;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter @Builder
public class Company {
    private String name;
    private String logo;


}
