package figur;

public abstract class Figures {
    String name;

    public Figures(String name) {
        this.name = name;
    }

    public abstract void coordinates();
    public abstract double area();


}


