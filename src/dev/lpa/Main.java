package dev.lpa;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {


    }

    private static void applyChanges(String[] names, List<UnaryOperator<String>> stringFunctions){
        List<String> backedByArray = Arrays.asList(names);

        for(var function : stringFunctions){
            backedByArray.replaceAll(s->s.transform(function));
            System.out.println(Arrays.toString(names));

        }
    }

}