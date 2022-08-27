package com.bridgelabz;

import java.util.Objects;

public class Bird {
    String id;
    String name;
    int price;

    @Override
    public String toString() {
        return "Bird{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(id, bird.id) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
