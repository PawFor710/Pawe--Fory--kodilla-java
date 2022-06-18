package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

public class StreamMain {
    public static void main(String[] args) {
        // 7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("This sentence needs a dot at the end",
                textToDecorate -> textToDecorate + ".");
        poemBeautifier.beautify("This one needs exclamation sign",
                textToDecorate -> textToDecorate + "!");
        poemBeautifier.beautify("Do i need more sentence",
                textDecorator -> textDecorator + "?");
        poemBeautifier.beautify("let's make this sentence bigger",
                textDecorator -> textDecorator.toUpperCase(Locale.ROOT));
        poemBeautifier.beautify("BUT THIS SENTENCE IS GOING TO BE LOWER",
                textDecorator -> textDecorator.toLowerCase());
        poemBeautifier.beautify("How long is the last sentence?",
                textDecorator -> textDecorator + " The answer is: " + textDecorator.length());

        //7.2
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}