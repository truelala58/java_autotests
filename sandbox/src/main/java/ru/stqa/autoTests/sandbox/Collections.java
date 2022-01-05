package ru.stqa.autoTests.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public  static void main(String[] args) {
    /*    String[] langs = {"Java","C#","Python","PHP"};*/

  /*    langs[0] = "Java";
        langs[1] = "C#";
        langs[2] = "Python";
        langs[3] = "PHP";*/
        /*for (int i = 0; i < langs.length; i++) {
            System.out.println("Я хочу выучить " + langs[i]);
        }*/
        /*List<String> languages = new ArrayList<>();*/
     /* languages.add("Java");
        languages.add("C#");
        languages.add("Python");*/
 /*       for (String l : languages) {
            System.out.println("Я хочу выучить " + l);
        }*/
        List<String> languages = Arrays.asList("Java","C#","Python","PHP"); // преобразованиие массива в список

        for (int i = 0; i < languages.size(); i++) {
            System.out.println("Я хочу выучить " + languages.get(i));
        }
    }
}
