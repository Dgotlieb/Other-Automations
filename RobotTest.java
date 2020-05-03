import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotTest {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot(); // creating Robot instance

        // Creates the delay of 5 sec
        robot.delay(5000);

        // Press keyboard keys to type "HI"
        robot.keyPress(KeyEvent.VK_H); // pressing H
        robot.keyPress(KeyEvent.VK_I); // pressing  I
        robot.keyPress(KeyEvent.VK_ENTER); // pressing enter

        // Move mouse to X Y coordinates
        robot.mouseMove(630, 420);

        // Click mouse buttons (left / right mouse buttons)
        // robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);

        // don’t forget to use mouseRelease on key
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }
}
