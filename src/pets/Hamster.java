package pets;

public class Hamster extends Pet{

    protected Hamster(){
        super("Hroom");
    }

    public void hideFood(){
        System.out.println("Вся еда — в щёчках!");
    }
}
