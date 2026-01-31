package com.example.autowire.name;

public class Specification {

    private String make;
    private String model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        System.out.println("Hey!!! it's setter of the make attribute");
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        System.out.println("Hey!!! it's setter of the model attribute");
        this.model = model;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
