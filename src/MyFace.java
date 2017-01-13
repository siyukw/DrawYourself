import java.awt.*;

public class MyFace {
    private DrawingPanel p;
    private int hairLength;
    private int hairColor;
    private int eyeColor;

    public MyFace(int gender, int hairLength, int hairColor, int eyeColor){
        DrawingPanel p = new DrawingPanel(800, 1200);
        if (gender == 1) {
            p.setBackground(Color.BLUE);
        } else {
            p.setBackground(Color.PINK);
        }
        this.hairColor = hairColor;
        this.hairLength = hairLength;
        this.eyeColor = eyeColor;
        Graphics g = p.getGraphics();

        // draw face and neck
    }

    // draw eyes
    public void eyes(){

    }

    // draw hair
    public void hair(){

    }

    // draw mouth
    public void mouth(){

    }

    // draw nose
    public void nose(){

    }
}
