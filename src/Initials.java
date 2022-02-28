import kit101.turtle.Turtle;

/**
 * 2.1PP Turtle Graphics task to draw the author's initials.
 * Some of the code below has been _over_ commented to help you understand
 * what is happening.
 *
 * @author Charlie Cooper
 */
public class Initials {

    final static double PI = 3.1415926;

    private static void drawSemiCircle(final Turtle turtle) {
        boolean isDown = turtle.isDown();

        for (int i = 0; i < 180; i++) {
            turtle.move(1);
            turtle.turn(-1);
        }

        turtle.penUp();
        turtle.turn(90);
        turtle.move(-360/PI);
        turtle.turn(90);

        if (isDown) turtle.penDown();
    }

    public static void drawLetterC(final Turtle turtle) {
        //Draw top half of C
        drawSemiCircle(turtle);

        //Draws the line of C
        turtle.turn(180);
        turtle.move(100);

        //Draw the bottom half of C
        turtle.penUp();
        turtle.turn(90);
        turtle.move(360/PI);
        turtle.turn(-90);
        turtle.penDown();
        drawSemiCircle(turtle);
    }

    public static void main(String[] args) {
        Turtle turtle = new Turtle();

        //Moves turtle to starting position for first C
        System.out.println(turtle.getX() + ", " + turtle.getY());
        turtle.penUp();
        turtle.move(-150);
        turtle.turn(90);
        turtle.move(75);
        turtle.penDown();

        System.out.println(turtle.getX() + ", " + turtle.getY());

        drawLetterC(turtle);

        //Moves turtle to starting position for second C
        turtle.penUp();
        turtle.turn(90);
        turtle.move(180/PI);
        turtle.turn(90);
        turtle.move(100);
        turtle.penDown();
        System.out.println(turtle.getX() + ", " + turtle.getY());

        drawLetterC(turtle);

    }

}
