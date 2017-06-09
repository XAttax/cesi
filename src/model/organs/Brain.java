package model.organs;


import model.enums.Mood;

public class Brain implements Organ {


    private int MentalHealth;

    public int getMentalHealth() {
        return MentalHealth;
    }

    public setMentalHealth(int MentalHeal) {
        this.MentalHeal = MentalHeal;
    }

    @Override
    public void spendADay() {
        throw new UnsupportedOperationException();
    }

    public Mood getCurrentMood() {
        throw new UnsupportedOperationException();
    }

    public void setCurrentMood() {

    }

    public void setBrainWeight(int Weight) {
        this.Weight = Weight;
    }
}
