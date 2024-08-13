package pets;

public class Dog extends Pet{

    protected Dog(){
        super("Woof");
    }

    public void bringStick(){
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}
