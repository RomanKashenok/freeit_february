package superthis;

public class Cat extends Pet {

    private String breed;

    public Cat(String breed, String name) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void makeAction() {
        System.out.println("piss piss in tapki");
    }

    @Override
    public String toString() {
        return super.toString() + "Cat{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
