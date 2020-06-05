package HW7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void setFood(int sf) {
        if (sf <= 0) {
            System.out.println("Еда закончилась");
            food = 0;
        } else food = sf;
    }

    public int getFood () {
        return food;
    }

    public void decreaseFood ( int amount){
        setFood(food);
        food -= amount;
        this.info();
    }
    public void addFood(int af){
        food += af;
    }

    public void info () {
        System.out.println("Осталось еды: " + getFood());
    }
}
