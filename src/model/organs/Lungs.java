package model.organs;


public class Lungs implements Organ {
    public int getCurrentStateAmount() {
        throw new UnsupportedOperationException();
    }

    public void upgradeCurrentState(int energyAmount) {
        throw new UnsupportedOperationException();
    }

    public void downgradeCurrentState(int energyAmount) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void spendADay() {
        throw new UnsupportedOperationException();
    }
}
