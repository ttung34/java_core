

interface Animal  {
    void suar();

    default void eat() {
        System.out.println("Ddoof anw");
    }

    public int Value = 20;

}

class Cat implements Animal {
    @Override
    public void suar() {
        System.out.println("Meow meow");
    }
    @Override
    public void eat() {
        System.out.println("Cas");
    }

}


public class Interface {
    public static void main(String[] args) {
        Animal cat = new  Cat();
        cat.suar();
        cat.eat();
        System.out.println(Animal.Value);
    }
}