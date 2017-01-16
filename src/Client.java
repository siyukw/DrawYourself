import java.util.*;

public class Client {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello, welcome to DrawYourself! What's your name?");
        String name = userInput.next();
        System.out.println("Hi " + name + ", what's your gender?('1' for male; '2' for female)");
        int gender = userInput.nextInt();
        System.out.println("On a scale from 1 bald to 4 very long, how long is your hair?(integer only)");
        int hairLength = userInput.nextInt();
        System.out.println("On a scale from 1 very pale to 5 very dark, how light is your skin?(integer only)");
        int skinColor = userInput.nextInt();
        System.out.println("On a scale from 1 blond to 10 black, how dark is your hair?(integer only)");
        int hairColor = userInput.nextInt();
        System.out.println("okay " + name + ", what is your eye color? (1 for blue, 2 for green, 3 for brown, 4 for black)");
        int eyeColor = userInput.nextInt();

        MyFace mine = new MyFace(gender, hairLength, hairColor, eyeColor, skinColor);

    }
}
