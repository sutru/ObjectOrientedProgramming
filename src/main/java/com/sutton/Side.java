package com.sutton;

import java.util.Objects;

public class Side {
    private int value;
    private String color;

    public Side () {

    }
    public Side(int value, String color) {
        this.value = value;
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Side side = (Side) o;
        return value == side.value && Objects.equals(color, side.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, color);
    }
}
