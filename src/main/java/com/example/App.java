package com.example;

public class App {
    public String getMessage() {
        return "Hello, Java 17 with Maven!";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getMessage());
    }
}

