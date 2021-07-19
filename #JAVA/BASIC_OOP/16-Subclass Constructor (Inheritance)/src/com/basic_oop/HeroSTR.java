package com.basic_oop;

//subclass
public class HeroSTR extends Hero {

    // constructor
    HeroSTR(String name, double defencePower) {
        super(name, defencePower);
    }

    // overloading
    HeroSTR(String name) {
        super(name);
    }
}
