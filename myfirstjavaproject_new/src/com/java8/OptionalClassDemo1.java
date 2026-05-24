package com.java8;

import java.util.Optional;

public class OptionalClassDemo1 {
    public static void main(String[] args) {

        System.out.println("Main method started");

        String[] names = { "yaswanth", "pooji", null, "uma" };

        for (String s : names) {

            Optional<String> name = Optional.ofNullable(s);

            name.ifPresent(value ->
                System.out.println(value.toUpperCase())
            );
        }
    }
}