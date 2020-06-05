package HW7;

public class Cat {
    private String name;
    private int appetite;

    public boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (satiety == true) {
            System.out.println(name +": Не голоден");
        } else if (this.appetite > plate.getFood()) {
            System.out.println(name +": Мало еды");
        } else {
            System.out.println(name + ": поел");
            plate.decreaseFood(this.appetite);

        }
    }
}