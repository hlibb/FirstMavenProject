package com.arr;

import lombok.Data;

@Data
public class HelloWorld {
    String hello;

    public HelloWorld() {
        this.hello = "Hello World!";
    }
}