package review.OOP.figure;

public abstract class Figures {
    private String firureName; // name
    private int [] coordinates; // coordinates

    public Figures(String firureName, int [] coordinates){
        this.firureName = firureName;
        this.coordinates = coordinates;
    }

    public String getFirureName(){ // function to get name
        return firureName;
    }

    public int[] getCoordinates(){ //function to get coordinates
        return coordinates;
    }

    public abstract double calculateArea(); // area calculation function
}
