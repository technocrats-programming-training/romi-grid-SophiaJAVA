package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {

    int x;
    int y;

  


    public void driveUp() throws InterruptedException {
        y += 10;
    }

    public void driveDown() throws InterruptedException {
         y -= 10;
    }

    public void driveRight() throws InterruptedException {
          x += 10;
    }

    public void driveLeft() throws InterruptedException {
          x -= 10;
    }

    public void returnToHome() {

          x = 0;
          y = 0;

    }

    public String toString() {
        return "("+x+", "+y+")";
        // x = 10, y = 20
        // (10, 20)
      

    }
}
