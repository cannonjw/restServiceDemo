package org.kahnsoft.restServiceDemo;

public class HelloWorld {
    private String message;
    private String name;

    public HelloWorld(String message, String name) {
        this.message = message;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "message='" + this.message + '\'' +
                ", name='" + this.name + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }
}
