package inheritance;

public class Cat extends Pet{

    private String breed;

    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void voice() {
        System.out.println("Meooowwwww Meooowwwww");
    }

    public void jump() {
        System.out.println("Я прыгаю просто так. Я же кот...");
    }

    public void jump(int repeats) {
        System.out.println("Я прыгаю " + repeats + " раз!");
    }

    public void jump(int repeats, String barrier) {
        System.out.println("Я прыгаю " + repeats + " раз! Через " + barrier);
    }
}
