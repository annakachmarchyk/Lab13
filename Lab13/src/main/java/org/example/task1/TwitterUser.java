package org.example.task1;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
public class TwitterUser {
    private String userMaik;
    private String country;
    private LocalDateTime lastActiveTime;
}
