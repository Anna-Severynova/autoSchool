package review.OOP.figure;

public abstract class Figures {
    private String figureName; // name
    private int [] coordinates; // coordinates

    public Figures(String figureName, int [] coordinates){
        this.figureName = figureName;
        this.coordinates = coordinates;
    }
//
    public String getFigureName(){ // function to get name
        return figureName;
    }

    public int [] getCoordinates(){ //function to get coordinates
        return coordinates;
    }

    public abstract double calculateArea(); // area calculation function
}
