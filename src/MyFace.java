import java.awt.*;
import java.util.*;

public class MyFace {
    private DrawingPanel p;
    private int hairLength;
    private int hairColor;
    private int eyeColor;

    public MyFace(int gender, int hairLength, int hairColor, int eyeColor, int skinColor){
        DrawingPanel p = new DrawingPanel(800, 950);
        Graphics g = p.getGraphics();

        hair(g, hairColor, hairLength);

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
        g.fillRect(385, 350, 30, 100);
    }

    // draw eyes
    public void eyes(){

    }

    // draw hair
    public void hair(Graphics g, int hairColor, int hairLength){
        if (hairColor == 1) {
            g.setColor(new Color(255, 248, 220));
        } else if (hairColor == 2) {
            g.setColor(new Color(255, 235, 0));
        } else if (hairColor == 3) {
            g.setColor(new Color(210, 165, 32));
        } else if (hairColor == 4) {
            g.setColor(new Color(215, 105, 30));
        } else if (hairColor == 5) {
            g.setColor(new Color(139, 69, 19));
        } else if (hairColor == 6) {
            g.setColor(new Color(95, 50, 10));
        } else {
            g.setColor(new Color(0, 0, 0));
        }


        if (hairLength == 2) {
            g.fillOval(150, 100, 500, 440);
        } else if (hairLength == 3) {
            g.fillOval(130, 100, 540, 700);
        } else if (hairLength == 4) {
            g.fillOval(120, 100, 560, 800);
        }


    }

    // draw mouth
    public void mouth(){

    }

    // draw nose
    public void nose(){

    }
}
