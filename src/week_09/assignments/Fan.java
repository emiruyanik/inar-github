package week_09.assignments;

public class Fan {

    public static final int SLOW = 1;
    private static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String colour;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        colour = "blue";
    }

    public Fan(int speed, boolean on, double radius, String colour) {
        if (speed == SLOW || speed == MEDIUM || speed == FAST) {
            this.speed = speed;
        } else {
            this.speed = SLOW;
        }
        this.on = on;
        this.radius = radius;
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (on) {
            if (speed == SLOW || speed == MEDIUM || speed == FAST) {
                this.speed = speed;

            } else {
                System.out.println("Invalid value please correct your input");
            }
        }
    }


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", colour='" + colour + '\'' +
                    '}';
        }
        return "Fan{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                ",Fan is off " +
                '}';
    }
}
