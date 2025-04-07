package figur;

import java.util.Random;

public class Square extends Figures {
    private int x;

    public Square(String name) {
        super(name);
    }

    @Override
    public void coordinates() {
        Random random = new Random();
        do {
            x = random.nextInt(20 + 1);
        }
        while (!isZero());
    }

    public boolean isZero() {
        return x != 0;
    }

    @Override
    public int area() {
        return this.x * this.x;
    }
}
