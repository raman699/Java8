package com.practice.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateCheck {
    Predicate<String> egg= s-> s.contains("egg");
    Predicate<String> brown= s-> s.contains("brown");
    Predicate<String> brownEggs= s-> s.contains("egg") && s.contains("brown");
    Predicate<String> otherEggs= s-> s.contains("egg") && !s.contains("brown");

    //The new Way
    Predicate<String> brownEggsNew = egg.and(brown);
    Predicate<String> otherEggsNew = egg.and(brown.negate());
    //reusing the logic in the original Predicate to build two new ones
    //the following default methods are present in the Predicate Functional Interface
    /* and
     * or
     * negate
     * isEqual
     */
}
