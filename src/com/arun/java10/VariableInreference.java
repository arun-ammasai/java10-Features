package com.arun.java10;

import java.util.function.BiConsumer;

// Limited With Local Variable
// Enhanced for Loop
// Declared for Loop
public class VariableInreference {

    public static void main(String[] args) {
        BiConsumer<String,String> bc = (s1,s2)
                -> System.out.println(s1.concat("").concat(s2));
        bc.accept("Hello","World");
    }
    void add(){
        System.out.println("Message from Add Method");
    }
}
