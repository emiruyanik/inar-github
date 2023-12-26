package week_16.java;

public class TestOzgurMain {
    public enum Ozgur {
        GS, denver, lakers, lebron,
    }

    public Ozgur changeState(Ozgur input) {
        switch (input) {
            case GS -> {
                return Ozgur.denver;
            }
            case denver -> {
                return Ozgur.lakers;
            }
            case lakers, lebron -> {
                return Ozgur.lebron;
            }
            default -> {
                return null;
            }
        }

    }
}
