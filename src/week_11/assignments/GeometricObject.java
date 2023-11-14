package week_11.assignments;

import java.util.Date;

public class GeometricObject {
    private String colour;
    private boolean isFilled;
    private Date dateCreated;
    public GeometricObject(){
        this("white",false);
        dateCreated=new Date();
    }
    public GeometricObject(String colour,boolean isFilled){
        this.colour=colour;
        this.isFilled=isFilled;
        dateCreated=new Date();
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

    public Date getDateCreated() {
        return dateCreated;
    }
    @Override
    public String toString(){
       return "created on:"+getDateCreated()+"is filled:"+isFilled()+
               "colour:"+getColour();
    }

}
