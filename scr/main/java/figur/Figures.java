package figur;

public abstract class Figures {
    String name;

    public Figures(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void coordinates();
    public abstract int area();
}


