package model.organs;


public class Stomach implements Organ{

    private Animal animal;
    private int foodQuantityMax = 10; // Capacité de l'estomac
    private int foodQuantity = 0; // Nombre d'aliment actuellement dans l'estomac
    private int digestionSpeed = 1;

    public Stomach(Animal animal) {
        this.animal = animal;
    }

    /**
     * Return the current food amount in the stomach
     * @return
     */
    public int getCurrentFoodAmount() {
        return this.foodQuantity;
    }

    /**
     * Return the maximum amount of food this stomach can handle
     * @return
     */
    public int getMaxFoodAmount() {
        return this.foodQuantityMax;
    }

    /**
     * Return the amount of food that this stomach will digest each day
     * @return
     */
    public int getDigestionSpeed() {
        return this.digestionSpeed;
    }

    /**
     * Return a boolean to say if the stomach is full.
     * isFull() <=> getCurrentFoodAmount() == getMaxFoodAmount()
     * @return
     */
    public boolean isFull() {
        return this.getCurrentFoodAmount() == this.getMaxFoodAmount();
    }

    /**
     * Put a specific amount of food into this stomach.
     * @param quantity
     */
    public void fill(int quantity) {
        this.foodQuantity += quantity;
    }

    /**
     * Consumes one unit of food.
     */
    public void digest() {
        this.foodQuantity -= this.digestionSpeed;
        this.animal.setEnergy(this.animal.getEnergy()+this.digestionSpeed);
    }

    /**
     * Set the amount of food that this stomach will digest each day
     * @return
     */
    public void setDigestionSpeed(int quantity) {
        this.digestionSpeed = quantity;
    }

    @Override
    public void spendADay() {
        this.digest(); // L'animal digère tous les jours
    }
}
