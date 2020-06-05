package HW7;

public class Main {
    public static void main(String[] args) {
        Plate plate= new Plate(10);
        Cat[] cats = new Cat[]{
                new Cat("Cat", 10),
                new Cat("Cat1", 10),
                new Cat("Cat2", 10),
        };
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        plate.info();

    }

}
