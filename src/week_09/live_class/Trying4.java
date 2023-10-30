package week_09.live_class;

public class Trying4 {
    public static void main(String[] args) {
    Student s1=new Student(12345,"ahmet");
    java.util.Date getDateCreated=s1.getDateCreated();
        System.out.println(getDateCreated);
        getDateCreated.setTime(15454556541L);
        System.out.println(getDateCreated);
        java.util.Date getDateCreated2=s1.getDateCreated();
        System.out.println(getDateCreated2);
    }
    }

