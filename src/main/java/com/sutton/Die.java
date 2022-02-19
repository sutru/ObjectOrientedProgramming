package com.sutton;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Die {
    Side[] sides;
    public Die(int amountOfSides, String color) {
        sides = new Side[amountOfSides];
        for(int i = 0; i <= amountOfSides; i++) {
            sides[i] = new Side(i, color);
        }
    }

    public Side[] getSides() {
        return sides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Die die = (Die) o;
        return Arrays.equals(sides, die.sides);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(sides);
    }

    @Override
    public String toString() {
        return "Die{" +
                "sides=" + Arrays.toString(sides) +
                '}';
    }
}
