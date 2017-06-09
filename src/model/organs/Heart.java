package model.organs;


public class Heart implements Organ {

    private int _energy;

    public int getEnergyAmount() {
        return _energy;
    }

    public void addEnergy(int energyAmount) {
        _energy = energy + energyAmount;
    }

    public void removeEnergy(int energyAmount) {
        int reste = _energy - energyAmount;

        if(reste =< 0){
            isAlive == false;
        }
        else{
            _energy = reste;
        }
    }

    @Override
    public void spendADay() {
        _energy = _energy -1;
    }
}
