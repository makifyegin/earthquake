package org.example;

import processing.core.PApplet;

public class MySketch extends PApplet {

    public void setup() {
        background(0, 0, 0);
    }

    public void settings() {
        size(400, 400);

    }


    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
        MySketch earthQuake = new MySketch();
        PApplet.runSketch(processingArgs, earthQuake);
    }
}