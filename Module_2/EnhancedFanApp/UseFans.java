package Module_2.EnhancedFanApp;

import java.util.Set;

/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

public class UseFans  {//starting with code from Module 1 from the SeeFan class

    final static int STOPPED = 0;
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private boolean on;
    private int radius;
    private String color;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean getOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public UseFans() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    public UseFans(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    } //end adapted code from SeeFan class

    /**
     * A method taking a collection of Fan instances & a method taking a single instance of fan both displaying the results.
     * @param speed int 
     * @param on boolean
     * @param radius int
     * @param color string
     */

    public void DisplayFansFunctionality(Set<UseFans> fans) {
        for(UseFans f : fans) {
            if(f.on) {
                System.out.println("\nOh hello. \nLooks like the fan is currently on, moving at a speed of " + f.speed + " hundred rpms. \nThe fan's blade radius is: " + f.radius + " inches. \nThe fan's color is: " + f.color +  ".\n");
            } else {
                System.out.println("\nGood day. \nLooks like the fan is currently off, resulting in a speed of " + f.speed + " rpms. \nThe fan's blade radius is: " + f.radius + " inches. \nThe fan's color is: " + f.color +  ".\n");
            }
        }
    }

    public void DisplayFanFunctionality(UseFans fan) {
            if(this.on) {
                System.out.println("\nOh hello. \nLooks like the fan is currently on, moving at a speed of " + this.speed + " hundred rpms. \nThe fan's blade radius is: " + this.radius + " inches. \nThe fan's color is: " + this.color +  ".\n");
            } else {
                System.out.println("\nGood day. \nLooks like the fan is currently off, resulting in a speed of " + this.speed + " rpms. \nThe fan's blade radius is: " + this.radius + " inches. \nThe fan's color is: " + this.color +  ".\n");
            }
    }

}// end UseFans
