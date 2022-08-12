package com.hellodocker;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HelloDocker {

    private String content;
    private String environment;
}
