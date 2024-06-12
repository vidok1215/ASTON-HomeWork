package Lesson7;

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " еды.");
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
