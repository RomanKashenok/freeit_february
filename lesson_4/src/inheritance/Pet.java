package inheritance;

public class Pet extends Animal {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Скребуся по ламинату");
    }

    public void jump() {
        System.out.println("Я прыгаю");
    }
}
