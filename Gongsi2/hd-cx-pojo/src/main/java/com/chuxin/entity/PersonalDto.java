package com.chuxin.entity;

import java.io.Serializable;

public class PersonalDto implements Serializable {

    private String my_function;

    private int power;

    public PersonalDto() {
    }

    public PersonalDto(String my_function, int power) {
        this.my_function = my_function;
        this.power = power;
    }

    @Override
    public String toString() {
        return "PersonalDto{" +
                "my_function='" + my_function + '\'' +
                ", power=" + power +
                '}';
    }

    public String getMy_function() {
        return my_function;
    }

    public void setMy_function(String my_function) {
        this.my_function = my_function;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
