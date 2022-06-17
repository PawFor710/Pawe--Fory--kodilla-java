package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("This sentence needs a dot at the end",
                textToDecorate -> textToDecorate + ".");
        poemBeautifier.beautify("This one needs exclamation sign",
                textToDecorate -> textToDecorate + "!");
    }
}