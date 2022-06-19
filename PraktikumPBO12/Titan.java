package PraktikumPBO12;

public class Titan extends Character {
    public Titan() {
        super(200, 45, 0);
    }

    @Override
    public boolean attack() {
        return 1 <= getRandomNumber() && getRandomNumber() <= (0.4 * 10);
    }
}
