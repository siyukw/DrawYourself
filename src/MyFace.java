// this is a class that implements all the datas that the user inputs
// and draws their faces on drawingPanel

// add glasses, add bands, adjust eyes and eyebrows
import java.awt.*;
import java.util.*;

public class MyFace {
    private DrawingPanel p;
    private int hairLength;
    private int hairColor;
    private int eyeColor;

    public MyFace(int gender, int hairLength, int hairColor, int eyeColor, int skinColor, int glasses){
        DrawingPanel p = new DrawingPanel(800, 950);
        Graphics g = p.getGraphics();

        hair(g, hairColor, hairLength);

        // ask for gender to decide background and shirt color
        if (gender == 1) {
            p.setBackground(new Color(100,149,237));
            g.setColor(new Color(0,0,139));
            g.fillRect(150, 775, 500, 175);
        } else {
            p.setBackground(new Color(255,192,203));
            g.setColor(new Color(255,20,147));
            g.fillRect(150, 775, 500, 175);
        }
        this.hairColor = hairColor;
        this.hairLength = hairLength;
        this.eyeColor = eyeColor;


        // check order of all methods before finalized

        skin(g, skinColor);
        glasses(g, glasses);
        mouth(g);
        eyeBrows(g);
        eyes(g, eyeColor);
    }

    // draw neck and face
    public void skinColor(Graphics g, int skinColor) {
        if(skinColor == 1) {
            g.setColor(new Color(255, 248, 220));
        } else if (skinColor == 2) {
            g.setColor(new Color(255, 222, 170));
        } else if (skinColor == 3) {
            g.setColor(new Color(250, 164, 96));
        } else if (skinColor == 4) {
            g.setColor(new Color(160, 82, 45));
        } else {
            g.setColor(new Color(90, 0, 0));

        }
    }

    public void skin(Graphics g, int skinColor){
        skinColor(g, skinColor);

        g.fillRect(370, 500, 60, 275);

        g.fillOval(175, 120, 450, 550);
        g.fillOval(370, 750, 60, 50);
        // ears
        g.fillOval(125, 320, 100, 120);
        g.fillOval(575, 320, 100, 120);

        // noses
        skinColor(g, skinColor + 1);
        g.fillRect(385, 410, 30, 100);
    }

    public void hairColor(Graphics g) {
        if (hairColor == 1) {
            g.setColor(new Color(255, 248, 220));
        } else if (hairColor == 2) {
            g.setColor(new Color(255, 235, 0));
        } else if (hairColor == 3) {
            g.setColor(new Color(210, 165, 32));
        } else if (hairColor == 4) {
            g.setColor(new Color(215, 110, 30));
        } else if (hairColor == 5) {
            g.setColor(new Color(130, 60, 10));
        } else if (hairColor == 6) {
            g.setColor(new Color(95, 50, 10));
        } else {
            g.setColor(new Color(0, 0, 0));
        }

    }

    // draw eyebrows
    public void eyeBrows(Graphics g) {
        hairColor(g);

        g.drawArc(220, 320, 100, 40, 50, 115);
        g.drawArc(480, 320, 100, 40, 15, 115);

    }

    // draw eyes
    public void eyes(Graphics g, int eyeColor){
        if (eyeColor == 1) {
            g.setColor(new Color(51, 153, 255));
        } else if (eyeColor == 2) {
            g.setColor(new Color(0, 153, 76));
        } else if (eyeColor == 3) {
            g.setColor(new Color(102, 51, 0));
        } else {
            g.setColor(Color.BLACK);
        }
        // big ovals
        g.fillOval(240, 340, 60, 40);
        g.fillOval(500, 340, 60, 40);
        //small ovals
        g.setColor(Color.WHITE);
        g.fillOval(265, 355, 10, 10);
        g.fillOval(525, 355, 10, 10);
    }


    // draw hair
    public void hair(Graphics g, int hairColor, int hairLength){
        hairColor(g);

        if (hairLength == 2) {
            g.fillOval(150, 100, 500, 440);
        } else if (hairLength == 3) {
            g.fillOval(130, 100, 540, 700);
        } else if (hairLength == 4) {
            g.fillOval(120, 100, 560, 800);
            // add more hair for band
        }


    }

    // draw mouth
    public void mouth(Graphics g){
        g.setColor(new Color(225, 80, 80));
        g.fillArc(365, 550, 70, 50, 180, 180);

    }

    // glasses or not
    public void glasses(Graphics g, int glasses) {
        if (glasses != 1) {

        }

    }

}
