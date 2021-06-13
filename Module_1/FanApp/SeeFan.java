package Module_1.FanApp;
/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by N. See 2021
*/ 

public class SeeFan {
    
    final static int STOPPED = 0;
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private Boolean on;
    private int radius;
    private String color;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public Boolean getOn() {
        return on;
    }
    public void setOn(Boolean on) {
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

    public SeeFan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    public SeeFan(int speed, Boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    /**
     * Method with four arguments, which are used to print the fan details and whether its on or off.
     * @param speed int 
     * @param on Boolean
     * @param radius int
     * @param color string
     * @return prints the fan details to the console window.
     */

    public String toString() { 
        if(on) {
            return "\nOh hello. \nLooks like the fan is currently on, moving at a speed of " + this.speed + " hundred rpms. \nThe fan's blade radius is: " + this.radius + " inches. \nThe fan's color is: " + this.color +  ".\n";
        } else {
            this.speed = STOPPED;
            return "\nGood day. \nLooks like the fan is currently off, resulting in a speed of " + this.speed + " rpms. \nThe fan's blade radius is: " + this.radius + " inches. \nThe fan's color is: " + this.color +  ".\n";
        }
    }// end toString method

    public static void main(String[] args) {
        // below test should print out default set values set in the default constructor
        SeeFan f1 = new SeeFan();

        // below test should print the updated values set and passed to the argument constructor
        SeeFan f2 = new SeeFan(MEDIUM, true, 15, "purple");
        
        /** 
         * below test should print the updated values set and passed to the argument constructor
         * below test should also reset speed to STOPPED regardless of speed value passed if fan is off 
         */
        SeeFan f3 = new SeeFan(FAST, false, 3, "green");
        

        System.out.println(f1); //compiler prints f1.toString
        System.out.println(f2); //compiler prints f2.toString
        System.out.println(f3); //compiler prints f3.toString
    }// end main
}// end SeeFan
