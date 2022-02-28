import java.awt.Color;
import kit101.turtle.Turtle;

/**
 * 2.1PP Turtle Graphics task to read some existing code that uses a predefined
 * class and to modify it to change the colour of each shape that the turtle
 * draws.
 *
 * @author Charlie Cooper
 */
public class RainbowTurtle {

    public static void main(String[] args) {
        Turtle t = new Turtle();
    
        /*******/
        t.penUp(); //t, null, return not used.
        t.turn(-135); //t, -135, return not used.
        t.move(310); //t, 310, return not used.
        t.turn(135); //t, 135, return not used.
        t.penDown(); //t, null, return not used.
        t.setColor(Color.RED);
        t.move(100); //t, 100, return not used.
        t.turn(90); //t, 90, return not used.
        System.out.println("At the end of the indicated section the Turtle object is:");
        System.out.println("Located at (" + t.getX() + ", " + t.getY() + ")"); //t, null, return added to a string to be printed.  //t, null, return added to a string to be printed.
        System.out.println("Pointing at an angle of " + t.getDirection() + " degrees");  //t, null, return added to a string to be printed.
        /*******/
    
        t.move(100);
        t.turn(90);
        t.move(100);
        t.turn(90);
        t.move(100);
        t.turn(180);
        t.penUp();
        t.move(350);
        t.turn(-90);
        t.penDown();
        t.setColor(Color.MAGENTA);
        t.move(100);
        t.turn(120);
        t.move(100);
        t.turn(120);
        t.move(100);
        t.turn(120);
        t.penUp();
        t.move(300);
        t.penDown();
        t.setColor(Color.BLUE);
        t.move(100);
        t.turn(90);
        t.move(50);
        t.turn(90);
        t.move(100);
        t.turn(90);
        t.move(50);
        t.penUp();
        t.move(240);
        t.penDown();
        t.setColor(Color.GREEN);
        t.turn(45);
        t.move(150);
        t.penUp();
        t.turn(135);
        t.move(105);
        t.penDown();
        t.turn(135);
        t.move(150);
    }

}
