package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args){
        System.out.println("Decorating text with lambdas");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text to be upgraded.", (textToDecorate -> "ABC "+textToDecorate+" ABC"));
        poemBeautifier.beautify("Text to be upgraded.", (textToDecorate -> textToDecorate.toUpperCase()));
        poemBeautifier.beautify("Text to be upgraded.", (textToDecorate -> textToDecorate.replace('e','y')));
        poemBeautifier.beautify("Text to be upgraded.", (textToDecorate -> textToDecorate.substring(5,10)));
    }
}