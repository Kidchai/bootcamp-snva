package jdk8_features.lambda;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {

        List<String> pointList = new ArrayList<>();

        pointList.add("1");
        pointList.add("2");

        //Using lambda expression to iterate over a List and perform some action on list items
        pointList.forEach( p ->  { System.out.println(p); } );

        //Using lambda expression to create and start a Thread
        new Thread( () -> { System.out.println("New thread created"); } ).start();

        // Using lambda expression for adding an event listener to a GUI component
        JButton button =  new JButton("Submit");
        button.addActionListener((e) -> {
            System.out.println("Click event triggered !!");
        });
    }
}
