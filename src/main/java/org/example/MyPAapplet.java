package org.example;

import processing.core.PApplet;
import processing.core.PImage;


public class MyPAapplet extends PApplet {
    PImage img;

    public void settings() {
        size(400, 400);
        img = loadImage("https://cseweb.ucsd.edu/~minnes/palmTrees.jpg", "jpg");
        img.resize(0, height);

    }

    public void setup() {
        stroke(0);



        background(255);


    }


    public void draw() {        image(img, 0, 0);
        int[] color = sunColorSec(second());
        fill(color[0], color[1], color[2]);
        ellipse(width / 4, height / 5, width / 4, height / 5);


    }

    public int[] sunColorSec(float seconds) {
        int[] rgb = new int[3];
        float diffFrom30 = Math.abs(30 - seconds);
        float ratio = diffFrom30 / 30;
        rgb[0] = (int) (255 * ratio);
        rgb[1] = (int) (255 * ratio);
        rgb[2] = 0;
        return rgb;

    }

    public static void main(String[] args) {
        String[] processingArgs = {"MyPAapplet"};
        MyPAapplet myPAapplet = new MyPAapplet();
        PApplet.runSketch(processingArgs, myPAapplet);
    }
}

