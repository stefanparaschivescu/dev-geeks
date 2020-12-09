package exercise.Stefan;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Hero {
    private int life;
    private int power;
    private int defense;
    private int speed;
    private double luck;
    private ArrayList<SpecialPower> specialPowers;

    public Hero() {
        this.life = ThreadLocalRandom.current().nextInt(65, 90 + 1);
        this.power = ThreadLocalRandom.current().nextInt(60, 70 + 1);
        this.defense = ThreadLocalRandom.current().nextInt(40, 50 + 1);
        this.speed = ThreadLocalRandom.current().nextInt(40, 50 + 1);
        this.luck = ThreadLocalRandom.current().nextDouble(0.1, 0.3 + 0.01);
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getLuck() {
        return luck;
    }

    public void setLuck(double luck) {
        this.luck = luck;
    }

    public ArrayList<SpecialPower> getSpecialPowers() {
        return specialPowers;
    }

    public SpecialPower getSpecialPower(String nameOfSpecialPower) throws Exception {
        for (int i=0; i<specialPowers.size(); i++) {
            if (specialPowers.get(i).getName() == nameOfSpecialPower) {
                return specialPowers.get(i);
            }

        }
        throw new Exception("Name of Special Power doesn't exist");
    }

    public void addSpecialPower(String nameOfSpecialPower, String attribute, double chances, char operator, int number) {
        specialPowers.add(new SpecialPower(nameOfSpecialPower, chances));
    }
}
