package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args){
        System.out.println("Decorating text with lambdas");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text to be upgraded.", (textToDecorate -> "ABC "+textToDecorate+" ABC"));
        poemBeautifier.beautify("Text to be upgraded.", (textToDecorate -> textToDecorate.toUpperCase()));
        poemBeautifier.beautify("Text to be upgraded.", (textToDecorate -> textToDecorate.replace('e','y')));
        poemBeautifier.beautify("Text to be upgraded.", (textToDecorate -> textToDecorate.substring(5,10)));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}