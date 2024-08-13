package pets;

public class Cat extends Pet{

    protected Cat(){
        super("Meow");
    }

    public void catchMouse(){
        System.out.println("Поймала мышку!");
    }
}
