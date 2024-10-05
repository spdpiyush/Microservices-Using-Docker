package com.piyush.practice.helloworldrestapi;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HelloWorld {
    String message;

    @Override
    public String toString() {
        return "HelloWorld{" +
                "message='" + message + '\'' +
                '}';
    }
}
