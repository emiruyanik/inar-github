package week_13.assignments;

import java.awt.*;
import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String colour;
    private boolean isFilled;
    private Date dateCreated;

    protected GeometricObject() {
        this("white", false);
        this.dateCreated = new Date();
    }

    protected GeometricObject(String colour, boolean isFilled) {
        this.colour = colour;
        this.isFilled = isFilled;
        this.dateCreated = new Date();
    }


    public Date getDateCreated() {
        return dateCreated;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }


    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public int compareTo(GeometricObject g1) {
        if (this.getArea() > g1.getArea()) {
            return 1;
        } else if (this.getArea() == g1.getArea()) {
            return 0;
        }
        return -1;
    }


    @Override
    public String toString() {
        return "GeometricObject{" +
                "colour='" + colour + '\'' +
                ", isFilled=" + isFilled +
                ", dateCreated=" + this.getDateCreated() +
                '}';
    }

    public static GeometricObject max(GeometricObject g1,GeometricObject g2) {
        if (g1.getArea()>g2.getArea()) {
            return g1;
        } else {
            return g2;
        }

    }
}
